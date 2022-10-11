package PostParcialPractica;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    private Departamentos departamento;
    private List<Ciudades> ciudades;
    private List<Barrios> barrios;

    public Test() {
        departamento = new Departamentos();
        barrios = new ArrayList<>();
        ciudades = new ArrayList<>();

        departamento.setId(1);
        departamento.setDescripcion("Central");

        barrios.add(new Barrios(1, "San Roque"));
        barrios.add(new Barrios(2, "Trinidad"));
        barrios.add(new Barrios(3, "Obrero"));
        ciudades.add(new Ciudades(barrios ,1, "Asunción"));

        barrios.clear();
        barrios.add(new Barrios(1, "Primer Barrio"));
        barrios.add(new Barrios(2, "Segundo Barrio"));
        barrios.add(new Barrios(3, "Tercer Barrio"));
        ciudades.add(new Ciudades(barrios, 2, "Luque"));

        departamento.setCiudades(ciudades);

        System.out.println("Id Dpto: " + departamento.getId());
        System.out.println("Descripcion Dpto: " + departamento.getDescripcion());
        for(Ciudades c: departamento.getCiudades()) {
            System.out.println("Id Ciudad: " + c.getId());
            System.out.println("Descripcion Ciudad: " + c.getDescripcion());
            for(Barrios b: c.getBarrios()){
                System.out.println("Id Barrio: " + b.getId());
                System.out.println("Descripcion Barrio: " + b.getDescripcion());
            }
        };

    }

    public static void main(String[] args) {

        new Test();
    }
}
