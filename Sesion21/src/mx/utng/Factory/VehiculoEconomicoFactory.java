package mx.utng.Factory;

public class VehiculoEconomicoFactory extends VehiculoFactory {

    @Override
    public Auto getAuto() {
        
        return new AutoEconomico("A-L");
    }
@Override
public Camioneta getCamioneta() {

    return new CamionetaEconomica("C-L");
}

}

