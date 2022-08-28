package Clases;

public class Ciudades {
    private Integer idCiudades;
    private String descripcion, comentario;
    // private Clases.Departamentos departamento;

    public Ciudades(){

    }

    public Ciudades(Integer idCiudades, String descripcion, String comentario){
        this.idCiudades = idCiudades;
        this.descripcion = descripcion;
        this.comentario = comentario;
        // departamento = new Clases.Departamentos();
        // for(Clases.Ciudades ciudad : departamento.getListaCiudades()){
        //     System.out.println("idCiudad: " + ciudad.getIdCiudades());
        //     System.out.println("Descripcion: " + ciudad.getDescripcion());
        //     System.out.println("Comentario: " + ciudad.getComentario());
        // }
    }

    public void setIdCiudades(Integer idCiudades){
        this.idCiudades = idCiudades;
    }

    public Integer getIdCiudades(){
        return idCiudades;
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
