package mx.utng.s31;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Ejercicio1Tests {

    @Test @DisplayName("Prueba Sumar Dos Enteros")

    void canAddTwoIntegers(){
        String a = "5";
        String b = "8";



        Integer expected = 13;

        Ejercicio1 e1 = new Ejercicio1();

        assertEquals(expected, e1.sumar(a, b));


    }
}
