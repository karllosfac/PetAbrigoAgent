package repositorio;

import java.util.ArrayList;
import modelo.Consulta;

public class ConsultaRepositorio {
    private final ArrayList<Consulta> consultas = new ArrayList<>();

    public void adicionar(Consulta consulta) {
        consultas.add(consulta);
    }

    public ArrayList<Consulta> listarTodos() {
        return new ArrayList<>(consultas);
    }
}
