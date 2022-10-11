package Interface;

import Herencia.Clases.Personas;

import java.util.List;

public class FuenteDatosDos implements Operaciones{
    @Override
    public Boolean agregarRegistro() {
        System.out.println("False si si");
        return false;
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
        return null;
    }
}
