package mx.utng.sesion4;
//Código Creado Por González César

public class Letras {
 public static void main(String[] args) {
    Lector lector = new Lector();
    ContadorCaracteres contador = new ContadorCaracteres();
    lector.mostrarMensaje("Teclea una palabra: ");
    System.out.println("==============================");
    String palabra = lector.leerEntrada();

    int vocales = contador.cuentaVocales(palabra);
     lector.mostrarMensaje("El número de vocales de la palabra son : "+vocales);

     int consonates = contador.cuentaConsonantes(palabra);
     lector.mostrarMensaje("El número de consonantes de la palabra son : "+consonates);

     int numeros = contador.cuentaNumeros(palabra);
     lector.mostrarMensaje("El número de numeros de la palabra son : "+numeros);
     int simbolos = contador.cuentaNumeros(palabra);
     lector.mostrarMensaje("El número de simbolos de la palabra son : "+simbolos);

 }
}
