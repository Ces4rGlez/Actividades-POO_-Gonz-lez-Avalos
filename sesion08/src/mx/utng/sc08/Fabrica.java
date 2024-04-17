package mx.utng.sc08;
//Código Creado Por González César

public class Fabrica {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", "Shelby", 1965, 25000);
        Automovil auto2 = new Automovil("Bugatti", "Veyron Bleu Centenaire", 2009, 10000);
        Automovil auto3 = new Automovil("Lamborghini", "Huracan EVO RWD", 2007, 12000);
     
        System.out.println("Auto 1, hash: "+ auto1.hashCode());
        System.out.println("Auto 2, hash: "+ auto2.hashCode());
        System.out.println("Auto 3, hash: "+ auto3.hashCode());

    } 
}