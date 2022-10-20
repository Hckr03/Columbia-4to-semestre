package Fichero;

public class TestFichero {

    private GestionTXT gestion;
    
    public TestFichero() {
        gestion = new GestionTXT();
        String url ="/Users/hckr/Documents/Columbia 4to semestre/ESD/ruc0.txt";
        if (gestion.verificarFichero(url)) {
            gestion.gestionarFichero(url);
            for (Ruc r : gestion.obtenerRegistros()) {
                System.out.println("Razon Social " + r.getRazonSocial() +" " + r.getEstado());
            }
        }
    }
    
    public static void main(String[] args) {
        new TestFichero();
    }

}
