package Herencia.GUI;

import Herencia.Clases.Funcionarios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class Funcionario extends JFrame{
    private JLabel labelFuncionario;
    private JTextField txtCI;
    private JButton btnAgregar;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private JLabel labelCI;
    private JLabel labelNombre;
    private JLabel labelApellidos;
    private JLabel labelFechaIngreso;
    private JLabel labelCargo;
    private JLabel labelDireccion;
    private JLabel labelTelefono;
    private JPanel FuncionarioFrame;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    private JTextField txtLegajos;
    private JTextField txtFechaIngreso;
    private JTextField txtCargo;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private Funcionarios funcionarios;
    public Funcionario() {
        setContentPane(FuncionarioFrame);
        setTitle("Bienvenido");
        setSize(450, 550);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        funcionarios = new Funcionarios();

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

    public static void main(String[] args) {
        new Funcionario();
    }

    public void capturarDatos(){
        funcionarios.setNroCedula(txtCI.getText());
        funcionarios.setNombres(txtNombres.getText());
        funcionarios.setApellidos(txtApellidos.getText());
        funcionarios.setNroLegajo(Integer.valueOf(txtLegajos.getText()));
        funcionarios.setFechaIngreso(Date.valueOf(txtFechaIngreso.getText()));
        funcionarios.setCargo(txtCargo.getText());
        funcionarios.setDireccion(txtDireccion.getText());
        funcionarios.setNroTelefono(txtTelefono.getText());

        JOptionPane.showMessageDialog(this,
                "CI: " + funcionarios.getNroCedula()
                + "\nNombres: " + funcionarios.getNombres()
                + "\nApellidos: " + funcionarios.getApellidos()
                + "\nNro. Legajo: " + funcionarios.getNroLegajo()
                + "\nFecha de ingreso: " + funcionarios.getFechaIngreso()
                + "\nCargo: " + funcionarios.getCargo()
                + "\nDirección: " + funcionarios.getDireccion()
                + "\nTeléfono: " + funcionarios.getNroTelefono()
        );
        limpiar();
    }

    public void limpiar(){
        txtCI.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtLegajos.setText("");
        txtFechaIngreso.setText("");
        txtCargo.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }

    public void salir(){
        this.dispose();
    }
}
