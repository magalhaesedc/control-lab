package controller;

import java.util.Date;
import java.util.List;
import model.BancoReserva;
import model.BancoFuncionario;
import model.Funcionario;
import model.Reserva;

public class ControleReserva {
    
    private BancoReserva bancoReserva = new BancoReserva();
    private BancoFuncionario bancoFuncionario = new BancoFuncionario();
    
    public String cadastrar(String nome, String siape, Date dataReserva, Date horarioEntradaReserva, Date horarioSaidaReserva, String proposito, String laboratorio) {

        if (proposito.equals("") || laboratorio.equals("-------")) {
            return "Preencha todos os campos!!";
        } else if (bancoReserva.verificarHorario(dataReserva, horarioEntradaReserva, horarioSaidaReserva, laboratorio) == false) {
            return "Horário já reservado!";
        } else {
            Reserva r = new Reserva();
            r.setSiape(bancoFuncionario.recuperar(siape));
            r.setNome(nome);
            r.setDataReserva(dataReserva);
            r.setHorarioEntradaReserva(horarioEntradaReserva);
            r.setHorarioSaidaReserva(horarioSaidaReserva);
            r.setProposito(proposito);
            r.setLaboratorio(laboratorio);
            return bancoReserva.cadastar(r);
        }
    }
    
    public String alterar(int id, Date dataReserva, Date horarioEntradaReserva, Date horarioSaidaReserva, String nome, String proposito, String siape, String laboratorio) {

        if (proposito.equals("") || laboratorio.equals("-------")) {
            return "Preencha todos os campos!!";
        } else {
            Reserva r = new Reserva();
            Funcionario f = new Funcionario();
            f.setSiape(siape);
            r.setId(id);
            r.setDataReserva(dataReserva);
            r.setHorarioEntradaReserva(horarioEntradaReserva);
            r.setHorarioSaidaReserva(horarioSaidaReserva);
            r.setProposito(proposito);
            r.setSiape(f);
            r.setLaboratorio(laboratorio);
            r.setNome(nome);
            return bancoReserva.alterar(r);
        }
    }
    
    public List<Reserva> pesquisar(String pesquisa) {
        return bancoReserva.pesquisar(pesquisa);
    }
    
    public Reserva recuperarReserva(Date dataReserva, Date horarioEntradaReserva, Date horarioSaidaReserva) {
        return bancoReserva.recuperarReserva(dataReserva, horarioEntradaReserva, horarioSaidaReserva);
    }
    
    public String cancelarReserva(Reserva r) {
        return bancoReserva.cancelarReserva(r);
    }
    
}