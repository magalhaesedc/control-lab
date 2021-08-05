package controller;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControleSenha {

    public String criptografar(String senha) {

        String senhaAux = senha;
        String senhaCriptografada = "";

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(senhaAux.getBytes("UTF-8"));

            StringBuilder sb = new StringBuilder();

            for (byte b : messageDigest) {
                sb.append(String.format("%02x", 0xFF & b));
            }
            
            senhaCriptografada = sb.toString();

        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(ControleSenha.class.getName()).log(Level.SEVERE, null, ex);
        }
        return senhaCriptografada;
    }
}