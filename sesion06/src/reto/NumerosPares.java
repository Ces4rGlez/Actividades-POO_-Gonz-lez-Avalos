package reto;

import java.util.Scanner;
//Código Creado Por González César


public class NumerosPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, fin;

     
        do {
            System.out.print("Introduce un número entero: ");
            base = sc.nextInt();
            System.out.print("Introduce otro número entero mayor que el anterior el Fin de la serie: ");
            fin = sc.nextInt();
            if (base >= fin) {
                System.out.println("El segundo número debe ser mayor que el primero");                  
            }
        } while (base >= fin);
        System.out.println("=========================================");

        System.out.println("\nNúmeros pares desde " + base + " hasta " + fin + " : ");
        System.out.println("=========================================");
        for (int i = base; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println("Número: "+i);
            }
        }

        System.out.println("=========================================");  
    }

}
