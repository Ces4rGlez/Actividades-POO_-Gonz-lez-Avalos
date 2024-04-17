package mx.utng.sc15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PersonaTest {public static void main(String[] args) {

    Persona persona1 = new Persona("Reynaldo", "Peña", 1.8F);
    Persona persona2 = new Persona("Fernando", "Avalos", 1.7F);
    Persona persona3 = new Persona("Angel", "Aguilar", 1.65F);
    Persona persona4 = new Persona("Diego", "Salazar", 1.97F);
    Persona persona5 = new Persona("Xavier", "Soto", 1.74F);

    List<Persona> personas = new LinkedList<>();
    Collections.addAll(personas, persona1, persona2, persona3, persona4, persona5);

    for (Persona persona : personas) {
        System.out.println(persona.getNombre()+ " "+ persona.getApellidos()+" : "+persona.getEstatura());
        
    }

    //Comparando Personas

    for (Persona persona : personas) {

        System.out.println(persona1.compareTo(persona));
        
    }
    
}

}
