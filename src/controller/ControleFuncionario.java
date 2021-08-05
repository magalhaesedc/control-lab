package controller;

import model.BancoFuncionario;
import model.Funcionario;

public class ControleFuncionario {
    
    private BancoFuncionario bancoFuncionario = new BancoFuncionario();
    private ControleSenha controleSenha = new ControleSenha();
    
    public String salvar(String siape, String nome, String cargo, String senha, boolean administrador) {
          
        if (siape.equals("") || nome.equals("") || cargo.equals("-----------") || senha.equals("")) {
            return "Preencha todos os campos!!";
        }else if (bancoFuncionario.verificarSiape(siape) == false) {
            return "Siape já cadastrado!";
        } else {
            Funcionario f = new Funcionario();
            f.setSiape(siape);
            f.setNome(nome);
            f.setCargo(cargo);
            f.setSenha(controleSenha.criptografar(senha));
            f.setAdmin(administrador);
            return bancoFuncionario.salvar(f);
        }
    }
    
    public String alterar(String nome, String siape, String cargo, String senha, boolean administrador,boolean logado){
        Funcionario f = new Funcionario();
        f.setNome(nome);
        f.setSiape(siape);
        f.setCargo(cargo);
        f.setSenha(senha);
        f.setAdmin(administrador);
        //f.setLogado(logado);
        return bancoFuncionario.alterar(f);
    }
    
    public Funcionario recuperar(String siape){
        return bancoFuncionario.recuperar(siape);
    }
    
}