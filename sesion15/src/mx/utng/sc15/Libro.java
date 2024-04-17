package mx.utng.sc15;

public class Libro implements Comparable<Libro> {

    private String titulo;
    private int prioridad;

    @Override
    public int compareTo(Libro l) {
        return this.prioridad - l.prioridad;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Libro(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    

}
