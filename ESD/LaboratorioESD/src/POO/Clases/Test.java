package POO.Clases;

public class Test {
    
    private Personas persona, persona2, persona3;

    public Test() {
        persona = new Personas();
        persona.calcularEdad();

        persona2 = new Personas("Gabriel", "Caballero");
        persona2.imprimirNombres();
        persona2.setCedula(123456);
        System.out.println(persona2.getCedula());

        persona3 = new Personas(3713700, "Gabriel", "Caballero");
        persona3.imprimirSexo();
    }

    public static void main(String[] args) {
        new Test();
    }
}
