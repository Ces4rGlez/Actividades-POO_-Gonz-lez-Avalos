package mx.utng.sc17;

import java.io.File;

public class reo1 {

    public static void main(String[] args) {

        File directorioInicial = new File("C:\\Users\\Ces4R\\Downloads\\temp");

        muestraContenidoDirectorio(directorioInicial);
        
    }
    private static void muestraContenidoDirectorio(File directorio){

        //Colocar la marca de inicio

        colocarEspacios(directorio.getParent(), 'D');
        System.out.println(directorio.getName());

        //Crear un arreglo de subdirectorios

        File[] subdirectorios = directorio.listFiles();

        //Recorrer la lista de archivos y verificar que sean  A o D

        for (File file : subdirectorios) {

            //Vrificar
            if(file.isFile()){
                colocarEspacios(file.getParent(), 'A');
                System.out.println(file.getName());
            }else if (file.isDirectory()) {

                muestraContenidoDirectorio(file);
                
            }
            
        }

    }

    private static void colocarEspacios(String padre, char simbolo){

        //Colocar la marca de incio de linea  [A] - Archivo [D]- Directorio

        System.out.print("["+simbolo+"]");

        //Colocar serie de guiones de acuerdo a la profundidad del directorio

        for (int i = 0; i < padre.length(); i++) {

            System.out.print("-");
            
        }
    }

}
