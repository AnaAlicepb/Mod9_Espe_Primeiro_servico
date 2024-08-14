package br.com.AdoteBichinho.animal_service.entidades;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    

    @Column(nullable = false)
    private String nomeProvisorio;

    @Column(nullable = false)
    private Integer idadeEstimada;

    @Column(nullable = false)
    private String raca;

    @Column(nullable = false)
    private Date dataEntrada;

    @Column
    private Date dataAdocao;

    @Column(nullable = false)
    private String condicoesChegada;

    @Column
    private Date dataObito;

    @Column(nullable = false)
    private String porte;

    @ManyToOne
    @JoinColumn()
    private Resgatador resgatador;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;


    public Resgatador getResgatador() {
        return resgatador;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setResgatador(Resgatador resgatador) {
        this.resgatador = resgatador;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setNomeProvisorio(String nomeProvisorio) {
        this.nomeProvisorio = nomeProvisorio;
    }

    public void setIdadeEstimada(Integer idadeEstimada) {
        this.idadeEstimada = idadeEstimada;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public void setCondicoesChegada(String condicoesChegada) {
        this.condicoesChegada = condicoesChegada;
    }


    public void setDataObito(Date dataObito) {
        this.dataObito = dataObito;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }

    public String getCondicoesChegada() {
        return condicoesChegada;
    }


    public Date getDataObito() {
        return dataObito;
    }

    public String getPorte() {
        return porte;
    }

    public Integer getId() {
        return id;
    }

    public String getNomeProvisorio() {
        return nomeProvisorio;
    }

    public Integer getIdadeEstimada() {
        return idadeEstimada;
    }

    public String getRaca() {
        return raca;
    }
}
