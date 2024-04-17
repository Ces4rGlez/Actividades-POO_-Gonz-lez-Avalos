package mx.utng.sc24;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
    private JTextField txtUsuario ;
    private JPasswordField txtClave;

    public Ventana(){
        //Invocando al constructor de la superclase
        super("Autenticación de Usuario");
        //Dimension de la ventana
        setSize(300, 200);

        //Cuando de clck en el boton X se cierra la ventana

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Contenedor GUI
        JPanel panel  = new JPanel(new GridBagLayout());
           //Restricciones
        GridBagConstraints gbg = new GridBagConstraints();
        gbg.insets = new Insets(5, 5, 5, 5);
        //Etiquetas

        JLabel lbUsuario = new JLabel("Usuario:");
        JLabel lbClave = new JLabel("Contraseña:");

        txtUsuario = new JTextField(15);
        txtClave = new JPasswordField(15);


        JButton btn_login = new JButton("Entrar");
        btn_login.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {

            String usuario = txtUsuario.getText();
            char[] charsClave = txtClave.getPassword();

            String clave = new String(charsClave);

            if(validarLogin(usuario, clave)){
                JOptionPane.showMessageDialog(Ventana.this, "Login exitoso");
            }else{
                JOptionPane.showMessageDialog(Ventana.this, "Clave Incorrecta");
            }
                
            }
        });

         gbg.gridx=0;
         gbg.gridy=0;

         panel.add(lbUsuario, gbg);

         this.add(panel);

         gbg.gridx=1;
         gbg.gridy=0;

         panel.add(txtUsuario, gbg);

         this.add(panel);

         gbg.gridx=0;
         gbg.gridy=1;

         panel.add(lbClave, gbg);

         this.add(panel);

         gbg.gridx=1;
         gbg.gridy=1;

         panel.add(txtClave, gbg);

         this.add(panel);

         gbg.gridx=0;
         gbg.gridy=2;

         panel.add(btn_login, gbg);

         this.add(panel);

         setLocationRelativeTo(null);
      







        setVisible(true); 



    }
    public static void main(String[] args) {
    new Ventana();
    }



private boolean validarLogin(String usuario, String clave){
    return usuario.equals("utng") && clave.equals("12345");

}}
