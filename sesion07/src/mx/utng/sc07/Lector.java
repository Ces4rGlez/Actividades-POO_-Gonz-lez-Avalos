package mx.utng.sc07;
//Código Creado Por González César

import java.util.Scanner;

public class Lector {

    private Scanner sca = new Scanner(System.in);

    public byte leerOpcion(){
        System.out.println("Opcion: ");
        
        return sca.nextByte();
    }

}
