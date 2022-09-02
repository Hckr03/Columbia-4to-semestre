package Herencia;

public class TestHerencia {
    Barrios barrio;

    public TestHerencia() {
        barrio = new Barrios();
        barrio.setDescripcion("Lambare");
        barrio.setId(1);
        barrio.setComentario("Esto esta heredado");
        barrio.setCantidadHabitantes("233");

//        System.out.println("Este es de test "+ barrio.getId());
        System.out.println("Descripción: "+ barrio.getDescripcion());
        System.out.println("Comentario: "+ barrio.getComentario());
        System.out.println("Habitantes: "+ barrio.getCantidadHabitantes());
    }

    public static void main(String[] args) {
        new TestHerencia();
    }
}
