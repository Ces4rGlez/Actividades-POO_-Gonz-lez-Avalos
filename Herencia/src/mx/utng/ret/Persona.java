package mx.utng.ret;
//Codigo Creado Por César González
import java.time.LocalDate;
import java.time.Month;

public class Persona {
    private final String NOMBRE;
    private final byte EDAD;
    
    private final LocalDate FECHANACIMIENTO = LocalDate.of(2005, Month.JULY, 17);
    public Persona (String nombre, byte edad, LocalDate fechanacimiento){
        this.NOMBRE = nombre;
        this.EDAD = edad;

    }
    public String getNOMBRE() {
        return NOMBRE;
    }
    public byte getEDAD() {
        return EDAD;
    }
    
    public void mostrarInformacionP(){
        System.out.println("¬ Programador --> "+NOMBRE);
    
        System.out.println("¬ Edad del Programador --> "+EDAD+ " años");
        System.out.println("¬ Fecha de Nacimiento: -->  "+FECHANACIMIENTO);
    }

}
