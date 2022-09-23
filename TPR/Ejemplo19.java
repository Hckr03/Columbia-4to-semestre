public class Ejemplo19{
	public static void main(String[] args){
		int x = 0;
		String msg = "";

		do{
			msg += x + "\n";
			x++;
		}while(x < 10);

		System.out.println(msg);
	}
}