package repositorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;
import modelo.Animal;

public class AnimalRepositorio {
    private final ArrayList<Animal> animais = new ArrayList<>();

    public void adicionar(Animal animal) {
        animais.add(animal);
    }

    public ArrayList<Animal> listarTodos() {
        return new ArrayList<>(animais);
    }

    public ArrayList<Animal> buscarPorNome(String nome) {
        return filtrar(animal -> corresponde(animal.getNome(), nome));
    }

    public ArrayList<Animal> buscarPorEspecie(String especie) {
        return filtrar(animal -> corresponde(animal.getEspecie(), especie));
    }

    public ArrayList<Animal> buscarPorRaca(String raca) {
        return filtrar(animal -> corresponde(animal.getRaca(), raca));
    }

    public ArrayList<Animal> buscarPorIdade(int idade) {
        return filtrar(animal -> animal.getIdade() == idade);
    }

    public ArrayList<Animal> buscarPorPorte(String porte) {
        return filtrar(animal -> corresponde(animal.getPorte(), porte));
    }

    public ArrayList<Animal> buscarPorEstadoSaude(String estadoSaude) {
        return filtrar(animal -> corresponde(animal.getEstadoSaude(), estadoSaude));
    }

    public ArrayList<Animal> buscarPorDataResgate(LocalDate dataResgate) {
        return filtrar(animal -> Objects.equals(animal.getDataResgate(), dataResgate));
    }

    public ArrayList<Animal> buscarPorStatusAdocao(boolean adotado) {
        return filtrar(animal -> animal.isAdotado() == adotado);
    }

    private ArrayList<Animal> filtrar(Predicate<Animal> criterio) {
        ArrayList<Animal> resultado = new ArrayList<>();

        for (Animal animal : animais) {
            if (criterio.test(animal)) {
                resultado.add(animal);
            }
        }

        return resultado;
    }

    private boolean corresponde(String campo, String valor) {
        return campo != null && valor != null && campo.equalsIgnoreCase(valor);
    }
}
