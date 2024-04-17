package mx.utng.sc15;

import java.util.PriorityQueue;
import java.util.Queue;

public class LibroTest {

public static void main(String[] args) {
    Queue<Libro> libros = new PriorityQueue<>();
    libros.add(new Libro("Libro1", 1));
    libros.add(new Libro("Libro2", 4));
    libros.add(new Libro("Libro3", 2));
    libros.add(new Libro("Libro4", 4));
    libros.add(new Libro("Libro5", 3));
    libros.add(new Libro("Libro6", 7));
    libros.add(new Libro("Libro7", 8));
    libros.add(new Libro("Libro8", 6));
    libros.add(new Libro("Libro9", 10));
    libros.add(new Libro("Libro10", 9));

    Libro libro = null;
    while ((libro = libros.poll())!=null) {
        System.out.println(libro.getTitulo());
        
    }



}

}
