import java.io.*;

public class Ejemplo17 {
    public static void main(String[] args){
		BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
		int numero = 0;
		String resultado = "";
		System.out.print("Ingrese su numero: ");
		try{
			numero = Integer.parseInt(dato.readLine());
			resultado = (((numero %3) == 0) && ((numero %5) == 0))? "Es multiplo de 3 y 5":"No es multiplo de 3 y 5";
		}catch(IOException e){
			System.out.println("Error!");
		}
		
		System.out.println(resultado);
    }
}
