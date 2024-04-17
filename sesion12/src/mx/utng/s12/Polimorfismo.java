package mx.utng.s12;



public class Polimorfismo {
    public static void main(String[] args) {
        Venado ve= new Venado();

        Animal a = ve;

        Hervivoro h = ve;

        Object o = ve;


        System.out.println("Venado: "+(ve instanceof Venado));
        System.out.println("Animal: "+(a instanceof Animal));
        System.out.println("Hervivoro: "+(h instanceof Hervivoro));
        System.out.println("Objecto: "+(o instanceof Object));
       //No hay Compatibilidad --> System.out.println("Scanner: "+(ve instanceof Scanner));






    }

}
