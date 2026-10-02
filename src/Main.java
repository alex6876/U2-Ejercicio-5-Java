public class Main {
    public static void main(String[] args) {
        HubCentral hub =  new HubCentral();

        DispositivoInteligente foco = new DispositivoInteligente("Foco Dormitorio",
               true);

        DispositivoInteligente aire = new DispositivoInteligente("Aire acondicionado",
                true);

        DispositivoInteligente persiana = new DispositivoInteligente("Persiana inteligente",
                false);

        hub.agregarDispositivo1(aire);
        hub.agregarDispositivo2(foco);
        hub.agregarDispositivo3(persiana);

        foco.encender();
        aire.encender();

        hub.activarModoNoche();
    }
}