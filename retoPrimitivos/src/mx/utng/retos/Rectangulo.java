package mx.utng.retos;

//Código Creado Por César González

public class Rectangulo {
    
        private double alto;
        private double ancho;
   
        public Rectangulo() {
            this.alto = 0;
            this.ancho = 0;
        }
    
        public Rectangulo(double medida) {
            this.alto = medida;
            this.ancho = medida;
        }
    
   
        public Rectangulo(double alto, double ancho) {
            this.alto = alto;
            this.ancho = ancho;
        }
    
        public double calcularArea() {
            return alto * ancho;
        }
}
