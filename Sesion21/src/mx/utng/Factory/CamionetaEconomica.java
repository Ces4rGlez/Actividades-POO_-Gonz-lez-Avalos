package mx.utng.Factory;


public class CamionetaEconomica implements Camioneta{


    private String nombre;
  
  
    public CamionetaEconomica(String nombre) {
      this.nombre = nombre;
  }
  
  @Override
    public String getNombre() {
        
        return nombre;
    }
  
    @Override
    public String getCaracteristicas() {
        
        return "Auto económico con pocas características";
    }
  
  
  }
  