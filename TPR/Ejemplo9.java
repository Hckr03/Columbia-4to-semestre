import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo9 {
    public static void main(String[] args){
        BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
        String nombre = "";
        String apellido = "";
        System.out.print("Por favor ingrese su nombre: ");
        try{
          nombre = dato.readLine();
          System.out.print("Por favor ingrese su apellido: ");
          apellido = dato.readLine();
        }catch(IOException e){
         System.out.println("Error!");
        }
        System.out.println("Hola " +nombre+ " " +apellido+ "!");
    }
}
