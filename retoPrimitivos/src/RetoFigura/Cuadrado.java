package RetoFigura;

/** @author González Avalos César Fernando
 * @date: 06/Feb/2024
 * @group: GDS0624
 **/

public class Cuadrado extends Figura {

   private double lado = 20.0;
    @Override
    public void formulaCalculaArea() {

        double area = lado * lado;
        System.out.println("Área del Cuadrado: lado * lado ---> | El área de la figura es | "+ area + " | ");
    }

}
