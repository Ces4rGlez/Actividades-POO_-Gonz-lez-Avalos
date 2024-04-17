package RetoSesion15;

import java.util.Comparator;

public class Persona implements Comparator<Persona> {

    private String nombre;
    private String apellido;
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    @Override
    public int compare(Persona p1, Persona p2) {
        String nombreCompleto = p1.getNombre()+p1.getApellido();
        String nombreCompleto2 = p2.getNombre()+p2.getApellido();

        return nombreCompleto.compareTo(nombreCompleto2);

        
    }
  
    }

    
   
    



