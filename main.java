public class main {
    public static void main(String[] args) {
   
        agent agenteNeo = new agent("Adrian");

   
        agenteNeo.registrarRecompensa("Misión completada: Rescate de Morfeo");
        agenteNeo.registrarRecompensa("Misión completada: Derrotar al Agente Smith");
        agenteNeo.registrarRecompensa("Misión completada: Salvar la humanidad");

      
        agenteNeo.mostrarRecompensas();
    }
}

