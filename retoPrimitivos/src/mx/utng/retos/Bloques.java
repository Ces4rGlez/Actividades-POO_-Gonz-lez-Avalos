package mx.utng.retos;

public class Bloques {

        private static int valor = 60; 

        // estático 
        public static void muestraValor() {
            System.out.println("El valor es: " + valor);
        }
    
        //  main 
        public static void main(String[] args) {
            Bloques bloques = new Bloques();
            Bloques.muestraValor();
        }

}
