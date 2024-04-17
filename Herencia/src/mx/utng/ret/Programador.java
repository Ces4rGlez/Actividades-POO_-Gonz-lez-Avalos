package mx.utng.ret;
//Codigo Creado Por César González

public class Programador {

    private final String LENGUAJE;

    public Programador(String lenguaje){
        this.LENGUAJE = lenguaje;

    }

    public String getLENGUAJE() {
        return LENGUAJE;
    }

    public void mostrarLenguaje(){
        System.out.println("¬ El Lenguaje que domina es: "+LENGUAJE);
    }

}
