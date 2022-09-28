import java.io.*;

public class GabrielWhile {
    public static void main(String[] args){
        BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
        String numero = "";
        int i=0;
        System.out.print("Por favor ingrese un número: ");
        try{
          numero = dato.readLine();
        }catch(IOException e){
         System.out.println("Error!");
        }
        while(i<Integer.parseInt(numero)){
            System.out.println(i+1);
            i++;
        }
    }
}
