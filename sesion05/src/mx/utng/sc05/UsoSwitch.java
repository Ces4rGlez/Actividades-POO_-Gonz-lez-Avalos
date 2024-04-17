package mx.utng.sc05;
//Código Creado Por González César

import java.util.Scanner;

public class UsoSwitch {

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

        switch (nota) {
            case 10:
             mensaje = nombre+" Su puntuación es : Excelente";
                
                break;
                case 9 :
                case 8:
                mensaje = nombre+" Su puntuación es: Muy Bien";

                break;
                case 7:
                mensaje= nombre+" Su puntuación es: Bien hecho";
                break;

                case 6:
                mensaje= nombre+" Su puntuación es: Pasaste";
                break;

                case 5:
                mensaje= nombre+" Su puntuación es: Mejor vuelve a cursar";
                break;
        
            default:

            mensaje= nombre+" Su puntuación es: Nota No Válida";

                break;
        }

        System.out.println(mensaje);

        System.out.println("======================================");


    }


}
