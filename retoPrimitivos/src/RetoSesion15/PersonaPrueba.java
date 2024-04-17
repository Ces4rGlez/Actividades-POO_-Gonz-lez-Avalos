package RetoSesion15;

import java.util.PriorityQueue;
import java.util.Queue;

public class PersonaPrueba {

    public static void main(String[] args) {
        Queue<Persona> personas = new PriorityQueue<>();

        personas.add(new Persona("Fernando", "Salazar"));
        personas.add(new Persona("Cesar", "Avalos"));
        personas.add(new Persona("Angel", "Villegas"));
        personas.add(new Persona("Karla", "Beltran"));

        Persona persona = null;

        while ((persona = personas.poll())!=null) {

        System.out.println(persona.getApellido());
            
        }


        
    }



}
