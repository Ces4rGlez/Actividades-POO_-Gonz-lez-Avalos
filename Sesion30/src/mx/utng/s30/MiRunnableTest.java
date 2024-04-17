package mx.utng.s30;

public class MiRunnableTest {

    public static void main(String[] args) {
        Mirunnable runnable1 = new Mirunnable("Uno");
        Mirunnable runnable2 = new Mirunnable("Dos");


        Thread h1 = new Thread(runnable1);
        h1.start();

        Thread h2 = new Thread(runnable2);
        h2.setDaemon(true);
        h2.start();

        Mirunnable.pausarUnSegundo();
        runnable1.setParametro("Terminar");
        System.out.println("++Fin del hilo Main++");


        
    }

}
