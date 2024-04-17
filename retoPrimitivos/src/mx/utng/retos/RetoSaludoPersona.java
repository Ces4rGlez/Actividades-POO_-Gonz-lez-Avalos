package mx.utng.retos;

//Codigo Creado Por: González Avalos César

import java.util.Scanner;

public class RetoSaludoPersona {
        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("<---------------------------------------------------------->");
    
        System.out.println("°°°°°°° Estimado Usuario: Por favor, Ingresa tu nombre: °°°°°°°° ");
        String nombre = scanner.nextLine();

        System.out.println("<---------------------------------------------------------->");
        
        System.out.println("¡Hola, " + nombre + "! Bienvenido.");

        System.out.println("<---------------------------------------------------------->");
    
        scanner.close();
    }


}
