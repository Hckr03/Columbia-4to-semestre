package GUI;

import Clases.Personas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Persona extends JFrame {
    private Personas persona;

    public Persona() {
        setContentPane(PersonaFrame);
        setTitle("Bienvenido");
        setSize(450, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        persona = new Personas();

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
        persona.setCedula(Integer.valueOf(txtCI.getText()));
        persona.setNombres(txtNombres.getText());
        persona.setApellidos(txtApellidos.getText());
        persona.setSexo(txtSexo.getText());
        persona.setfechaNacimiento(txtFechaNac.getText());

        JOptionPane.showMessageDialog(this,
                "CI:" + persona.getCedula()
                + "\nNombres: " + persona.getNombres()
                + "\nApellidos: " + persona.getApellidos()
                + "\nSexo: " + persona. getSexo()
                + "\nFecha de nacimiento: " + persona.getFechaNacimiento()
        );
    }

    public void limpiar() {
        txtCI.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtSexo.setText("");
        txtFechaNac.setText("");
    }

    public void salir() {
        this.dispose();
    }

    public static void main(String[] args) {
        new Persona();
    }

    private JTextField txtCI;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    private JButton btnSalir;
    private JButton btnLimpiar;
    private JButton btnAgregar;
    private JLabel personaLabel;
    private JLabel nombresLabel;
    private JLabel apellidoLabel;
    private JPanel PersonaFrame;
    private JLabel ciLabel;
    private JLabel sexoLabel;
    private JLabel fechaDeNacLabel;
    private JTextField txtFechaNac;
    private JTextField txtSexo;
    private JTextField txtID;
    private JLabel idLabel;
    private JComboBox comboCiudad;
    private JComboBox comboNacinalidad;
    private JLabel ciudadLabel;
    private JLabel nacionalidadLabel;
    private JComboBox comboBox1;
}
