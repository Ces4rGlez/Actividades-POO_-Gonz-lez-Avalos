package mx.utng.sc05;
//Código Creado Por González César

public class primitivos {
    public static void main(String[] args) {
        byte valorbyte = 10; //byte: -128 a 127
        System.out.println(valorbyte);

        short valorshort = 32767; //short : -32768 a 32767
        System.out.println(valorshort);

        int valorint = 214748364; // int: -2147483648 a 214783648
        System.out.println(valorint);

        long valorLong = 1000000000000000000l; //long: –9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        System.out.println(valorLong);

        //Número Real ienen punto decimal es de 6 cifras despues del punto

        float valorFloat = 7.513445677f ;

        System.out.println("Flotante: "+valorFloat);
       
        //Número real con doble precisión 16 cifras después del punto

        double valorDouble = 3.51234567890126;
        System.out.println("Double: "+valorDouble);



        //Booleano con solo dos valores posibles: True o False

        boolean ValorBoolean = true;

        //Primitivo para texto

        char valorCaracter = 'B';
        System.out.printf("Valor booleano:  %b %n Valor char: %c%n",ValorBoolean, valorCaracter);
    
        float numFloat = 1.5f;
        int numInt1 = (int)numFloat;
        System.out.printf("Número Flotante: %1.3f, Entero: %d%n",numFloat,numInt1);

        char numChar = 'M';
        numChar++;

        int numInt2 = numChar;

        System.out.printf("Char: %c, Entero: %n",numChar,numInt2);


    
    
    }

}
