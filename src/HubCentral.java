public class HubCentral {
    DispositivoInteligente dispositivo1;
    DispositivoInteligente dispositivo2;
    DispositivoInteligente dispositivo3;


    public void agregarDispositivo1(DispositivoInteligente dispositivo){
        dispositivo1 = dispositivo;
    }

    public void agregarDispositivo2(DispositivoInteligente dispositivo){
        dispositivo2 = dispositivo;
    }

    public void agregarDispositivo3(DispositivoInteligente dispositivo){
        dispositivo3 = dispositivo;
    }


    public void activarModoNoche(){
        System.out.println("============= Activando Modo Noche =============");

        if (dispositivo1 != null && dispositivo1.estaConectado()) {
            dispositivo1.apagar();
        }

        if (dispositivo2 != null && dispositivo2.estaConectado()) {
            dispositivo2.apagar();
        }

        if (dispositivo3 != null && dispositivo3.estaConectado()) {
            dispositivo3.apagar();
        }


    }
}
