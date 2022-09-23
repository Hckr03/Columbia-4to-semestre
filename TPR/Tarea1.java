public class Tarea1 {
    public static void main(String[] args){
		int i = 8, j=5;
		float x = 0.005F, y = -0.01F;
     	char c = 'c', d = 'd';

		String resultado = "";
		
		resultado = ((3 * i - 2 * j) % (2 * d - c) > 3 * d)?"True":"False";
		
        	System.out.println(resultado);
    }
}
