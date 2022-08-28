package GUI;

import Clases.Departamentos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Departamento extends JFrame {
    private Departamentos departamento;

     public Departamento(){
        setContentPane(CiudadFrame);
        setTitle("Bienvenidos");
        setSize(450, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        departamento = new Departamentos();

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
        departamento.setIdDepartamentos(Integer.valueOf(txtID.getText()));
        departamento.setDescripcion(txtDescripcion.getText());
        departamento.setComentario(txtComentario.getText());

        JOptionPane.showMessageDialog(this,
                departamento.getIdDepartamentos()
                + " " + departamento.getDescripcion()
                + " " + departamento.getComentario()
        );
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
        new Departamento();
    }
    private JLabel nacionalidadLabel;
    private JLabel idLabel;
    private JLabel descripcionLabel;
    private JLabel comentarioLabel;
    private JTextField txtID;
    private JTextField txtDescripcion;
    private JTextField txtComentario;
    private JPanel CiudadFrame;
    private JButton btnSalir;
    private JButton btnAgregar;
    private JButton btnLimpiar;
}
