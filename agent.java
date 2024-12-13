import java.util.ArrayList;
import java.util.List;

public class agent {
    private String nombre;
    private List<String> recompensas;


    public agent(String nombre) {
        this.nombre = nombre;
        this.recompensas = new ArrayList<>();
    }


    public void registrarRecompensa(String recompensa) {
        recompensas.add(recompensa);
    }


    public void mostrarRecompensas() {
        System.out.println("Recompensas de " + nombre + ":");
        for (String recompensa : recompensas) {
            System.out.println(recompensa);
        }
    }
}

