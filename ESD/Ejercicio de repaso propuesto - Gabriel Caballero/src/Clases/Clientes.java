package Clases;

import java.util.List;

public class Clientes {
    private Integer nroCiNroRuc, nroTelefono;
    private String nombreRazonSocial, direccion;
    private List<Nacionalidades> listaNacionalidades;
    private Ciudades ciudad;

    public void setListaNacionalidades(List<Nacionalidades> listaNacionalidades){
        this.listaNacionalidades = listaNacionalidades;
    }

    public List<Nacionalidades> getListaNacionalidades(){
        return listaNacionalidades;
    }

    public void setCiudades(Ciudades ciudad){
        this.ciudad = ciudad;
    }

    public Ciudades getCiudades(){
        return ciudad;
    }

    public void setNroCiNroRuc(Integer nroCiNroRuc){
        this.nroCiNroRuc = nroCiNroRuc;
    }

    public Integer getNroCiNroRuc(){
        return nroCiNroRuc;
    }
    
    public void setNroTelefono(Integer nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public Integer getNroTelefono() {
        return nroTelefono;
    }

    public void setNombreRazonSocial(String nombreRazonSocial){
        this.nombreRazonSocial = nombreRazonSocial;
    }

    public String getNombreRazonSocial(){
        return nombreRazonSocial;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getDireccion(){
        return direccion;
    }

    public Clientes() {
        System.out.println("Gabriel estas en el constructor que no recibe parametros jeje");
        System.out.println("Telefono " +nroTelefono);
    }

    public Clientes(Integer nroCiNroRuc) {
        System.out.println("Hola" + nroCiNroRuc);
    }

    public Clientes(String nombreRazonSocial) {

    }

    public Clientes(Integer nroCiNroRuc, String nombreRazonSocial ) {

    }

}
