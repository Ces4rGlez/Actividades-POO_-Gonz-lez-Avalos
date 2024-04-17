import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppSuma extends JFrame {
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JLabel lblResultado;

    public AppSuma() {
        setTitle("Suma de Números");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.darkGray); 

        JLabel lblNumero1 = new JLabel("-- Número 1 --> ");
        lblNumero1.setBounds(20, 20, 150, 25);
        lblNumero1.setFont(new Font("Snap ITC", Font.BOLD, 15)); 
        lblNumero1.setForeground(Color.CYAN);
        add(lblNumero1);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(155, 20, 150, 25);
        txtNumero1.setFont(new Font("Bodoni MT Black", Font.PLAIN, 15));    
        add(txtNumero1);

        JLabel lblNumero2 = new JLabel("-- Número 2 --> ");
        lblNumero2.setBounds(20, 60, 150, 25);
        lblNumero2.setFont(new Font("Snap ITC", Font.BOLD, 15)); 
        lblNumero2.setForeground(Color.YELLOW);
        add(lblNumero2);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(155, 60, 150, 25);
        txtNumero2.setFont(new Font("Bodoni MT Black", Font.PLAIN, 15));
        add(txtNumero2);

        JButton btnSumar = new JButton("Sumar");
        btnSumar.setBounds(150, 100, 90, 30);
        btnSumar.setBackground(Color.RED); 
        btnSumar.setForeground(Color.WHITE); 
        btnSumar.setFocusPainted(false); 
        btnSumar.setFont(new Font("Bodoni MT Black", Font.PLAIN, 16));
        add(btnSumar);

        lblResultado = new JLabel("-- Resultado --> ");
        lblResultado.setBounds(20, 180, 260, 50);
        lblResultado.setFont(new Font("Gabriola", Font.BOLD, 25)); 
        lblResultado.setForeground(Color.WHITE);
        add(lblResultado);

        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumarNumeros();
            }
        });
    }

    private void sumarNumeros() {
        try {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());

            double resultado = numero1 + numero2;


            lblResultado.setText("-- Resultado -->  " + resultado);
        } catch (NumberFormatException ex) {
            lblResultado.setText("Error: Ingresa números válidos");
        }
    }

    public static void main(String[] args) {
        AppSuma sumaNumeros = new AppSuma();
        sumaNumeros.setVisible(true);
    }
}