package Herencia.Clases;


import java.util.Date;

public class Funcionarios extends Personas{
    private Integer nroLegajo;
    private Date fechaIngreso;
    private String cargo;

    public Funcionarios(){

    }

    @Override
    public void setNroCedula(String nroCedula) {
        if(nroCedula.isEmpty()){
            nroCedula = "0";
        }
        super.setNroCedula(nroCedula);
    }

    @Override
    public void setNombres(String nombres) {
        if(nombres.isEmpty()){
            nombres = "(vacio)";
        }
        super.setNombres(nombres);
    }

    @Override
    public void setApellidos(String apellidos) {
        if(apellidos.isEmpty()){
            apellidos = "(vacio)";
        }
        super.setApellidos(apellidos);
    }

    public void setNroLegajo(Integer nroLegajo){
        this.nroLegajo = nroLegajo;
    }

    public Integer getNroLegajo(){
        return nroLegajo;
    }

    public void setFechaIngreso(Date fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaIngreso(){
        return fechaIngreso;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String getCargo(){
        return cargo;
    }
}

