package Fichero;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VistaRuc extends JFrame{
    private JTable tabla;
    private JPanel jTable;
    private GestionTXT gestion;
    private DefaultTableModel tb;

    public VistaRuc(){
        setContentPane(jTable);
        setTitle("Tabla");
        setSize(450, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void cargarTabalaDesdeArchivo(){
        gestion = new GestionTXT();
        String url = "/Users/hckr/Documents/Columbia 4to semestre/ESD/ruc0.txt";

        if(gestion.verificarFichero(url)) {
            gestion.gestionarFichero(url);
            tb = (DefaultTableModel) tabla.getModel();
            tb.setRowCount(0);

            tb = new DefaultTableModel();
            tb.addColumn("Columna1");
            tb.addColumn("Columna2");
            tabla = new JTable(tb);


            for (Ruc ruc : gestion.obtenerRegistros()) {
                tb.addRow(new Object[]{
                        ruc.getNroRuc(),
                        ruc.getRazonSocial(),
                        ruc.getDv(),
                        ruc.getRucAnterior(),
                        ruc.getEstado()
                });
//                System.out.println("Razon social: " + ruc.getRazonSocial());
            }
        }
    }

    public static void main(String[] args) {
        new VistaRuc();
    }
}
