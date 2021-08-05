package controller;

import java.awt.Image;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.BancoFeedback;
import model.BancoReserva;
import model.Feedback;
import model.Reserva;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class ControleRelatorio {

    BancoReserva conexao = new BancoReserva();
    BancoFeedback conexaoFeedback = new BancoFeedback();

//    public void preencherRelatorioCompleto() {
//
//        try {
//            //List<Atividades> lista = banco.preencherRelatorioCompleto();
//            InputStream relatorio = this.getClass().getResourceAsStream("/relatorio/arquivos/relatorioAtividades.jasper");
//            HashMap parametros = new HashMap();
//            Image logo = new ImageIcon(getClass().getResource("/relatorio/arquivos/logo.jpg")).getImage();
//            parametros.put("logo", logo);
//            JRBeanCollectionDataSource conn = new JRBeanCollectionDataSource(lista);
//            JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, conn);
//            JasperViewer view = new JasperViewer(impressao, false);
//            view.setVisible(true);
//        } catch (Exception erro) {
//            JOptionPane.showMessageDialog(null, "Problema ao gerar Relatorio.\nErro: " + erro);
//        }
//    }

    //Print p = new Print();
    //p.gerarRelatorio(lista, "relReserva.jasper", "logo.jpeg", "relatorio.pdf");
    //p.exibirPDF("relatorio.pdf");
    //p.gerarRelatorio(lista, "relFeedback.jasper", "logo.jpeg", "relatorio.pdf");
    //p.exibirPDF("relatorio.pdf");

    public void gerarRelatorio(Date dataInicial, Date dataFinal, boolean tipoRelatorio) {

        if (tipoRelatorio == true) {
            List<Reserva> lista = conexao.relatorio(dataInicial, dataFinal);

            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhuma reserva cadastrada entre esses dias!");
            } else {
                try {
                    InputStream relatorioReserva = this.getClass().getResourceAsStream("/controller/arquivos/relatorioReservas.jasper");
                    HashMap parametros = new HashMap();
                    Image logo = new ImageIcon(getClass().getResource("/view/imagens/logoRelatorio.jpg")).getImage();
                    parametros.put("logo", logo);
                    JRBeanCollectionDataSource conn = new JRBeanCollectionDataSource(lista);
                    JasperPrint impressao;
                    impressao = JasperFillManager.fillReport(relatorioReserva, parametros, conn);
                    JasperViewer view = new JasperViewer(impressao, false);
                    view.setVisible(true);
                } catch (Exception ex) {
                    System.out.println("ERRO RELATÓRIO");
                    Logger.getLogger(ControleRelatorio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            List<Feedback> lista = conexaoFeedback.relatorio(dataInicial, dataFinal);
            
            ArrayList<String> lista_nome = new ArrayList();
            for (Feedback feedback : lista) {
                lista_nome.add(feedback.getSiape().getNome());                
            }
            
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum feedback enviado entre esses dias!");
            } else {

                try {
                    InputStream relatorioFeedback = this.getClass().getResourceAsStream("/controller/arquivos/relatorioFeedback.jasper");
                    HashMap parametros = new HashMap();
                    Image logo = new ImageIcon(getClass().getResource("/view/imagens/logoRelatorio.jpg")).getImage();
                    parametros.put("logo", logo);
                    parametros.put("nome_funcionario", lista_nome);
                    JRBeanCollectionDataSource conn = new JRBeanCollectionDataSource(lista);
                    JasperPrint impressao;
                    impressao = JasperFillManager.fillReport(relatorioFeedback, parametros, conn);
                    JasperViewer view = new JasperViewer(impressao, false);
                    view.setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(ControleRelatorio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}