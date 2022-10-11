package Interface;

import Herencia.Clases.Personas;

import java.util.ArrayList;
import java.util.List;

public class FuenteDatosUno implements Operaciones{
    @Override
    public Boolean agregarRegistro() {
        System.out.println("True ponele");
        return true;
    }

    @Override
    public Boolean modificarRegistro() {
        return null;
    }

    @Override
    public Integer eliminarRegistro() {
        return null;
    }

    @Override
    public List<String> recuperarRegistro() {
        return null;
    }

    @Override
    public List<Integer> agregarRegis() {
        return null;
    }

    @Override
    public List<Personas> recuperarPersonas() {
        List<Personas> lista = new ArrayList<>();
        Personas persona = new Personas();
        persona.setNombres("Gabriel");
        persona.setApellidos("Caballero");
        lista.add(persona);

        lista.add(new Personas("Enrique", "Caballero"));
        lista.add(new Personas("Marcos", "Alegre"));
        lista.add(new Personas("Diego", "Cespedes"));

        return lista;
    }
}
