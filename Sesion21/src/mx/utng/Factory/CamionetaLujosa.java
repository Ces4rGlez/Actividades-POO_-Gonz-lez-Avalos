package mx.utng.Factory;

public class CamionetaLujosa implements Camioneta {

    private String nombre;

    public CamionetaLujosa(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String getNombre() {
        
        return nombre;
    }

    @Override
    public String getCaracteristicas() {
        
        return "Auto con muchas características";
    }


}
