package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class BancoFuncionario {
    
    EntityManager conexao = BancoDeDados.getconexao();
    
    public String salvar(Funcionario f) {
        try {
            conexao.getTransaction().begin();
            conexao.persist(f);
            conexao.getTransaction().commit();
            return "Funcionário cadastrado com sucesso!";
        } catch (Exception erro) {
            conexao.getTransaction().rollback();
            return "Erro ao salvar Funcionário\nErro: "+erro;
        }
    }
    
    public String alterar(Funcionario f) {
        try {
            conexao.getTransaction().begin();
            conexao.merge(f);
            conexao.getTransaction().commit();
            return "Cadastro alterado com sucesso!";

        } catch (Exception erro) {
            conexao.getTransaction().rollback();
            return "Erro ao alterar cadastro!\nErro: "+erro;

        }
    }
    
    public String apagar(Funcionario f) {

        try {
            conexao.getTransaction().begin();
            conexao.remove(f);
            conexao.getTransaction().commit();
            return "Funcionario apagado com sucesso!";
        } catch (Exception erro) {
            conexao.getTransaction().rollback();
            return "Erro ao cancelar a reserva!\nErro: "+erro;
        }

    }
    
    public Funcionario recuperar(String siape) {
        Query q = conexao.createNativeQuery("select * from Funcionario where siape = :arg", Funcionario.class);
        q.setParameter("arg", siape);
        return q.getResultList().size() > 0 ? (Funcionario) q.getResultList().get(0) : null;
    }
    
    public String[] verificarLogin(String siape, String senha) {

        Query q1 = conexao.createNativeQuery("select * from Funcionario where siape = :arg1 and senha = :arg2 and admin = true", Funcionario.class);
        q1.setParameter("arg1", siape);
        q1.setParameter("arg2", senha);
        
        Query q2 = conexao.createNativeQuery("select * from Funcionario where siape = :arg1 and senha = :arg2 and admin = false", Funcionario.class);
        q2.setParameter("arg1", siape);
        q2.setParameter("arg2", senha);
        
        if (q1.getResultList().size() == 1) {
            Funcionario f;
            f = q1.getResultList().size() > 0 ? (Funcionario) q1.getResultList().get(0) : null;
            String[] retorno = {"admin",f.getNome(),f.getSiape()};
            return retorno;
        } else if (q2.getResultList().size() == 1){
            Funcionario f;
            f = q2.getResultList().size() > 0 ? (Funcionario) q2.getResultList().get(0) : null;
            String[] retorno = {"noAdmin",f.getNome(),f.getSiape()};
            return retorno;
        }else{
            String[] retorno = {"noCadastrado"};
            return retorno;
        }   
    }
    
    public List<Funcionario> listar() {
        Query q = conexao.createNativeQuery("select * from Funcionario order by nome", Funcionario.class);
        return q.getResultList();
    }
    
    public String recuperarSiape(String nome) {

        Query q = conexao.createNativeQuery("select * from Funcionario where nome = :arg", Funcionario.class);
        q.setParameter("arg", nome);
        
        Funcionario f = new Funcionario();
        f = q.getResultList().size() > 0 ? (Funcionario) q.getResultList().get(0) : null;
        return f.getSiape();
    }
    
    public boolean verificarSiape(String verificarSiape) {

        Query q = conexao.createNativeQuery("select * from Funcionario where siape = :arg", Funcionario.class);
        q.setParameter("arg", verificarSiape);

        return q.getResultList().size() == 0;
    }
    
    public Funcionario recuperarFuncionario(String nome) {

        Query q = conexao.createNativeQuery("select * from Funcionario where nome = :arg", Funcionario.class);
        q.setParameter("arg", nome);
        return q.getResultList().size() > 0 ? (Funcionario) q.getResultList().get(0) : null;
        
    }
    
}