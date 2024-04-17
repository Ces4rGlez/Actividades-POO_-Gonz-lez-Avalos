package mx.utng.s30;

import java.util.concurrent.TimeUnit;

public class Mirunnable implements Runnable{
    private String parametro;
    private String nombre;

    public Mirunnable(String nombre){
        this.nombre = nombre;




    }

public void setParametro(String parametro) {
    this.parametro = parametro;
}

@Override
public void run(){
    while ("terminar".equals(parametro)) {
        mostrarInformacion();
        pausarUnSegundo();
        
    }
    mostrarInformacion();

}

//Pausa 1 segundo la ejecución
public static void pausarUnSegundo(){
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}
private void mostrarInformacion(){
    System.out.println("Hilo: "+ nombre + "\t| Parametro: "+parametro);

}


}
