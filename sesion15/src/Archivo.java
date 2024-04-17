import java.io.File;

public class Archivo {

    public static void main(String[] args) {
        File archivo = new File("C:/temp/cursos/cursos.txt");
        System.out.println("Nombre del Archivo: "+archivo.getName());
        System.out.println("Ruta: "+archivo.getPath());
        System.out.println("Ruta Abosoluta: "+archivo.getAbsolutePath());
        System.out.println("Ruta Abosoluta: "+archivo.getAbsolutePath());
        System.out.println("Autor: "+archivo.getParent());
        System.out.println("Existe: "+archivo.exists());
        System.out.println(archivo.isHidden());

        




    }

}
