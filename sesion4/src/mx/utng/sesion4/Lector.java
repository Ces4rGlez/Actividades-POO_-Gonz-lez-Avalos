package mx.utng.sesion4;
//Código Creado Por González César

import java.util.Scanner;

public class Lector {
    private Scanner scanner;
public Lector(){
   scanner = new Scanner(System.in);
}

public void mostrarMensaje(String mensaje){
    System.out.println(mensaje);
   
}

public String leerEntrada(){
    return scanner.nextLine();
}

public void mostrarMensaje(String mensaje, String dato){
System.out.printf("\t Este es el texto: %s %s \n\n", mensaje, dato);

}

}
