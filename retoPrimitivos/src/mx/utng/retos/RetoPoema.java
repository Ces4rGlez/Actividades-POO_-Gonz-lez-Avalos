package mx.utng.retos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RetoPoema {

    /** @author González Avalos César Fernando
 * @date: 16/Feb/2024
 * @group: GDS0624
 **/
    
    public static void main(String[] args) throws IOException {

    FileWriter fw = new FileWriter("C:\\Users\\Ces4R\\OneDrive\\Escritorio\\POO\\retoPrimitivos\\src\\mx\\utng\\retos\\Poema.txt");

           //Colocar el objeto que sirve para escribir en el archivo creado

           BufferedWriter bw = new BufferedWriter(fw);
           bw.newLine();
           bw.write("------------------------------------->>");
           bw.newLine();
           bw.write("°°Estudiante --> González Avalos César Fernando°°\n");
           bw.write("Poema |Amistad| De-->> Carlos Castro Saavedra. \n");
           bw.write("---------------------------------->> \n");
           bw.newLine();
           bw.write("Amistad es lo mismo que una mano\n");
           bw.write("que en otra mano apoya su fatiga\n");
           bw.write("y siente que el cansancio se mitiga\n");
           bw.write("y el camino se vuelve más humano.\n");
           bw.newLine();
           bw.write("------------------------------------->>");
           bw.newLine();
           bw.write("El amigo sincero es el hermano,\n");
           bw.write("claro y elemental como la espiga,\n");
           bw.write("como el pan, como el sol, como la hormiga\n");
           bw.write("que confunde la miel con el verano.\n");
           bw.newLine();
           bw.write("------------------------------------->>");
           bw.newLine();

           bw.close();


           //Crear un objecto que permita la lectura de archivo
           FileReader fr = new FileReader("C:\\Users\\Ces4R\\OneDrive\\Escritorio\\POO\\retoPrimitivos\\src\\mx\\utng\\retos\\Poema.txt");
           BufferedReader br = new BufferedReader(fr);

           String linea = null;

           while ((linea = br.readLine())!=null) {

            System.out.println(linea);
            
           }
}
}
