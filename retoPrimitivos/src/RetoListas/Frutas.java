package RetoListas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frutas {
    public static void main(String[] args) {
        // Crear la lista de frutas
        List<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Plátanos");
        listaFrutas.add("Sandía");
        listaFrutas.add("Pera");
        listaFrutas.add("Manzana");
        listaFrutas.add("Naranja");
        listaFrutas.add("Kiwi");

        // Invertir el orden de los elementos
        Collections.reverse(listaFrutas);

        // Encontrar el elemento más pequeño (alfabéticamente)
        String elementoMasPequeno = Collections.min(listaFrutas);

        // Encontrar el elemento más grande (alfabéticamente)
        String elementoMasGrande = Collections.max(listaFrutas);

        // Ordenar la lista alfabéticamente
        Collections.sort(listaFrutas);

        // Encontrar las posiciones de la Pera y la Naranja en la lista ordenada
        int posicionPera = listaFrutas.indexOf("Pera");
        int posicionNaranja = listaFrutas.indexOf("Naranja");

        // Agregar tres Manzanas nuevas a la lista
        listaFrutas.add("Manzana");
        listaFrutas.add("Manzana");
        listaFrutas.add("Manzana");

        // Desordenar los elementos de la lista
        Collections.shuffle(listaFrutas);

        // Contar cuántas Manzanas hay en la lista
        int conteoManzanas = Collections.frequency(listaFrutas, "Manzana");

        // Mostrar resultados
        System.out.println("Elemento más pequeño: " + elementoMasPequeno);
        System.out.println("Elemento más grande: " + elementoMasGrande);
        System.out.println("Lista ordenada alfabéticamente: " + listaFrutas);
        System.out.println("Posición de la Pera en la lista ordenada: " + (posicionPera + 1)); // Sumamos 1 porque los índices empiezan en 0
        System.out.println("Posición de la Naranja en la lista ordenada: " + (posicionNaranja + 1)); // Sumamos 1 porque los índices empiezan en 0
        System.out.println("Cantidad de Manzanas en la lista: " + conteoManzanas);
    }

}
