import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GabrielFor {
    public static void main(String[] args){
        BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
        String numero = "";
        System.out.print("Por favor ingrese un número: ");
        try{
          numero = dato.readLine();
        }catch(IOException e){
         System.out.println("Error!");
        }
        for(int i=0 ; i<Integer.parseInt(numero) ; ++i){
            System.out.println(i+1);
        }
    }
    
}
