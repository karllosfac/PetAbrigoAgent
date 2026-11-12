package modelo;

import java.time.LocalDate;

public class Adocao {
    public static final String PENDENTE = "PENDENTE";
    public static final String APROVADA = "APROVADA";
    public static final String REJEITADA = "REJEITADA";

    private Animal animal;
    private String nomeCandidato;
    private LocalDate dataSolicitacao;
    private String status;

    public Adocao(Animal animal, String nomeCandidato, LocalDate dataSolicitacao) {
        this.animal = animal;
        this.nomeCandidato = nomeCandidato;
        this.dataSolicitacao = dataSolicitacao;
        this.status = PENDENTE;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public String getStatus() {
        return status;
    }
}
