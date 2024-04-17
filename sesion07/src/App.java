import mx.utng.sc07.Lector;
import mx.utng.sc07.ListaTareas;
import mx.utng.sc07.Menu;
//Código Creado Por González César

public class App {
    public static void main(String[] args) throws Exception {
       //Objetos Necesarios

       Menu menu = new Menu();
       Lector lector = new Lector();
       ListaTareas lista = new ListaTareas();


       byte opcionSeleccionada = 0;

       do {
        menu.muestraOpciones();
        opcionSeleccionada = lector.leerOpcion();

        System.out.printf("%n%n La opcion seleccionada fue: %d%n%n", opcionSeleccionada);
        switch (opcionSeleccionada) {
            case 1:
                lista.crearNuevaLista();
                break;
        case 2:
        lista.verListaTareas();
        break;
        case 3:
        lista.verTareasDeLista();
        break;
        case 4:
        lista.actualizarListaTareas();
        break;
        case 5: 
        lista.eliminarListaTareas();
        break;
        case 6:
        System.out.println("Saliendo de la aplicación..Adios");
        break;    
        default:
            System.out.println("Opcion desconocida");
                break;
        }
        
       } while (opcionSeleccionada !=6);
    }
}
