package PostParcialPractica;

import java.util.List;

public class Departamentos extends Datos {
    private List<Ciudades> ciudades;
    public Departamentos() {

    }

    public Departamentos(Integer id, String descripcion, List<Ciudades> ciudades) {
        super(id, descripcion);
        this.ciudades = ciudades;
    }

    public List<Ciudades> getCiudades() { return ciudades; }

    public void setCiudades(List<Ciudades> ciudades) { this.ciudades = ciudades; }

}
