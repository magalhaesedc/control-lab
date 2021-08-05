package controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ControleJson {

    public boolean gravarCredenciaisBanco(String ip, String banco, String usuario, String senha) {
        try {

            FileWriter file = new FileWriter("config.json");
            JSONObject json = new JSONObject();

            json.put("ip", ip);
            json.put("banco", banco);
            json.put("usuario", usuario);
            json.put("senha", senha);

            file.write(json.toJSONString());
            file.close();

            return true;
        } catch (Exception ex) {
            return false;
        }

    }

    public Map<String, String> lerDadosCredenciaisBanco() {

        try {
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(new FileReader("config.json"));

            String ip = (String) json.get("ip");
            String banco = (String) json.get("banco");
            String usuario = (String) json.get("usuario");
            String senha = (String) json.get("senha");

            Map<String, String> credenciais = new HashMap<String, String>();
            credenciais.put("ip", ip);
            credenciais.put("banco", banco);
            credenciais.put("usuario", usuario);
            credenciais.put("senha", senha);

            return credenciais;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public String lerSenha() {

        try {
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(new FileReader("admin.json"));

            String senha = (String) json.get("senha");

            return senha;
        } catch (Exception ex) {
            return null;
        }
    }
    
            
    public boolean alterarSenha(String senha) {

        try {

            FileWriter file = new FileWriter("admin.json");
            JSONObject json = new JSONObject();

            json.put("senha", senha);

            file.write(json.toJSONString());
            file.close();

            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}