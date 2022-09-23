import java.io.*;
public class Ejemplo10 {
	public static void main(String[] args){

		BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));	
		String nombre = "";
		int edad = 0;
		String estado = null;
		System.out.print("Ingrese nombre: ");
		try{
			nombre = dato.readLine();
			System.out.print("Ingrese su edad: ");
			edad = Integer.parseInt(dato.readLine());
			estado = (edad >= 18)?"Mayor de edad":"Menor de edad";
		}catch(IOException e) {
			System.out.println("Error!");
		}
		System.out.println("Su nombre es: " + nombre + "\nSu edad es: " + edad + " \nUsted es: " +estado);
	}
}