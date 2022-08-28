package GUI;

import Clases.Clientes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cliente extends JFrame{
    private Clientes cliente;

    public Cliente() {
        setContentPane(ClienteFrame);
        setTitle("Bienvenido");
        setSize(450, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        cliente = new Clientes();

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
        cliente.setNroCiNroRuc(Integer.valueOf(txtRuc.getText()));
        cliente.setNombreRazonSocial(txtRazonSocial.getText());
        cliente.setDireccion(txtDireccion.getText());
        cliente.setNroTelefono(Integer.valueOf(txtTelefono.getText()));

        JOptionPane.showMessageDialog(this,
                "Ruc: " + cliente.getNroCiNroRuc()
                + "\nRazon social: " + cliente.getNombreRazonSocial()
                + "\nDireccion: " + cliente.getDireccion()
                + "\nTelefono: " + cliente.getNroTelefono()
        );
    }

    public void limpiar() {
        txtRuc.setText("");
        txtRazonSocial.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }

    public void salir() {
        this.dispose();
    }

    public static void main(String[] args) {
        new Cliente();
    }
    private JTextField txtRuc;
    private JTextField txtRazonSocial;
    private JTextField txtDireccion;
    private JButton btnAgregar;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private JTextField txtTelefono;
    private JLabel clienteLabel;
    private JLabel rucLabel;
    private JLabel nombreLabel;
    private JLabel direccionLabel;
    private JLabel telefonoLabel;
    private JPanel ClienteFrame;
}
