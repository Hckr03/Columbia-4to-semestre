package Herencia.GUI;

import Herencia.Clases.Clientes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cliente extends JFrame{
    private JLabel labelCliente;
    private JTextField txtNroRuc;
    private JTextField txtCI;
    private JTextField txtDV;
    private JButton btnAgregar;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JLabel labelNroRuc;
    private JLabel labelCI;
    private JLabel labelDV;
    private JLabel labelDireccion;
    private JLabel labelTelefono;
    private JLabel labelRazonSocial;
    private JTextField txtRazonSocial;
    private JPanel ClienteFrame;
    private Clientes clientes;
    public Cliente(){
        setContentPane(ClienteFrame);
        setTitle("Bienvenidos");
        setSize(450, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        clientes = new Clientes();

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
        new Cliente();
    }

    public void capturarDatos(){
        clientes.setNroRuc(Integer.valueOf(txtNroRuc.getText()));
        clientes.setNroCedula(txtCI.getText());
        clientes.setDigitoVerificador(Integer.valueOf(txtDV.getText()));
        clientes.setRazonSocial(txtRazonSocial.getText());
        clientes.setDireccion(txtDireccion.getText());
        clientes.setNroTelefono(txtTelefono.getText());

        JOptionPane.showMessageDialog(this,
                "Nro. Ruc: " + clientes.getNroRuc()
                + "\nNro. CI: " + clientes.getNroCedula()
                + "\nDigito Verificador: " + clientes.getDigitoVerificador()
                + "\nRazon Social: " + clientes.getRazonSocial()
                + "\nDirección: " + clientes.getDireccion()
                + "\nTeléfono: " + clientes.getNroTelefono()
        );
        limpiar();
    }

    public void limpiar(){
        txtNroRuc.setText("");
        txtCI.setText("");
        txtDV.setText("");
        txtRazonSocial.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }

    public void salir(){
        this.dispose();
    }
}
