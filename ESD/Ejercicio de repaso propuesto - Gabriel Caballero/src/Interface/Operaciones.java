package Interface;

import Herencia.Clases.Personas;
import java.util.List;

public interface Operaciones {

    public Boolean agregarRegistro();
    public Boolean modificarRegistro();
    public Integer eliminarRegistro();

    public List<String> recuperarRegistro();
    public List<Integer> agregarRegis();
    public List<Personas> recuperarPersonas();
}
