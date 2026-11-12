package repositorio;

import java.util.ArrayList;
import modelo.Adocao;
import modelo.Animal;

public class AdocaoRepositorio {
    private final ArrayList<Adocao> adocoes = new ArrayList<>();

    public void adicionar(Adocao adocao) {
        adocoes.add(adocao);
    }

    public ArrayList<Adocao> listarTodos() {
        return new ArrayList<>(adocoes);
    }

    public ArrayList<Adocao> buscarPorAnimal(Animal animal) {
        ArrayList<Adocao> resultado = new ArrayList<>();

        for (Adocao adocao : adocoes) {
            if (adocao.getAnimal() == animal) {
                resultado.add(adocao);
            }
        }

        return resultado;
    }
}
