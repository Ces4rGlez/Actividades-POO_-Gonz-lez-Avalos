package mx.utng.retos;
//Creado Por: César González
 //Función printf que imprima el valor máximo y el minímo que pueden tener los datos: byte, short, int, long , char , boolean , float, double
public class RetoPrimitivos {
    public static void main(String[] args) {
        // Valor máximo y mínimo para byte
        System.out.println("<----------------------------------------->");
        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.printf("Valor máximo de byte: %d\n", byteMax);
        System.out.printf("Valor mínimo de byte: %d\n", byteMin);

        System.out.println("<----------------------------------------->");

        // Valor máximo y mínimo para short
        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        System.out.printf("Valor máximo de short: %d\n", shortMax);
        System.out.printf("Valor mínimo de short: %d\n", shortMin);
        System.out.println("<----------------------------------------->");

        // Valor máximo y mínimo para int
        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.printf("Valor máximo de int: %d\n", intMax);
        System.out.printf("Valor mínimo de int: %d\n", intMin);
        System.out.println("<----------------------------------------->");

        // Valor máximo y mínimo para long
        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        System.out.printf("Valor máximo de long: %d\n", longMax);
        System.out.printf("Valor mínimo de long: %d\n", longMin);
        System.out.println("<----------------------------------------->");

        // Valor máximo y mínimo para char
        char charMax = Character.MAX_VALUE;
        char charMin = Character.MIN_VALUE;
        System.out.printf("Valor máximo de char: %d\n", (int) charMax);
        System.out.printf("Valor mínimo de char: %d\n", (int) charMin);
        System.out.println("<----------------------------------------->");

        // Valor máximo y mínimo para boolean
        boolean bool1 = true;
        boolean bool2 = false;
        
        System.out.println("1er Valor de booleano: " + bool1);
        System.out.println("2do Valor de booleano: " + bool2);
        System.out.println("<----------------------------------------->");
        // No hay máximo y mínimo definidos para boolean

        // Valor máximo y mínimo para float
        float floatMax = Float.MAX_VALUE;
        float floatMin = -Float.MAX_VALUE;
        System.out.printf("Valor máximo de float: %f\n", floatMax);
        System.out.printf("Valor mínimo de float: %f\n", floatMin);
        System.out.println("<----------------------------------------->");

        // Valor máximo y mínimo para double
        double doubleMax = Double.MAX_VALUE;
        double doubleMin = -Double.MAX_VALUE;
        System.out.printf("Valor máximo de double: %f\n", doubleMax);
        System.out.printf("Valor mínimo de double: %f\n", doubleMin);
        System.out.println("<----------------------------------------->");
    }
}


