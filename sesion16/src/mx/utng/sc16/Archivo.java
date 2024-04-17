package mx.utng.sc16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    public static void main(String[] args) throws IOException {
        //Creacion de instancia
        File archivo = new File("C:\\Users\\Ces4R\\OneDrive\\Escritorio\\POO\\sesion16\\src\\mx\\utng\\sc16\\curso.txt");
        System.out.println("Nombre Archivo: "+archivo.getName());
        System.out.println("Ruta: "+archivo.getPath());
        System.out.println("Directorio: "+archivo.getParent());

        System.out.printf("El archivo %s %s existe:. %n ",archivo.getName(), (archivo.exists()? "SI":"NO"));

        //El archivo esta oculto??

        System.out.printf("El archivo %s %s es oculto. %n",archivo.getName(), archivo.isHidden()? "Si": "No");

        //Si el archivo existe

        if(archivo.exists()){
            System.out.printf("El archivo %s es %s%n",archivo.getName(),(archivo.canWrite()?"Escribible": "De Solo Lectura"));
            System.err.printf("%s %s%n",archivo.getName(),(archivo.isDirectory()?"es un Directorio":" es una Archivo"));

            System.out.printf("%s Tiene un tamaño de --> %d bytes %n",archivo.getName(),archivo.length());

            //En kbytes

            System.out.printf("%s Tiene un tamaño de --> %f kbytes %n",archivo.getName(),archivo.length()/1024.0);

            //Crear Escritor de Archivos

           // FileWriter fw = new FileWriter(System.getProperty("user.home")+"/archivo.txt");

           FileWriter fw = new FileWriter("C:\\Users\\Ces4R\\OneDrive\\Escritorio\\POO\\sesion16\\src\\mx\\utng\\sc16\\archivo.txt");

           //Colocar el objeto que sirve para escribir en el archivo creado

           BufferedWriter bw = new BufferedWriter(fw);
           bw.write("Proyecti WEB de Java. \n\n");
           bw.write("Este proyecto tiene como objetivo hacer un catalogo de zapatos");
           bw.newLine();
           bw.write("Integrantes --> \n");
           bw.write("°° Cesar");
           bw.newLine();
           bw.write("°° Fernando");

           bw.close();


           //Crear un objecto que permita la lectura de archivo
           FileReader fr = new FileReader("C:\\Users\\Ces4R\\OneDrive\\Escritorio\\POO\\sesion16\\src\\mx\\utng\\sc16\\archivo.txt");
           BufferedReader br = new BufferedReader(fr);

           String linea = null;

           while ((linea = br.readLine())!=null) {

            System.out.println(linea);
            
           }

           
    
        }

    }



}
