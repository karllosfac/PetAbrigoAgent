package servico;

import excecoes.PermissaoNegadaException;
import modelo.Consulta;
import repositorio.ConsultaRepositorio;
import usuarios.Usuario;
import usuarios.Veterinario;

public class ConsultaServico {
    private final ConsultaRepositorio repositorio;

    public ConsultaServico(ConsultaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void registrarConsulta(Consulta consulta, Usuario responsavel)
            throws PermissaoNegadaException {
        if (!(responsavel instanceof Veterinario)) {
            throw new PermissaoNegadaException(
                    "Somente um veterinário pode registrar consultas.");
        }

        repositorio.adicionar(consulta);
    }
}
