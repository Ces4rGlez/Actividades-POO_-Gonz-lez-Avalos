package RetoListas;

/** @author González Avalos César Fernando
 * @date: 08/Feb/2024
 * @group: GDS0624
 **/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrutaClase {
        public static void main(String[] args) {
        // Crear la lista de frutas
        List<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Plátanos");
        listaFrutas.add("Sandía");
        listaFrutas.add("Pera");
        listaFrutas.add("Manzana");
        listaFrutas.add("Naranja");
        listaFrutas.add("Kiwi");

        // Invertir el orden de la lista
        Collections.reverse(listaFrutas);
        System.out.println("<--------------------------------------------------->");
        System.out.println("---> Lista invertida ---> " + listaFrutas);
        
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        // Encontrar el elemento más pequeño (alfabéticamente)
        String menorElemento = Collections.min(listaFrutas);
        System.out.println("--- Elemento más pequeño ---> " + menorElemento);
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        // Encontrar el elemento más grande (alfabéticamente)
        String mayorElemento = Collections.max(listaFrutas);
        System.out.println("--- Elemento más grande ---> " + mayorElemento);

        System.out.println("====================================================");

        // Ordenar la lista alfabéticamente
        Collections.sort(listaFrutas);
        System.out.println("--- Lista ordenada alfabéticamente ---> " + listaFrutas);

        System.out.println("====================================================");

   

        // Buscar posición de Pera y Naranja en la lista ordenada
        int posicionPera = Collections.binarySearch(listaFrutas, "Pera");
        int posicionNaranja = Collections.binarySearch(listaFrutas, "Naranja");
        System.out.println("--- Posición de Pera en la lista ordenada ---> " + posicionPera);
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("--- Posición de Naranja en la lista ordenada ---> " + posicionNaranja);
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");


        // Agregar tres Manzanas nuevas
        listaFrutas.add("Manzana");
        listaFrutas.add("Manzana");
        listaFrutas.add("Manzana");

        System.out.println("====================================================");


        // Desordenar los elementos de la lista
        Collections.shuffle(listaFrutas);
        System.out.println("--- Lista desordenada ---> " + listaFrutas);

        System.out.println("====================================================");


        // Contar cuántas Manzanas hay en la lista
        int cantidadManzanas = Collections.frequency(listaFrutas, "Manzana");
        System.out.println("--- Cantidad de Manzanas en la lista ---> " + cantidadManzanas);


        System.out.println("<--------------------------------------------------->");
        

    }
}


