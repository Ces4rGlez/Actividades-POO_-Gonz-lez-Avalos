package mx.utng.sc11;

public class PruebaFigura {
    public static void main(String[] args) {
        System.out.println("===========================================");

        Triangulo triangulo = new Triangulo(5.0, 4.0, "Color Pastel");
        System.out.println("Información del Triángulo");

        triangulo.mostrarDimension();
        triangulo.mostrarEstilo();

        System.out.println("Tiene un Área de: "+triangulo.area());
        System.out.println("===========================================");

        Triangulo triangulo1 = new Triangulo(6.0, 12.0, "Color Azul Marino");
        System.out.println("Información del Triángulo");

        triangulo1.mostrarDimension();
        triangulo1.mostrarEstilo();

        System.out.println("Tiene un Área de: "+triangulo1.area());

        System.out.println("===========================================");
        Triangulo triangulo2 = new Triangulo(44.0, 15.0, "Color Amarillo Chillon");
        System.out.println("Información del Triángulo");

        triangulo2.mostrarDimension();
        triangulo2.mostrarEstilo();

        System.out.println("Tiene un Área de: "+triangulo2.area());
        System.out.println("===========================================");


        

    }

}
