package POO.Clases;

//nombre de la clase
public class Ejemplo {
    //los atributos de las clases

    // tipo de visibilidad "private" | clase de datos "Integer" | nombre del atributo "valor"
    private Integer valor;
    //se crean los setters y getters para los atributos o variables privadas
    public void setValor(Integer valor) {
        //this. indica a la variable de la clase, no de la variable donde del metodo
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    private String cadena;
    private Boolean estado;


    //el comportamiento de las clases
    //vendria a ser los metodos que tendrian las clases, el comportamiento que queremos
    //a la clase
    public void sumar() {
        System.out.println("Resultado: " + (2+6));
    }

    //se puede tener 2 metodos con el mismo nombre
    //se sobrecarga, para que el segundo metodo con el mismo
    //nombre funcione, tenemos que ponerle que tipo de datos va a recibir
    public void sumar(Integer v, Integer v2) {
        System.out.println("Resultado: " + (v+v2));
    }

    //el metodo constructor es el unico que no necesita crearse
    //es el unico metodo que no necesita tener algun retorno
    //se invoca el metodo constructor para inicializar todos los metodos que uno quiere
    public Ejemplo() {
        System.out.println("Hola soy un constructor");
    }

    public static void main(String[] args) {
        Ejemplo e = new Ejemplo();
        e.sumar();
        e.sumar(10, 10);
    }
}