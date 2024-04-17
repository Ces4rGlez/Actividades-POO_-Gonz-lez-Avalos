
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
 

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
       
        boolean salir = false;
        int opcion;
       
        while(!salir){
           
            System.out.println("\n\t==== Estimado Usuario...Teclea un Número con las siguientes opciones =====");
           
            System.out.println("[1] Crear Nueva Lista de Tareas");
            System.out.println("[2] Ver Lista de Tareas");
            System.out.println("[3] Ver Tareas de Lista");
            System.out.println("[4] Actualizar Lista de Tareas");
            System.out.println("[5] Eliminar Lista de Tareas");
            System.out.println("[6] Salir");
           
            try{
           
            System.out.println("Seleccione la opcion deseada: ");
            opcion = sn.nextInt();
           
            switch (opcion){
                case 1:
                    System.out.println("Este es el programa para Crear Nueva Lista de Tareas");
                    break;
                case 2:
                    System.out.println("Este es el programa para Ver Lista de Tareas");
                    break;
                case 3:
                    System.out.println("Este es el programa para Ver Tareas de Lista ");
                    break;
                case 4:
                    System.out.println("Este es el programa para Actualizar Lista de Tareas");
                    break;
                case 5:
                    System.out.println("Este es el programa para Eliminar Lista de Tareas");
                    break;
                case 6:
                    salir=true;
                    break;   
                default:   
                   System.out.println("Las opciones son entre 1 y 6");
               
            }
            }
            catch(InputMismatchException e){
                System.out.println("Debes seleccionar un numero de opcion");
                sn.next();
            }
    }
   
                System.out.println("Gracias por utilizar el sistema, hasta luego... ");
}
}   