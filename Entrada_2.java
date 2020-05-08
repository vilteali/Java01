import javax.swing.*;

public class Entrada_2 {

	public static void main(String[] args) {

		String nomre_usuario=JOptionPane.showInputDialog("Introduce tu nombre por favor");
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad por favor");
		int edad_i=Integer.parseInt(edad);
		edad_i++;
		
		System.out.println("Hola " +nomre_usuario+ ". El otro año tendras " +(edad_i)+ " años");
		
	
	}
	

}
