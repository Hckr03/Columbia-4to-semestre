import java.util.ArrayList;
import java.util.List;

public class Test {
    // private Persona persona, persona2;
    // private Clientes clientes;
    private Departamentos departamento;
    private List<Ciudades> ciudades;
    
    public Test() {
        // persona = new Persona(3713700, "Gabriel Enrique", "Caballero Barrios");
        // persona2 = new Persona();
        // persona2.tipoSexo(1);
        // persona2.calcularEdad("12/03/1991");
        // persona2.calcularIMC(1.74, 116.0);

        // clientes = new Clientes();
        // clientes.setNroTelefono(82125910);
        // System.out.println(clientes.getNroTelefono());

        departamento = new Departamentos(1, "Central", "");

        ciudades = new ArrayList<>();
        ciudades.add(new Ciudades(1, "Asuncion", "Quien te conoce"));
        ciudades.add(new Ciudades(2, "Lambare", "La ciudad del amor"));
        ciudades.add(new Ciudades(3, "Capiata", "La ciudad de las vacas"));
        ciudades.add(new Ciudades(4, "Luque", "La ciudad de los cuchillos"));
        departamento.setListaCiudades(ciudades);

        for(Ciudades ciudad : departamento.getListaCiudades()){
            System.out.println("idCiudad: " + ciudad.getIdCiudades());
            System.out.println("Descripcion: " + ciudad.getDescripcion());
            System.out.println("Comentario: " + ciudad.getComentario());
        }

    }

    public static void main(String[] args) {
        new Test();
    }
}
