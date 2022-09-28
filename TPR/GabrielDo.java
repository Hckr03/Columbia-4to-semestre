import java.io.*;

public class GabrielDo {
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
        do{
            System.out.println(i+1);
            i++;
        }while(i<Integer.parseInt(numero));
    }
}
