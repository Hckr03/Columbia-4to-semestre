public class Test {
    Proveedores proveedores, proveedores2;

    public Test(){
        //constructor sobrecargado
        proveedores = new Proveedores("3713700", "0982125910");
        
        //uso de constructor vacio, no espera valores, entonces se usan los setters y  getters
        proveedores2 = new Proveedores();
        proveedores2.setCorreo("gabu.1991@gmail.com");
        System.out.println(proveedores2.getCorreo());

        proveedores2.setRazonSocial("Gabriel Caballero");
        System.out.println(proveedores2.getRazonSocial());

        proveedores2.setRepresentanteLegal("El mismo");
        System.out.println(proveedores2.getRepresentanteLegal());
    }

    public static void main(String[] args){
        new Test();
    }

}
