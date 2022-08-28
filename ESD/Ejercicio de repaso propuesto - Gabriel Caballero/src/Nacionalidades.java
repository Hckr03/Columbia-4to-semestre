public class Nacionalidades {
    private Integer idNacionalidad;
    private String descripcion, comentario;

    private Nacionalidades(){

    }

    public void setIdNacionalidad(Integer idNacionalidad){ 
        this.idNacionalidad = idNacionalidad;
    }

    public Integer getIdNacionalidad(){
        return idNacionalidad;
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
