package mx.utng.sc17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binario {

    public static void main(String[] args)  throws FileNotFoundException, IOException{
        //Instancia de Buffered

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\mx\\utng\\sc17\\PAISAJE.png"));

        //Declaramos una instancia de Buffered

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\mx\\utng\\sc17\\PAISAJE_copia.png"));

        //Definimos el buffer de escritura de datos
        byte[] buffer = new byte[1024];

        //iniciar la copia del archivo

        int byteLeidos = 0;
        while ((byteLeidos = bis.read(buffer))>0) {
            bos.write(buffer,0 ,byteLeidos);
            
        }
        bos.close();
        bis.close();
        
    }

}
