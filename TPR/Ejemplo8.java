public class Ejemplo8 {
    public static void main(String[] args){
        String nombre = args[0] + " " + args[1] + " " + args[2] + " " + args[3];
        String estado = null;
        int num1 = Integer.parseInt(args[4]);
        int num2 = Integer.parseInt(args[5]);
        estado = (num1%2 == 0)?"par":"impar";
        System.out.println("Bienvenido " + nombre);
        System.out.println("El primer numero es: " + num1 + " : " + estado);
        estado = (num2%2 == 0)?"par":"impar";
        System.out.println("El segundo numero es: " + num2 + " : " + estado);
    }
}
