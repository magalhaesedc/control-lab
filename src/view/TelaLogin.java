package view;

import controller.ControleJson;
import controller.ControleSenha;
import controller.ControleVariaveis;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import model.BancoFuncionario;

public class TelaLogin extends javax.swing.JFrame {
    
    /**
     * Creates new form PrimeiraTela
     */
    public TelaLogin() {
        initComponents();
        corFundo();
        iconeTitulo();
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bt_fechar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_entrarLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cp_senhaLogin = new javax.swing.JPasswordField();
        cp_siapeLogin = new javax.swing.JFormattedTextField();

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

        bt_entrarLogin.setBackground(new java.awt.Color(51, 51, 51));
        bt_entrarLogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        bt_entrarLogin.setForeground(new java.awt.Color(255, 255, 255));
        bt_entrarLogin.setText("Entrar");
        bt_entrarLogin.setBorder(null);
        bt_entrarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_entrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_entrarLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senha");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Siape");

        cp_senhaLogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cp_senhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_senhaLoginActionPerformed(evt);
            }
        });

        try {
            cp_siapeLogin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cp_siapeLogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cp_siapeLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_siapeLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(192, 192, 192))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cp_senhaLogin)
                            .addComponent(cp_siapeLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(bt_entrarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(bt_entrarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cp_siapeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cp_senhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            System.exit(0);
        }
    }//GEN-LAST:event_bt_fecharMouseClicked

    private void bt_entrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_entrarLoginActionPerformed
    
        String siape = cp_siapeLogin.getValue().toString();
        String senhaAux = new String(cp_senhaLogin.getPassword()).toString();
        String senha = controleSenha.criptografar(senhaAux);
        
        if (new String(cp_senhaLogin.getPassword()).isEmpty() || cp_siapeLogin.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Control Lab Avisa", INFORMATION_MESSAGE);
        } else {    
            
            String[] login = bancoFuncionario.verificarLogin(siape, senha);
            
            if(siape.equals("0000000") && senha.equals(controleJson.lerSenha())){
                ControleVariaveis controleVariaveis = new ControleVariaveis();
                controleVariaveis.setNomeTop("Acesso Administrativo");
                controleVariaveis.setSiapeTop("0000000");
                TelaPrincipalAdministrador telaPrincipalAdministrador = new TelaPrincipalAdministrador();
                telaPrincipalAdministrador.preencherTop(controleVariaveis);
                
                dispose();
                
                telaPrincipalAdministrador.setVisible(true);
            }else if (login[0] == "admin") {
                ControleVariaveis controleVariaveis = new ControleVariaveis();
                controleVariaveis.setNomeTop(login[1]);
                controleVariaveis.setSiapeTop(login[2]);
                
                TelaPrincipalAdministrador telaPrincipalAdministrador = new TelaPrincipalAdministrador();
                telaPrincipalAdministrador.preencherTop(controleVariaveis);
                
                dispose();
                
                telaPrincipalAdministrador.setVisible(true);
            
            } else if (login[0] == "noAdmin") {

                ControleVariaveis controleVariaveis = new ControleVariaveis();
                controleVariaveis.setNomeTop(login[1]);
                controleVariaveis.setSiapeTop(login[2]);

                TelaPrincipalFuncionario telaPrincipalFuncionario = new TelaPrincipalFuncionario();
                telaPrincipalFuncionario.preencherTop(controleVariaveis);

                dispose();

                telaPrincipalFuncionario.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Dados Incorretos!!!\nVerifique o siape e/ou a senha.", "Control Lab Avisa", WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_bt_entrarLoginActionPerformed

    private void cp_siapeLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_siapeLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_siapeLoginActionPerformed

    private void cp_senhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_senhaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_senhaLoginActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_entrarLogin;
    private javax.swing.JLabel bt_fechar;
    private javax.swing.JPasswordField cp_senhaLogin;
    private javax.swing.JFormattedTextField cp_siapeLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    ControleJson controleJson = new ControleJson();
    ControleVariaveis controleVariaveis = new ControleVariaveis();
    ControleSenha controleSenha = new ControleSenha();
    BancoFuncionario bancoFuncionario = new BancoFuncionario();

}