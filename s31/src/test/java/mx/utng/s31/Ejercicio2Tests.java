package mx.utng.s31;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Ejercicio2Tests {
   
    private final List<Integer> CONJUNTO = Arrays.asList(1, 4, 6, 2, 5, 9);
  
    @Test
    @DisplayName("Prueba a Negativo")
    void canTransformarNegativos() {
        Ejercicio2 e2 = new Ejercicio2();

        List<Integer> real = e2.transformar(CONJUNTO, s -> -s);

        assertThat(real).containsExactly(-1, -4, -6, -2, -5, -9);
    }
}