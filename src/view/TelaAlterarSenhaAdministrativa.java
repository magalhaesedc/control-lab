package view;

import controller.ControleJson;
import model.BancoFuncionario;
import model.Funcionario;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import controller.ControleSenha;

public class TelaAlterarSenhaAdministrativa extends javax.swing.JFrame {

    /**
     * Creates new form PrimeiraTela
     */
    public TelaAlterarSenhaAdministrativa() {
        initComponents();
        corFundo();
        iconeTitulo();
        perguntarSair();
    }

    public void iconeTitulo() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image imagem = kit.getImage(getClass().getResource("/view/imagens/logoTitulo.png"));
        setIconImage(imagem);
    }

    public void corFundo() {
        this.getContentPane().setBackground(new Color(102, 102, 102));
        bt_fechar.setBackground(new Color(255, 255, 255));
    }

    public String[] setarNomeSiape(Funcionario f) {
        String[] nomeSiape = {f.getNome(), f.getSiape()};
        return nomeSiape;
    }

    public void perguntarSair() {
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                if (e.getID() == WindowEvent.WINDOW_CLOSING) {
                    int selectedOption = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar?", "Control Lab Avisa", YES_NO_OPTION, QUESTION_MESSAGE);
                    if (selectedOption == JOptionPane.YES_OPTION) {
                        dispose();
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bt_fechar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_alterarSenha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cp_repetirSenha = new javax.swing.JPasswordField();
        cp_novaSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        cp_senhaAtual = new javax.swing.JPasswordField();

        jButton1.setText("jButton1");

        setTitle("Configuração de IP - Control Lab");
        setBackground(new java.awt.Color(51, 255, 255));
        setUndecorated(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bering", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ControLab");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bt_fechar.setBackground(new java.awt.Color(255, 0, 0));
        bt_fechar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_fechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_fechar.setText("X");
        bt_fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_fecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/iconeLogoTelaPequena.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/iconeUsuarioAdministrador.png"))); // NOI18N

        bt_alterarSenha.setBackground(new java.awt.Color(51, 51, 51));
        bt_alterarSenha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        bt_alterarSenha.setForeground(new java.awt.Color(255, 255, 255));
        bt_alterarSenha.setText("Alterar");
        bt_alterarSenha.setBorder(null);
        bt_alterarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_alterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarSenhaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Repetir Senha:");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nova Senha:");

        cp_repetirSenha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cp_repetirSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_repetirSenhaActionPerformed(evt);
            }
        });

        cp_novaSenha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cp_novaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_novaSenhaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Senha Atual:");

        cp_senhaAtual.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cp_senhaAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_senhaAtualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(103, 103, 103))
                                .addComponent(cp_senhaAtual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(103, 103, 103))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bt_alterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cp_repetirSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cp_novaSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cp_novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cp_repetirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(bt_alterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cp_senhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6)))
                        .addGap(81, 81, 81)))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void bt_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_fecharMouseClicked
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?", "Control Lab Avisa", YES_NO_OPTION, QUESTION_MESSAGE);

        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_bt_fecharMouseClicked

    private void bt_alterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarSenhaActionPerformed

        String senhaAtual = new String(cp_senhaAtual.getPassword()).trim();
        String novaSenha = new String(cp_novaSenha.getPassword()).trim();
        String repetirSenha = new String(cp_repetirSenha.getPassword()).trim();

        String senhaAdministrativa = controleJson.lerSenha();

        if (senhaAtual.isEmpty() || novaSenha.isEmpty() || repetirSenha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos!", "Control Lab Avisa", INFORMATION_MESSAGE);
        } else if (!controleSenha.criptografar(senhaAtual).equals(senhaAdministrativa)) {
            JOptionPane.showMessageDialog(null, "Senha atual inválida!", "Control Lab Avisa", INFORMATION_MESSAGE);
        } else if (!novaSenha.equals(repetirSenha)) {
            JOptionPane.showMessageDialog(null, "Senhas não coincidem!", "Control Lab Avisa", INFORMATION_MESSAGE);
        } else {
            boolean senhaAlterada = controleJson.alterarSenha(controleSenha.criptografar(novaSenha));

            if (senhaAlterada) {
                JOptionPane.showMessageDialog(null, "Senha administrativa alterada com sucesso.", "Control Lab Avisa", INFORMATION_MESSAGE);
                dispose();
            }
        }
    }//GEN-LAST:event_bt_alterarSenhaActionPerformed

    private void cp_repetirSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_repetirSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_repetirSenhaActionPerformed

    private void cp_novaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_novaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_novaSenhaActionPerformed

    private void cp_senhaAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_senhaAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_senhaAtualActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterarSenhaAdministrativa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_alterarSenha;
    private javax.swing.JLabel bt_fechar;
    private javax.swing.JPasswordField cp_novaSenha;
    private javax.swing.JPasswordField cp_repetirSenha;
    private javax.swing.JPasswordField cp_senhaAtual;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    ControleSenha controleSenha = new ControleSenha();
    ControleJson controleJson = new ControleJson();
    BancoFuncionario bancoFuncionario = new BancoFuncionario();

}
