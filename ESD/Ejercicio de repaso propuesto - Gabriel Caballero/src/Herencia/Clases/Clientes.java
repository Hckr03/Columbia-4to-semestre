package Herencia.Clases;

public class Clientes extends Personas{
    private Integer nroRuc;
    private Integer digitoVerificador;
    private String razonSocial;

    public Clientes(){

    }

    @Override
    public void setNroTelefono(String nroTelefono) {
        if(nroTelefono.isEmpty()){
            nroTelefono = "0";
        }
        super.setNroTelefono(nroTelefono);
    }

    @Override
    public void setDireccion(String direccion) {
        if(direccion.isEmpty()){
            direccion = "(vacio)";
        }
        super.setDireccion(direccion);
    }

    public void setNroRuc(Integer nroRuc){
        this.nroRuc = nroRuc;
    }

    public Integer getNroRuc(){
        return nroRuc;
    }

    public void setDigitoVerificador(Integer digitoVerificador){
        this.digitoVerificador = digitoVerificador;
    }

    public Integer getDigitoVerificador(){
        return digitoVerificador;
    }

    public void setRazonSocial(String razonSocial){
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial(){
        return razonSocial;
    }
}
