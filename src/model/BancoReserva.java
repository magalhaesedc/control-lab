package model;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class BancoReserva {
    
    EntityManager conexao = BancoDeDados.getconexao();
    
    public String cadastar(Reserva r) {

        try {
            conexao.getTransaction().begin();
            conexao.persist(r);
            conexao.getTransaction().commit();
            return "Reserva cadastrada com sucesso!";
        } catch (Exception erro) {
            conexao.getTransaction().rollback();
            return "Erro ao cadastrar a reserva!!!\nErro: "+erro;
        }

    }
    
    public String alterar (Reserva r){
        try{
            conexao.getTransaction().begin();
            conexao.merge(r);
            conexao.getTransaction().commit();
            return "Reserva alterada com sucesso!";
        }catch(Exception erro){
            conexao.getTransaction().rollback();
            return "Erro ao alterar reserva!\nErro: "+erro;
        }
        
    }
    
    public String cancelarReserva(Reserva r) {

        try {
            conexao.getTransaction().begin();
            conexao.remove(r);
            conexao.getTransaction().commit();
            return "Reserva cancelada com sucesso!";
        } catch (Exception e) {
            conexao.getTransaction().rollback();
            return "Erro ao cancelar a reserva!!!";
        }

    }
    
    public boolean verificarHorario(Date dataReserva, Date horarioEntradaReserva, Date horarioSaidaReserva, String laboratorio) {

        Query q = conexao.createNativeQuery("select * from Reserva where dataReserva = :arg1 and laboratorio = :arg4 and (horarioEntradaReserva between :arg2 and :arg3 or "
                + "horarioSaidaReserva between :arg2 and :arg3 or "
                + "horarioEntradaReserva < :arg2 and horarioEntradaReserva < :arg2 and "
                + "horarioSaidaReserva > :arg2 and horarioSaidaReserva > :arg3)", Reserva.class);
        q.setParameter("arg1", dataReserva);
        q.setParameter("arg2", horarioEntradaReserva);
        q.setParameter("arg3", horarioSaidaReserva);
        q.setParameter("arg4", laboratorio);

        return q.getResultList().size() == 0;
    }
    
    public List<Reserva> pesquisar(String pesquisa) {

        Query q = conexao.createNativeQuery("select * from Reserva where nome like :arg or siape_siape like :arg order by dataReserva, horarioEntradaReserva, horarioSaidaReserva, nome", Reserva.class);
        q.setParameter("arg", pesquisa + "%");

        return q.getResultList();
    }
    
    public Reserva recuperarReserva(Date dataReserva, Date horarioEntradaReserva, Date horarioSaidaReserva) {

        Query q = conexao.createNativeQuery("select * from Reserva where dataReserva = :arg1 and horarioEntradaReserva = :arg2 "
                + "and horarioSaidaReserva = :arg3", Reserva.class);
        q.setParameter("arg1", dataReserva);
        q.setParameter("arg2", horarioEntradaReserva);
        q.setParameter("arg3", horarioSaidaReserva);

        return q.getResultList().size() > 0 ? (Reserva) q.getResultList().get(0) : null;
    }
    
    public List<Reserva> relatorio(Date dataInicial, Date dataFinal) {

        Query q = conexao.createNativeQuery("select * from Reserva \n"
                + "where dataReserva >= :arg1 and dataReserva <= :arg2 order by dataReserva, horarioEntradaReserva", Reserva.class);
        q.setParameter("arg1", dataInicial);
        q.setParameter("arg2", dataFinal);
        return q.getResultList();

    }
}
