 package mx.utng.sesion4;
//Código Creado Por González César

public class lectorTest {

    public static void main(String[] args) {
       
        Lector lector =new Lector();
        lector.mostrarMensaje("Teclea tu nombre");
        String nombre = lector.leerEntrada();
        lector.mostrarMensaje("Hola Usuario: "+nombre);
        lector.mostrarMensaje("Hola:", nombre);
    }
}