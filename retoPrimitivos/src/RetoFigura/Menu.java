package RetoFigura;

/** @author González Avalos César Fernando
 * @date: 06/Feb/2024
 * @group: GDS0624
 **/

public class Menu {
    public static void main(String[] args) {
        Figura figura;

        System.out.println("<------------------------------->");

        figura = new Triangulo();
        figura.formulaCalculaArea();

        System.out.println("<------------------------------->");


        figura = new Rectangulo();
        figura.formulaCalculaArea();

        System.out.println("<------------------------------->");


        figura = new Cuadrado();
        figura.formulaCalculaArea();

        System.out.println("<------------------------------->");

    }


}
