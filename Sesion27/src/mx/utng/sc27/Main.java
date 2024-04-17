package mx.utng.sc27;

public class Main {
    public static void main(String[] args) {
        Thread userThread = new Thread(new UserThread());
        Thread daemonThread = new Thread(new DaemonThread());
        
        daemonThread.setDaemon(true);
        
        userThread.start();
        daemonThread.start();
    }
}

class UserThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hilo 1 --> "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hilo 2 --> Sigo en ejecución");
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
