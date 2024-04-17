package mx.utng.ret;
//Codigo Creado Por César González
import java.time.LocalDate;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println(" °°° Empresa CFGA | Expertos en Programación °°°");
        System.out.println("Información General de Empleados");
        System.out.println("=======================================");

        System.out.println("Datos del Programador: ");
        System.out.println("--------------------------------------");

        Persona persona = new Persona("César González", (byte)18, LocalDate.now());
        persona.mostrarInformacionP();
        System.out.println("--------------------------------------");

        Programador programador = new Programador("Python");
        programador.mostrarLenguaje();
        System.out.println("--------------------------------------");

        Empleado empleado = new Empleado(1550.6f);
        empleado.mostrarSalario();

        System.out.println("--------------------------------------");
        DBA dba = new DBA("Fernando Avalos");
        dba.mostrarDBA();

}
}
