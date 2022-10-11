package Interface;

import Herencia.Clases.Personas;
import java.util.List;

public class Test {
    private Operaciones operaciones;
    public Test(Integer bandera){
        switch (bandera){
            case 1:
                operaciones = new FuenteDatosUno();
                break;
            case 2:
                operaciones = new FuenteDatosDos();
                break;
            default:
                System.out.println("Error! valor no reconocido!");
        }
       List<Personas> lista = operaciones.recuperarPersonas();
        for (Personas persona : lista){
            System.out.println("Nombres: " + persona.getNombres());
            System.out.println("Apellidos: " + persona.getApellidos());
        }
    }

    public static void main(String[] args) {
        new Test(1);
    }
}
