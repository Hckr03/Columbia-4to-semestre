public class Ejemplo18{
	public static void main(String[] args){
		int x = 0;
		String msg = "";
		while (x < 10){
			//msg = msg + x;
			msg += x + "\n";
			//x = x + 1;
			x++;
		}
		System.out.println(msg);
	}
}