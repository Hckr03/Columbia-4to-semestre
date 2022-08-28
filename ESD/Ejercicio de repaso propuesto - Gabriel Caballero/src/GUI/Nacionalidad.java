package GUI;

import Clases.Nacionalidades;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nacionalidad extends JFrame {

    private Nacionalidades nacionalidades;

    public Nacionalidad() {
        setContentPane(NacionalidadFrame);
        setTitle("Bienvenido");
        setSize(450, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        nacionalidades = new Nacionalidades();

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                capturarDatos();
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salir();
            }
        });
    }

    public void capturarDatos() {
        nacionalidades.setIdNacionalidad(Integer.valueOf(txtID.getText()));
        nacionalidades.setDescripcion(txtDescripcion.getText());
        nacionalidades.setComentario(txtComentario.getText());

        JOptionPane.showMessageDialog(this,
                nacionalidades.getIdNacionalidad()
                + " " + nacionalidades.getDescripcion()
                + " " + nacionalidades.getComentario());
    }

    public void limpiar() {
        txtID.setText("");
        txtDescripcion.setText("");
        txtComentario.setText("");
    }

    public void salir() {
        this.dispose();
    }

    public static void main(String[] args) {
        new Nacionalidad();
    }
    private JLabel nacionalidadLabel;
    private JTextField txtID;
    private JLabel idLabel;
    private JLabel descripcionLabel;
    private JButton btnSalir;
    private JButton btnAgregar;
    private JButton btnLimpiar;
    private JLabel comentarioLabel;
    private JTextField txtDescripcion;
    private JTextField txtComentario;
    private JPanel NacionalidadFrame;

}
