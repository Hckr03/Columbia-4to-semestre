package Herencia;

public class Barrios extends Base {
    private String cantidadHabitantes;

    public void setCantidadHabitantes(String cantidadHabitantes){
        this.cantidadHabitantes = cantidadHabitantes;
    }

    @Override
    public void setId(Integer id) {
        //al sobreescribir y poner un print aca, no hace falta usar el getId en el test, porque obviamente aqui
        //esta sobreescrito y esta el print
        System.out.println("Id: " +id + " Barrio");
    }


    public String getCantidadHabitantes(){
        return cantidadHabitantes;
    }
}
