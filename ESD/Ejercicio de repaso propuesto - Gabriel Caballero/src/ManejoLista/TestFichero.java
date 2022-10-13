package ManejoLista;

public class TestFichero {
    private GestionCSV gestion;

    public TestFichero(){
        gestion = new GestionCSV();
        String url = "/Users/hckr/Documents/Columbia 4to semestre/ESD/pytyvo-lista/pytyvo-lista02-2020-04-29.csv";
        if(gestion.verificarFichero(url)){
            gestion.gestionarFichero(url);
            for(CI ci: gestion.obtenerRegistros()){
                System.out.println("Nombre y apellido: " +ci.getNomApellido());
            }
        }
    }

    public static void main(String[] args) {
        new TestFichero();
    }
}
