package POO.Clases;

import java.util.Date;

public class Personas {
    //atributos
    //tipo de visibilidad - Clase de datos o primitivo - denominacion
    private Date fechaNacimiento;
    private String nombres, apellidos, nroTelefono;
    private Integer cedula;
    private Boolean esFemenina;

    public Personas() {
        System.out.println("Desde el constructor");
    }

    //sobrecarga de metodos: para sobrecargar un metodo
    //el metodo sobrecargado debe tener un argumento, osea,
    //espera recibir uno o mas valores
    public Personas(String nombres, String apellidos) {
        System.out.println("Nombres: " + nombres +" Apellidos: " + apellidos);
    }

    public Personas(Integer cedula, String nombres, String apellidos) {
        System.out.println("Cedula: " + cedula + " Nombres: " + nombres + " Apellidos: " + apellidos);
    }

    public void calcularEdad() {
        System.out.println("Edad de la persona");
    }

    public void imprimirSexo() {

    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void imprimirNombres() {
        //sintaxis de metodo: tipo de visibilidad | tipo de metodo | abertura y cierre de parentesis
        System.out.println(nombres);
    }

    public String getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public Boolean getEsFemenina() {
        return esFemenina;
    }

    public void setEsFemenina(Boolean esFemenina) {
        this.esFemenina = esFemenina;
    }

}
