package mx.utng.sc06;
//Código Creado Por González César

import java.util.Scanner;

public class ForExample {

    public static void main(String[] args) {
        System.out.println("Ejemplo del Ciclo For....");

        //Imprimir números del 1-10

        for (int i = 1; i <=10; i++) {
            System.out.println("Número: "+i);
            
        }

        System.out.println("==================================");

        //Números de 2 en 2 hasta el 100

        for (int i = 2; i  <=100; i+=2) {
            System.out.println(i);
            
        }

        System.out.println("==================================");
        //Tabla del 5

        for (int i = 1; i <=10; i++) {

            System.out.printf( "5 * %d = %d%n",i, i*5 );
            
        }

        System.out.println("==================================");

        //Tabla ingresada por el usuario

        Scanner s = new Scanner(System.in);

        System.out.println("Teclea el número para Crear la Tabla de Multiplicación");
        int n = s.nextInt();

        s.close();
        for (int i = 1; i <= 10; i++) {

            System.out.printf( "%d * %d = %d%n",n,i,n*i);
            
        }

        System.out.println("==================================");

        //Arreglos dados
        String[] frutas = {"Mango", "Pera", "Manzana","Melon","Platano"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
            
        }

        System.out.println("==================================");
        
        //for each

        for (String fruta : frutas) {
            System.out.println(fruta);
            
        }

        System.out.println("==================================");

        //Ciclo while Números del 1 al 10
        byte i =0;

        while (++i <= 10) {
            System.out.println(i);
            
        }
        System.out.println("==================================");

        //do while
        i = 1;

        do {
            System.out.println(i);
        } while (i++<10);


        System.out.println("==================================");
    }

}
