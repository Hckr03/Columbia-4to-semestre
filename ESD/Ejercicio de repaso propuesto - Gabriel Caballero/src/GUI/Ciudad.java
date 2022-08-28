package GUI;

import Clases.Ciudades;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ciudad extends JFrame{
    private Ciudades ciudad;

    public Ciudad() {
        setContentPane(CiudadFrame);
        setTitle("Bienvenido");
        setSize(450, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        ciudad = new Ciudades();

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
        ciudad.setIdCiudades(Integer.valueOf(txtID.getText()));
        ciudad.setDescripcion(txtDescripcion.getText());
        ciudad.setComentario(txtComentario.getText());

        JOptionPane.showMessageDialog(this,
        ciudad.getIdCiudades()
        + " " + ciudad.getDescripcion()
        + " " + ciudad.getComentario());
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
        new Ciudad();
    }

    private JPanel CiudadFrame;
    private JTextField txtID;
    private JTextField txtDescripcion;
    private JTextField txtComentario;
    private JButton btnSalir;
    private JButton btnAgregar;
    private JButton btnLimpiar;
    private JLabel nacionalidadLabel;
    private JLabel idLabel;
    private JLabel descripcionLabel;
    private JLabel comentarioLabel;
}
