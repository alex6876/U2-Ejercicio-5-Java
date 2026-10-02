public class DispositivoInteligente {
    String nombre;
    boolean conectado;
    boolean encendido;

    public DispositivoInteligente(String nombre, boolean conectado){
        this.nombre = nombre;
        this.conectado = conectado;
        this.encendido = false;
    }

    public void encender(){
        if (conectado){
            encendido = true;
            System.out.println(nombre+ " encendido");
        }else{
            encendido = false;
            System.out.println(nombre+ " Desconectado.");
        }
    }

    public void apagar(){
        if (encendido){
            encendido = false;
            System.out.println(nombre+ " apagado.");
        }else{
            System.out.println(nombre+ " Desconectado.");
        }
    }

    public void configurar(String parametro){
        if (conectado){
            System.out.println(nombre+ " Configurando: "+ parametro);
        }else {
            System.out.println(nombre+ " Desconectado.");
        }
    }

    public boolean estaConectado(){
        return conectado;
    }

    public String getNombre(){
        return nombre;
    }
}
