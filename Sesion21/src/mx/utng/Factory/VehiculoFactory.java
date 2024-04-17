package mx.utng.Factory;

public abstract class VehiculoFactory {

    private static final String Vehiculo_Lujo = "Lujo";
    private static final String Vehiculo_Economico = "Economico";
    
    public abstract Auto getAuto();
    public abstract Camioneta getCamioneta();




}
