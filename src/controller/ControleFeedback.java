package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import model.BancoFeedback;
import model.Feedback;
import model.Funcionario;

public class ControleFeedback {

    private BancoFeedback bancoFeedback = new BancoFeedback();
    SimpleDateFormat converteData = new SimpleDateFormat("dd/MM/yyyy");

    public String salvar(String assunto, String laboratorio, String descricao, Funcionario funcionario) {

        if (assunto.equals("") || descricao.equals("") || laboratorio.equals("-------")) {
            return "Preencha todos os campos!!";
        } else {
            Feedback f = new Feedback();
            f.setAssunto(assunto);
            f.setLaboratorio(laboratorio);
            f.setDescricao(descricao);
            f.setSiape(funcionario);
            f.setStatus("Pendente");
            String aux = converteData.format(new Date());
            try {
                f.setData(converteData.parse(aux));
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro : " + erro, "Control Lab Avisa", ERROR_MESSAGE);
            }
            return bancoFeedback.salvar(f);
        }
    }
    
    public String alterar(Feedback feedback) {
        return bancoFeedback.alterar(feedback);
    }

    public List<Feedback> atualizar(String pesquisa) {
        return bancoFeedback.atualizar(pesquisa);
    }
    
    public Feedback recuperarCancelarFeedback (int linhaTabela){
        return bancoFeedback.recuperarCancelarFeedback(linhaTabela);
    }
    
    public String removerFeedback (Feedback feedback){
        return bancoFeedback.remover(feedback);
    }
}