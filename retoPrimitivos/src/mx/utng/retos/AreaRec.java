package mx.utng.retos;

//Código Creado Por César González

public class AreaRec {
    public static void main(String[] args) {
        // Crear instancias de Rectangulo con diferentes valores y calcular el área
        Rectangulo rect1 = new Rectangulo();
        System.out.println("Área del rectángulo con alto 0 y ancho 0: " + rect1.calcularArea());

        Rectangulo rect2 = new Rectangulo(2);
        System.out.println("Área del rectángulo con alto 2 y ancho 2: " + rect2.calcularArea());

        Rectangulo rect3 = new Rectangulo(3, 2);
        System.out.println("Área del rectángulo con alto 3 y ancho 2: " + rect3.calcularArea());
    }
}

