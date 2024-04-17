package mx.utng.sc13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecciones {

    public static void main(String[] args) {
    //ListaCadenas

        List<String> listaCadenas = new ArrayList<>();
     listaCadenas.add("UNO");
     listaCadenas.add("DOS");
     listaCadenas.add("TRES");
     listaCadenas.add("CUATRO");
     listaCadenas.add("CINCO");
    
     System.out.println(listaCadenas);
     System.out.println("==============Fori=================");

     for (int i = 0; i < listaCadenas.size(); i++) {
        System.out.printf("%s%n",listaCadenas.get(i));
     }
     System.out.println("==============ForEach=================");
    
    
     for (String cadena : listaCadenas) {
        System.out.println(cadena);
        
    }
    System.out.println("==============Cadena=================");


    //ConjuntoCadenas
    Set<String> setCadenas = new HashSet<>();
    setCadenas.add("UNO");
    setCadenas.add("DOS");
    setCadenas.add("TRES");
    setCadenas.add("CUATRO");
    setCadenas.add("CINCO");

    for (String arreglo : setCadenas) {
        System.out.println(arreglo);
        
    }
    System.out.println("==============Numeros=================");

    List<Numero> listaNumeros = new ArrayList<>();
    listaNumeros.add(new Numero("Uno"));
    listaNumeros.add(new Numero("Dos"));
    listaNumeros.add(new Numero("Dos"));
    listaNumeros.add(new Numero("Tres"));
    listaNumeros.add(new Numero("Cuatro"));
    listaNumeros.add(new Numero("Cinco"));
    
    for (Numero numero : listaNumeros) {
        System.out.println(numero.getNombre());
        
    }

    System.out.println("==============NumerosConjunto=================");

    Set<Numero> setNumeros = new HashSet<>();
    setNumeros.add(new Numero("Uno"));
    setNumeros.add(new Numero("Dos"));
    setNumeros.add(new Numero("Dos"));
    setNumeros.add(new Numero("Tres"));
   setNumeros.add(new Numero("Cuatro"));
    setNumeros.add(new Numero("Cinco"));
    
    for (Numero numeroCon : setNumeros) {
        System.out.println(numeroCon.getNombre());
        
    }



  


        
    }

}
