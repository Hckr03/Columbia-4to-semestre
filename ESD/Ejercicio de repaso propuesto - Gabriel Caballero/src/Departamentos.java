import java.util.List;

public class Departamentos {
    private Integer idDepartamentos;
    private String descripcion, comentario;
    private List<Ciudades> listaCiudades;

    public Departamentos(){

    }

    public Departamentos(Integer idDepartamentos, String descripcion, String comentario){
        System.out.println("idDepartamento: " + idDepartamentos);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Comentario: " + comentario);
    }

    public void setListaCiudades(List<Ciudades> listaCiudades){
        this.listaCiudades = listaCiudades;
    }

    public List<Ciudades> getListaCiudades(){
        return listaCiudades;
    }

    public void setIdDepartamentos(Integer idDepartamentos){
        this.idDepartamentos = idDepartamentos;
    }

    public Integer getIdDepartamentos(){
        return idDepartamentos;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public String getComentario(){
        return comentario;
    }
}
