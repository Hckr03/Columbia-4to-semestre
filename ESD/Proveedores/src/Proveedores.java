public class Proveedores {
    //declaracion de varaibles con visibilidad privada
    private Integer nroRuc, nroTelefono;
    private String razonSocial, correo, representanteLegal;


    //setters y getters
    public void setNroRuc(Integer nroRuc){
        this.nroRuc = nroRuc;
    }

    public Integer getNroRuc(){
        return nroRuc;
    }

    public void setNroTelefono(Integer nroTelefono){
        this.nroTelefono = nroTelefono;
    }

    public Integer getNroTelefono(){
        return nroTelefono;
    }

    public void setRazonSocial(String razonSocial){
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial(){
        return razonSocial;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    //constructores
    public Proveedores(){

    }

    public Proveedores(String nroRuc, String nroTelefono){
        System.out.println("El ruc o CI es: " +nroRuc);
        System.out.println("Telefono: " +nroTelefono);
    }

}
