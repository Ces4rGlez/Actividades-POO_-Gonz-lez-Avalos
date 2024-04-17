package RetoFigura;

/** @author González Avalos César Fernando
 * @date: 06/Feb/2024
 * @group: GDS0624
 **/

public class Rectangulo extends Figura {
    private double base = 15.0;
    private double altura = 3.0;
    @Override
    public void formulaCalculaArea() {
        double area = altura * base;
        System.out.println("Área del rectángulo: base * altura ---> | El área de la figura es | "+ area + " | ");
    }

}
