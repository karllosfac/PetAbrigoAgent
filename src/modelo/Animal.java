package modelo;

import java.time.LocalDate;

public class Animal {
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private String porte;
    private String estadoSaude;
    private LocalDate dataResgate;
    private boolean adotado;

    public Animal(String nome, String especie, String raca, int idade, String porte,
                  String estadoSaude, LocalDate dataResgate) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.porte = porte;
        this.estadoSaude = estadoSaude;
        this.dataResgate = dataResgate;
        this.adotado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getEstadoSaude() {
        return estadoSaude;
    }

    public void setEstadoSaude(String estadoSaude) {
        this.estadoSaude = estadoSaude;
    }

    public LocalDate getDataResgate() {
        return dataResgate;
    }

    public void setDataResgate(LocalDate dataResgate) {
        this.dataResgate = dataResgate;
    }

    public boolean isAdotado() {
        return adotado;
    }

    public void setAdotado(boolean adotado) {
        this.adotado = adotado;
    }

    public void marcarComoAdotado() {
        this.adotado = true;
    }
}
