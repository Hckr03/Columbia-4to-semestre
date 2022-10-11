package PostParcialPractica;

import java.util.List;

public class Ciudades extends Datos {
    private List<Barrios> barrios;

    public Ciudades(){}

    public Ciudades(List<Barrios> barrios, Integer id, String descripcion){
        super(id, descripcion);
        this.barrios = barrios;
    }

    public void setBarrios(List<Barrios> barrios){
        this.barrios = barrios;
    }

    public List<Barrios> getBarrios(){
        return barrios;
    }
}
