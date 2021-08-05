package model;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class BancoFeedback {

    EntityManager conexao = BancoDeDados.getconexao();

    public String salvar(Feedback f) {
        try {
            conexao.getTransaction().begin();
            conexao.persist(f);
            conexao.getTransaction().commit();
            return "Feedback salvo com sucesso!";

        } catch (Exception erro) {
            conexao.getTransaction().rollback();
            return "Erro ao salvar Feedback\nErro: " + erro;
        }
    }

    public String remover(Feedback f) {
        try {
            conexao.getTransaction().begin();
            conexao.remove(f);
            conexao.getTransaction().commit();
            return "Feedback removido com sucesso!";

        } catch (Exception erro) {
            conexao.getTransaction().rollback();
            return "Erro ao remover Feedback\nErro: " + erro;
        }
    }

    public String alterar(Feedback f) {
        try {
            conexao.getTransaction().begin();
            conexao.merge(f);
            conexao.getTransaction().commit();
            return "Feedback alterado com sucesso!";

        } catch (Exception erro) {
            conexao.getTransaction().rollback();
            return "Erro ao alterar Feedback!\nErro: " + erro;

        }
    }

    public List<Feedback> atualizar(String pesquisa) {

        Query q = conexao.createNativeQuery("select * from Feedback order by data, assunto", Feedback.class);
        return q.getResultList();
    }

    public Feedback recuperarFeedback(String nome, String laboratorio, int maquina, Date data) {

        Query q = conexao.createNativeQuery("select * from Feedback where nome = :arg1 and "
                + "laboratorio = :arg2 and maquina = :arg3 and data = :arg4", Feedback.class);
        q.setParameter("arg1", nome);
        q.setParameter("arg2", laboratorio);
        q.setParameter("arg3", maquina);
        q.setParameter("arg4", data);

        return q.getResultList().size() > 0 ? (Feedback) q.getResultList().get(0) : null;

    }

    public Feedback recuperarCancelarFeedback(int linha) {
        Query q = conexao.createNativeQuery("select * from Feedback order by data, assunto", Feedback.class);
        return q.getResultList().size() > 0 ? (Feedback) q.getResultList().get(linha) : null;
    }

    public List<Feedback> relatorio(Date dataInicial, Date dataFinal) {

        Query q = conexao.createNativeQuery("select * from feedback \n"
                + "where data >= :arg1 and data <= :arg2\n"
                + "order by data, assunto", Feedback.class);
        q.setParameter("arg1", dataInicial);
        q.setParameter("arg2", dataFinal);

        return q.getResultList();
    }
}