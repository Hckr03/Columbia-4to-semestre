package Contratos;

import java.util.Date;

public class Personas {

//    public int id, nro_cedula;
//    el tipo de variable "int" no soporta la cantidad de numeros que tiene un CI
    public Integer id, nro_cedula; //nueva declaracion de variables

//    public char nombres, apellidos, nro_telefono;
//    el tipo de variable "char" no es capaz de recibir textos muy extensos
    public String nombres, apellidos, nro_telefono; //nueva declaracion de variables
    public Date fechaNac;

//    el constructor se modifico el tipo de datos o parametros para que coincida con los nuevas variables declaradas
    public Personas (Integer id, Integer nro_cedula, String nombres, String apellidos, String nro_telefono, Date fechaNac){
        this.id = id;
        this.nro_cedula = nro_cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nro_telefono = nro_telefono;
        this.fechaNac = fechaNac;
    }

    public void setId(Integer id) {//se cambio el tipo de dato del setter, antes int ahora Integer
        this.id = id;
    }//no poseia getter
    public Integer getId(){
        return id;
    }

    public void setNro_cedula(Integer nro_cedula) {//se cambio el tipo de dato del setter, antes int ahora Integer
        this.nro_cedula = nro_cedula;
    }

    public Integer getNro_cedula() {//se cambio el tipo de dato del getter, antes int ahora Integer
        return nro_cedula;
    }

    public void setNombres(String nombres) {//se cambio el tipo de dato, antes char ahora String
        this.nombres = nombres;
    }//no poseia getter
    public String getNombres(){
        return nombres;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }//no poseia getter
    public Date getFechaNac(){
        return fechaNac;
    }

    public String getApellidos() {//se cambio el tipo de dato, antes char ahora String
        return apellidos;
    }//no posee setter
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    //nro_telefono no poseia setter ni getter
    //setter y getter generados para nro_telefono
    public void setNro_telefono(String nro_telefono){
        this.nro_telefono = nro_telefono;
    }
    public String getNro_telefono(){
        return nro_telefono;
    }

}

