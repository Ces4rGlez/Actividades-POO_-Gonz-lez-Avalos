package numeros;

public class SumaNumeros {
    public static void main(String[] args) {
        int plus = 0;
        int num1 = 1;
        int num2 = 100;
        StringBuilder operacion = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            plus += i;
            operacion.append(i);
            if (i < 100) {
                operacion.append("+");
            }
        }
        System.out.println("===================================================");
        System.out.println("Código De --> ¬ Cesar Glez <--- ");
        System.out.println("===================================================");
        System.out.println("Suma de los Números del | "+num1+ " | Al Numero | "+num2+" |");
        System.out.println("------------------------------------------------------");
        System.out.println("Operación --->> \n.....................................................\n" +operacion.toString());
        System.out.println(".....................................................");
        System.out.println("La Suma es Igual a ---> | " + plus+" |");
        System.out.println("===================================================");

    }
}
