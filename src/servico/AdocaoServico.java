package servico;

import java.time.LocalDate;
import excecoes.AnimalIndisponivelException;
import excecoes.PermissaoNegadaException;
import modelo.Adocao;
import modelo.Animal;
import repositorio.AdocaoRepositorio;
import usuarios.Administrador;
import usuarios.Usuario;

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

    public void aprovarSolicitacao(Adocao adocao, Usuario responsavel)
            throws PermissaoNegadaException {
        verificarAdministrador(responsavel);
        adocao.aprovar();
    }

    public void rejeitarSolicitacao(Adocao adocao, Usuario responsavel)
            throws PermissaoNegadaException {
        verificarAdministrador(responsavel);
        adocao.rejeitar();
    }

    private void verificarAdministrador(Usuario responsavel)
            throws PermissaoNegadaException {
        if (!(responsavel instanceof Administrador)) {
            throw new PermissaoNegadaException(
                    "Somente um administrador pode decidir a solicitação.");
        }
    }
}
