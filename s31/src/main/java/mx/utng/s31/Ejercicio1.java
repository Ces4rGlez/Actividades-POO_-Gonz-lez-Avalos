package mx.utng.s31;

import java.util.function.Function;

public class Ejercicio1 {
    private final Function<String, Integer> parser = Integer::parseInt;
  
    Integer sumar(String a, String b ){

        return parser.apply(a)+ parser.apply(b);
    }
}
