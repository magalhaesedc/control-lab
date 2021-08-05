package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reserva implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @ManyToOne
    private Funcionario siape;
    
    private String nome;
    
    @Temporal(TemporalType.DATE)
    private Date dataReserva; 
    
    @Temporal(TemporalType.TIME)
    private Date horarioEntradaReserva; 
    
    @Temporal(TemporalType.TIME)
    private Date horarioSaidaReserva; 
    
    private String proposito;
    
    private String laboratorio;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the siape
     */
    public Funcionario getSiape() {
        return siape;
    }

    /**
     * @param siape the siape to set
     */
    public void setSiape(Funcionario siape) {
        this.siape = siape;
        this.nome = siape.getNome();
    }

    /**
     * @return the dataReserva
     */
    public Date getDataReserva() {
        return dataReserva;
    }

    /**
     * @param dataReserva the dataReserva to set
     */
    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    /**
     * @return the horarioEntradaReserva
     */
    public Date getHorarioEntradaReserva() {
        return horarioEntradaReserva;
    }

    /**
     * @param horarioEntradaReserva the horarioEntradaReserva to set
     */
    public void setHorarioEntradaReserva(Date horarioEntradaReserva) {
        this.horarioEntradaReserva = horarioEntradaReserva;
    }

    /**
     * @return the horarioSaidaReserva
     */
    public Date getHorarioSaidaReserva() {
        return horarioSaidaReserva;
    }

    /**
     * @param horarioSaidaReserva the horarioSaidaReserva to set
     */
    public void setHorarioSaidaReserva(Date horarioSaidaReserva) {
        this.horarioSaidaReserva = horarioSaidaReserva;
    }

    /**
     * @return the proposito
     */
    public String getProposito() {
        return proposito;
    }

    /**
     * @param proposito the proposito to set
     */
    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
}