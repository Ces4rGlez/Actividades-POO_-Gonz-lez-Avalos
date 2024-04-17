package RetoFigura;

/** @author González Avalos César Fernando
 * @date: 06/Feb/2024
 * @group: GDS0624
 **/

public class Triangulo extends Figura {

   private double base = 60.0;
   private double altura = 2.0;

    @Override
    public void formulaCalculaArea() {
       
        double area = altura * base / 2;
        System.out.println("Área del triángulo: (base * altura) / 2 ---> | El área de la figura es | "+ area + " | ");
    }

}
