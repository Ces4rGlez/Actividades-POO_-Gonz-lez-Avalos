package mx.utng.s30;

public class MiRunnablePool implements Runnable{

    private String nombre;

    public MiRunnablePool(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(nombre+ " --> Sigo en ejecución");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
               System.out.println(nombre + " --> Fue Interrumpido");
               System.out.println(nombre + " --> Threas.currentThread().isInterrupted()="+ Thread.currentThread().isInterrupted());

            }
        }
    }

}
