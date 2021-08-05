/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Map;
import model.BancoDeDados;
import view.TelaConfigurarBanco;
import view.TelaLogin;
import view.TelaSplashScreen;

/**
 *
 * @author edson
 */
public class ControleSplashScreen {

    public static void main(String[] args) {

        ControleJson controleJson = new ControleJson();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

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
    }
}
