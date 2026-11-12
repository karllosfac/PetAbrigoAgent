package servico;

import java.time.LocalDate;
import excecoes.AnimalIndisponivelException;
import modelo.Adocao;
import modelo.Animal;
import repositorio.AdocaoRepositorio;

public class AdocaoServico {
    private final AdocaoRepositorio repositorio;

    public AdocaoServico(AdocaoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void solicitarAdocao(Animal animal, String nomeCandidato,
                                LocalDate dataSolicitacao)
            throws AnimalIndisponivelException {
        if (animal.isAdotado()) {
            throw new AnimalIndisponivelException("O animal já foi adotado.");
        }

        Adocao adocao = new Adocao(animal, nomeCandidato, dataSolicitacao);
        repositorio.adicionar(adocao);
    }
}
