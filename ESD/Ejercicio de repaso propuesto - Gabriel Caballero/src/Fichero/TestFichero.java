package Fichero;

public class TestFichero {
    private GestionTXT gestion;
    public TestFichero() {
        gestion = new GestionTXT();
        String url = "/Users/hckr/Documents/Columbia 4to semestre/ESD/ruc0.txt";
        if(gestion.verificarFichero(url)){
            gestion.gestionarFichero(url);
            for(Ruc ruc: gestion.obtenerRegistros()){
                System.out.println("Razon social: " + ruc.getRazonSocial() +" "+ ruc.getNroRuc()  +" "+ ruc.getDv()  +" "+  ruc.getRucAnterior()  +" "+ ruc.getEstado());
            }
        }
    }

    public static void main(String[] args) {
        new TestFichero();
    }
}
