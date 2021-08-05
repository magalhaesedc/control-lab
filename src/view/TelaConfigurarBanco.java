package view;

import controller.ControleJson;
import controller.ControleSenha;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.JPasswordField;
import model.BancoDeDados;

public class TelaConfigurarBanco extends javax.swing.JFrame {

    /**
     * Creates new form PrimeiraTela
     */
    public TelaConfigurarBanco() {
        initComponents();
        corFundo();
        iconeTitulo();
        JOptionPane.showMessageDialog(this, "Erro ao conectar no Banco de Dados!", "Control Lab Avisa", ERROR_MESSAGE);
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
        bt_configurarBanco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cp_senhaBanco = new javax.swing.JPasswordField();
        cp_ipServidor = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cp_bancoDeDados = new javax.swing.JTextField();
        cp_usuario = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        bt_configurarBanco.setBackground(new java.awt.Color(51, 51, 51));
        bt_configurarBanco.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        bt_configurarBanco.setForeground(new java.awt.Color(255, 255, 255));
        bt_configurarBanco.setText("Confirmar Configuração");
        bt_configurarBanco.setBorder(null);
        bt_configurarBanco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_configurarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_configurarBancoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senha do Banco de Dados");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IP do Servidor");

        cp_senhaBanco.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        try {
            cp_ipServidor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cp_ipServidor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuário");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Banco de Dados");

        cp_bancoDeDados.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cp_bancoDeDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_bancoDeDadosActionPerformed(evt);
            }
        });

        cp_usuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cp_senhaBanco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cp_ipServidor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cp_bancoDeDados, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cp_usuario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(58, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_configurarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cp_bancoDeDados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cp_ipServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cp_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cp_senhaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(bt_configurarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void bt_configurarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_configurarBancoActionPerformed

        String senhaRecuperadaCampo = new String(cp_senhaBanco.getPassword()).trim();
        String bancoDeDados = cp_bancoDeDados.getText().trim();
        String ip = null;
        if (cp_ipServidor.getValue() != null) {
            ip = cp_ipServidor.getValue().toString();
        }
        String usuario = cp_usuario.getText().trim();

        if (senhaRecuperadaCampo.isEmpty() || ip == null || bancoDeDados.isEmpty() || usuario.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Control Lab Avisa", INFORMATION_MESSAGE);

        } else {

            String senhaAdministrativa = controleJson.lerSenha();

            //Mostrar campo de senha no JOptionPane
            JLabel label = new JLabel("Digite a senha ADMINISTRATIVA:");
            JPasswordField jpf = new JPasswordField();
            JOptionPane.showConfirmDialog(null, new Object[]{label, jpf}, "Senha ADMINISTRATIVA", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            String senhaDigitada = new String(jpf.getPassword());

            if (controleSenha.criptografar(senhaDigitada).equals(senhaAdministrativa) && !senhaDigitada.isEmpty() && senhaDigitada != null && senhaAdministrativa != null) {

                boolean gravarCredenciais = controleJson.gravarCredenciaisBanco(ip, bancoDeDados, usuario, senhaRecuperadaCampo);

                if (gravarCredenciais) {
                    try {
                        int resposta = JOptionPane.showConfirmDialog(null, "Credenciais atualizada!\nDeseja inciar o sistema?.", "Control Lab Avisa", JOptionPane.YES_NO_OPTION);
                        if (resposta == JOptionPane.YES_OPTION) {
                            dispose();
                            
                            TelaSplashScreen telaInicial = new TelaSplashScreen();
                            telaInicial.setVisible(true);

                            Map<String, String> credenciaisBanco = controleJson.lerDadosCredenciaisBanco();

                            try {
                                BancoDeDados.iniciarBanco(credenciaisBanco.get("ip"), credenciaisBanco.get("usuario"), credenciaisBanco.get("senha"), credenciaisBanco.get("banco"));
                                new TelaLogin().setVisible(true);
                                telaInicial.dispose();
                            } catch (Exception erro) {
                                new TelaConfigurarBanco().setVisible(true);
                                telaInicial.dispose();
                            }
                            
                        } else {
                            dispose();
                        }

                    } catch (Exception ex) {
                        //Verificar mensagem
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao alterar credenciais do banco!\nFeche o sistema e tente iniciar novamente.", "Control Lab Avisa", WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Senha ADMINISTRATIVA incorreta!!!\nverifique a senha e tente novamente.", "Control Lab Avisa", WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_bt_configurarBancoActionPerformed

    private void cp_bancoDeDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_bancoDeDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_bancoDeDadosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfigurarBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_configurarBanco;
    private javax.swing.JLabel bt_fechar;
    private javax.swing.JTextField cp_bancoDeDados;
    private javax.swing.JFormattedTextField cp_ipServidor;
    private javax.swing.JPasswordField cp_senhaBanco;
    private javax.swing.JTextField cp_usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    ControleSenha controleSenha = new ControleSenha();
    ControleJson controleJson = new ControleJson();
}
