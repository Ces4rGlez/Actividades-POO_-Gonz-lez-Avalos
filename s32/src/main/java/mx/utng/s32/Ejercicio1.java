package mx.utng.s32;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ejercicio1 {
    static void obtenerPromedio(Stream<Integer> ids){
        //Tiempo de inicio
        LocalTime inicio = LocalTime.now();
        double promedio = ids.mapToDouble(id -> new SistemaMedicion().leer(id)) //pasamos el Stream de numeros
       .average()
       .orElse(0); //Retorna 0 si no se pudo obtener

       //Calculamos la duración etre el inicio y el momento actual
       Duration tiempo = Duration.between(inicio, LocalTime.now());
//Se imprime Resultado
       System.out.println((Math.round(promedio * 100.)/100.) + " en "+
       tiempo.toMillis() + " ms" );
    }

       public static void main(String [] args){
        List <Integer> ids = IntStream.range(1, 11).boxed().collect(Collectors.toList());
        obtenerPromedio(ids.stream());
        obtenerPromedio(ids.parallelStream());
        
       }

    
    
}
