
package view;

import model.BancoFuncionario;
import controller.ControleFuncionario;
import model.Funcionario;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author edson
 */
public class TelaSelecionarFuncionarioAlterar extends javax.swing.JFrame {

    /**
     * Creates new form TelaAlterarReserva
     */
    public TelaSelecionarFuncionarioAlterar() {
        initComponents();
        iconeTitulo();
        perguntarSair();
        corFundo();
        preencherFuncionario(bancoFuncionario.listar());
    }

    public void corFundo() {
        this.getContentPane().setBackground(new Color(102, 102, 102));
        bt_cancelarSelecionarFuncionario.setBackground(new Color(255, 255, 255));
        bt_okSelecionarFuncionario.setBackground(new Color(255, 255, 255));
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
                    int selectedOption = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar?", "Control Lab Avisa", YES_NO_OPTION, QUESTION_MESSAGE);
                    if (selectedOption == JOptionPane.YES_OPTION) {
                        dispose();
                    }
                }
            }
        });
    }
    
    public void preencherFuncionario(List<Funcionario> funcionarios) {
        cp_listarFuncionarios.removeAllItems();
        for (Funcionario array : funcionarios) {
            cp_listarFuncionarios.addItem(array.getNome());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoAdministrador = new javax.swing.ButtonGroup();
        bt_cancelarSelecionarFuncionario = new javax.swing.JButton();
        bt_okSelecionarFuncionario = new javax.swing.JButton();
        cp_listarFuncionarios = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Selecionar Funcion??rio - Control Lab");
        setUndecorated(true);

        bt_cancelarSelecionarFuncionario.setBackground(new java.awt.Color(51, 51, 51));
        bt_cancelarSelecionarFuncionario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        bt_cancelarSelecionarFuncionario.setText("Cancelar");
        bt_cancelarSelecionarFuncionario.setBorder(null);
        bt_cancelarSelecionarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_cancelarSelecionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarSelecionarFuncionarioActionPerformed(evt);
            }
        });

        bt_okSelecionarFuncionario.setBackground(new java.awt.Color(51, 51, 51));
        bt_okSelecionarFuncionario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        bt_okSelecionarFuncionario.setText("OK");
        bt_okSelecionarFuncionario.setBorder(null);
        bt_okSelecionarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_okSelecionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_okSelecionarFuncionarioActionPerformed(evt);
            }
        });

        cp_listarFuncionarios.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        cp_listarFuncionarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lista de Funcion??rios" }));
        cp_listarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_listarFuncionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cp_listarFuncionarios, 0, 354, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_cancelarSelecionarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_okSelecionarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(cp_listarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_okSelecionarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cancelarSelecionarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cancelarSelecionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarSelecionarFuncionarioActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar?", "Control Lab Avisa", YES_NO_OPTION, QUESTION_MESSAGE);
        if (selectedOption == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_bt_cancelarSelecionarFuncionarioActionPerformed

    private void bt_okSelecionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_okSelecionarFuncionarioActionPerformed
            
           String nome = cp_listarFuncionarios.getSelectedItem().toString();
           boolean administrador = true;
           Funcionario f = new Funcionario();
           f = bancoFuncionario.recuperarFuncionario(nome);
           new TelaAlterarCadastro(f, administrador).setVisible(true);
           dispose();
           
    }//GEN-LAST:event_bt_okSelecionarFuncionarioActionPerformed

    private void cp_listarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_listarFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_listarFuncionariosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSelecionarFuncionarioAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSelecionarFuncionarioAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSelecionarFuncionarioAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSelecionarFuncionarioAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton bt_cancelarSelecionarFuncionario;
    private javax.swing.JButton bt_okSelecionarFuncionario;
    private javax.swing.JComboBox<String> cp_listarFuncionarios;
    private javax.swing.ButtonGroup grupoAdministrador;
    // End of variables declaration//GEN-END:variables

    BancoFuncionario bancoFuncionario = new BancoFuncionario();
    ControleFuncionario controleFuncionario = new ControleFuncionario();
}
