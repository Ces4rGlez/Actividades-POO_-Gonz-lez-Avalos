
//Código Creado Por: CesarGonzalez 
package mx.utng.sc05;

import java.util.Scanner;

public class UsoCiclolf {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese su nombre: ");
    String nombre = scanner.nextLine();

  
    System.out.println("¡Hola, " + nombre + "! Bienvenido.");

   

    System.out.println(nombre+" Teclea tu calificación de POO: ");
    int nota = scanner.nextInt();

    scanner.close();
    String mensaje = "";

    System.out.println("======================================");

    if (nota == 10) {

        mensaje = nombre+" Su puntuación es : Excelente";

    } else if (nota == 9 || nota == 8) {
        
        mensaje = nombre+" Su puntuación es: Muy Bien";
    } else if (nota == 7) {
        mensaje = nombre+" Su puntuación es: Bien hecho";
    } else if (nota == 6) {
        mensaje = nombre+" Su puntuación es: Pasaste";
    } else if (nota <= 5) {
        mensaje = nombre+" Su puntuación es: Mejor vuelve a cursar";
    } else {
        mensaje = nombre+" Su puntuación es: Nota No Válida";
    }

    System.out.println(mensaje);
    System.out.println("======================================");
}

}
