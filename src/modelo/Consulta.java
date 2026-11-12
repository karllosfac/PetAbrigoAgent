package modelo;

import java.time.LocalDate;
import usuarios.Veterinario;

public class Consulta {
    private Animal animal;
    private Veterinario veterinario;
    private LocalDate dataConsulta;
    private String descricaoConsulta;
    private String diagnostico;
    private String tratamentoRecomendado;

    public Consulta(Animal animal, Veterinario veterinario, LocalDate dataConsulta,
                    String descricaoConsulta, String diagnostico,
                    String tratamentoRecomendado) {
        this.animal = animal;
        this.veterinario = veterinario;
        this.dataConsulta = dataConsulta;
        this.descricaoConsulta = descricaoConsulta;
        this.diagnostico = diagnostico;
        this.tratamentoRecomendado = tratamentoRecomendado;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public String getDescricaoConsulta() {
        return descricaoConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamentoRecomendado() {
        return tratamentoRecomendado;
    }
}
