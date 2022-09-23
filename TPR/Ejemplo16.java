import javax.swing.JOptionPane;

public class Ejemplo16 {
	public static void main(String[] args){
		String marca = JOptionPane.showInputDialog("Ingrese marca del vehiculo: ");
		String modelo = JOptionPane.showInputDialog("Ingrese modelo del vehiculo: ");
		Integer velocidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su maxima velocidad: "));
		String msg = "";		

		if(velocidad <= 120){
			msg = "Marca: " +marca+ "\nPara paseo";
		}else if((velocidad > 120) && (velocidad <= 250)){
			msg = "Marca: " +marca+ "\nPara diversion";
			}else if(velocidad > 250){
				msg = "Marca: " +marca+ "\nPara carrera";
				}else{
				msg = "Maliiiiiiisimo";
				}
		JOptionPane.showMessageDialog(null,msg);
	}
}