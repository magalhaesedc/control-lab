/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.BancoReserva;
import controller.ControleReserva;
import model.Reserva;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author edson
 */
public class TelaAlterarReserva extends javax.swing.JFrame {

    /**
     * Creates new form TelaAlterarReserva
     */
    public TelaAlterarReserva(Reserva r) {
        initComponents();
        iconeTitulo();
        perguntarSair();
        corFundo();
        txt_id.setText(Integer.toString(r.getId()));
        txt_nome.setText(r.getNome());
        txt_siape.setText(r.getSiape().getSiape());
        cp_dataReservaAlterar.setDate(r.getDataReserva());
        cp_horaEntradaAlterar.setSelectedItem(r.getHorarioEntradaReserva().toString().substring(0, 2));
        cp_minutoEntradaAlterar.setSelectedItem(r.getHorarioEntradaReserva().toString().substring(3, 5));
        cp_horaSaidaAlterar.setSelectedItem(r.getHorarioSaidaReserva().toString().substring(0, 2));
        cp_minutoSaidaAlterar.setSelectedItem(r.getHorarioSaidaReserva().toString().substring(3, 5));
        cp_laboratorioReservaAlterar.setSelectedItem(r.getLaboratorio());
        cp_propositoAlterar.setText(r.getProposito());
    }

    public void corFundo() {
        this.getContentPane().setBackground(new Color(102, 102, 102));
        bt_cancelarAlterar.setBackground(new Color(255, 255, 255));
        bt_salvarAlteracao.setBackground(new Color(255, 255, 255));
    }

    public void iconeTitulo() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image imagem = kit.getImage(getClass().getResource("/view/imagens/logoTitulo.png"));
        setIconImage(imagem);
    }

    public void perguntarSair() {
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                if (e.getID() == WindowEvent.WINDOW_CLOSING) {
                    int selectedOption = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Control Lab Avisa", YES_NO_OPTION, QUESTION_MESSAGE);
                    if (selectedOption == JOptionPane.YES_OPTION) {
                        dispose();
                    }
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cp_horaEntradaAlterar = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cp_laboratorioReservaAlterar = new javax.swing.JComboBox<>();
        cp_minutoEntradaAlterar = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        cp_horaSaidaAlterar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cp_propositoAlterar = new javax.swing.JTextPane();
        cp_minutoSaidaAlterar = new javax.swing.JComboBox<>();
        cp_dataReservaAlterar = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JLabel();
        txt_siape = new javax.swing.JLabel();
        bt_cancelarAlterar = new javax.swing.JButton();
        bt_salvarAlteracao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Alterar Reserva - Control Lab");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(470, 530));

        cp_horaEntradaAlterar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        cp_horaEntradaAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cp_horaEntradaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_horaEntradaAlterarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Horário de Entrada:");

        jLabel23.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Laboratório:");

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("min");

        cp_laboratorioReservaAlterar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        cp_laboratorioReservaAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------", "Informática - BLOCO A", "Informática - BLOCO B", "Informática - BLOCO C", "Redes - BLOCO A" }));
        cp_laboratorioReservaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_laboratorioReservaAlterarActionPerformed(evt);
            }
        });

        cp_minutoEntradaAlterar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        cp_minutoEntradaAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cp_minutoEntradaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_minutoEntradaAlterarActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("h");

        cp_horaSaidaAlterar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        cp_horaSaidaAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cp_horaSaidaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_horaSaidaAlterarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("h");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Horário de Saída:");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Propósito:");

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("min");

        cp_propositoAlterar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jScrollPane1.setViewportView(cp_propositoAlterar);

        cp_minutoSaidaAlterar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        cp_minutoSaidaAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cp_minutoSaidaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_minutoSaidaAlterarActionPerformed(evt);
            }
        });

        cp_dataReservaAlterar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data da Reserva:");

        txt_nome.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txt_nome.setForeground(new java.awt.Color(255, 255, 255));
        txt_nome.setText("Nome Reserva");

        txt_siape.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txt_siape.setForeground(new java.awt.Color(255, 255, 255));
        txt_siape.setText("4444444");

        bt_cancelarAlterar.setBackground(new java.awt.Color(51, 51, 51));
        bt_cancelarAlterar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        bt_cancelarAlterar.setText("Cancelar");
        bt_cancelarAlterar.setBorder(null);
        bt_cancelarAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_cancelarAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarAlterarActionPerformed(evt);
            }
        });

        bt_salvarAlteracao.setBackground(new java.awt.Color(51, 51, 51));
        bt_salvarAlteracao.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        bt_salvarAlteracao.setText("Salvar");
        bt_salvarAlteracao.setBorder(null);
        bt_salvarAlteracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_salvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarAlteracaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("-");

        txt_id.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txt_id.setForeground(new java.awt.Color(255, 255, 255));
        txt_id.setText("44");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_siape)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_id))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel4)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_cancelarAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_salvarAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cp_horaEntradaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cp_horaSaidaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cp_minutoEntradaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cp_minutoSaidaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(cp_laboratorioReservaAlterar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cp_dataReservaAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txt_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_siape)
                    .addComponent(jLabel1)
                    .addComponent(txt_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cp_dataReservaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cp_horaEntradaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(cp_horaSaidaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(cp_minutoEntradaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cp_minutoSaidaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cp_laboratorioReservaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_salvarAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cancelarAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cp_horaEntradaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_horaEntradaAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_horaEntradaAlterarActionPerformed

    private void cp_minutoEntradaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_minutoEntradaAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_minutoEntradaAlterarActionPerformed

    private void cp_horaSaidaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_horaSaidaAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_horaSaidaAlterarActionPerformed

    private void cp_minutoSaidaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_minutoSaidaAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_minutoSaidaAlterarActionPerformed

    private void bt_cancelarAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarAlterarActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Control Lab Avisa", YES_NO_OPTION, QUESTION_MESSAGE);
        if (selectedOption == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_bt_cancelarAlterarActionPerformed

    private void bt_salvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarAlteracaoActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar a reserva?", "Control Lab Avisa", YES_NO_OPTION, QUESTION_MESSAGE);
        if (selectedOption == JOptionPane.YES_OPTION) {
            if (cp_dataReservaAlterar.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!!");
            }

            String msg = "";
            String proposito = cp_propositoAlterar.getText();
            String laboratorio = cp_laboratorioReservaAlterar.getSelectedItem().toString();

            Date auxDataReserva = cp_dataReservaAlterar.getDate();
            String aux2DataReserva = converteData.format(auxDataReserva);

            String horaEntrada = cp_horaEntradaAlterar.getSelectedItem().toString();
            String minutoEntrada = cp_minutoEntradaAlterar.getSelectedItem().toString();
            String horaSaida = cp_horaSaidaAlterar.getSelectedItem().toString();
            String minutoSaida = cp_minutoSaidaAlterar.getSelectedItem().toString();

            try {
                Date dataReserva = converteData.parse(aux2DataReserva);
                Date horarioEntradaReserva = converteHora.parse(horaEntrada + ":" + minutoEntrada);
                Date horarioSaidaReserva = converteHora.parse(horaSaida + ":" + minutoSaida);
                msg = controleReserva.alterar(Integer.parseInt(txt_id.getText()),dataReserva, horarioEntradaReserva, horarioSaidaReserva,txt_nome.getText().toString(), proposito,txt_siape.getText(), laboratorio);
                JOptionPane.showMessageDialog(this, msg);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Data ou Hora inválidas!");
            }
            if(msg == "Reserva alterada com sucesso!"){
                dispose();
            }
        }

    }//GEN-LAST:event_bt_salvarAlteracaoActionPerformed

    private void cp_laboratorioReservaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_laboratorioReservaAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_laboratorioReservaAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaAlterarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelarAlterar;
    private javax.swing.JButton bt_salvarAlteracao;
    private com.toedter.calendar.JDateChooser cp_dataReservaAlterar;
    private javax.swing.JComboBox<String> cp_horaEntradaAlterar;
    private javax.swing.JComboBox<String> cp_horaSaidaAlterar;
    private javax.swing.JComboBox<String> cp_laboratorioReservaAlterar;
    private javax.swing.JComboBox<String> cp_minutoEntradaAlterar;
    private javax.swing.JComboBox<String> cp_minutoSaidaAlterar;
    private javax.swing.JTextPane cp_propositoAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt_id;
    private javax.swing.JLabel txt_nome;
    private javax.swing.JLabel txt_siape;
    // End of variables declaration//GEN-END:variables

    BancoReserva bancoReserva = new BancoReserva();
    ControleReserva controleReserva = new ControleReserva();
    SimpleDateFormat converteData = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat converteHora = new SimpleDateFormat("HH:mm");

}
