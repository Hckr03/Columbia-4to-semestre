public class Ejemplo21{
	public static void main(String[] args){
		int x = 0;
		String msg = "";

		while(x <= 12){
			switch(x){
				case 1:
					msg += "Enero";
					x++;
				case 2:
					msg += "\nFebrero";
					x++;
				case 3:
					msg += "\nMarzo";
					x++;
				case 4:
					msg += "\nAbril";
					x++;
				case 5:
					msg += "\nMayo";
					x++;
				case 6:
					msg += "\nJunio";
					x++;
				case 7:
					msg += "\nJulio";
					x++;
				case 8:
					msg += "\nAgosto";
					x++;
				case 9:
					msg += "\nSeptiembre";
					x++;
				case 10:
					msg += "\nOctubre";
					x++;
				case 11:
					msg += "\nNoviembre";
					x++;
				case 12:
					msg += "\nDiciembre";
					x++;
				default:
					msg += "entro en el default gua'u";
			}
		System.out.println(msg);
		}
	}
}