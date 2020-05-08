import javax.swing.JOptionPane;

public class Entrada_Numeros {

	public static void main(String[] args) {

		String num1=JOptionPane.showInputDialog("Introduce un número");
		double num1d=Double.parseDouble(num1);
		
		
		System.out.print("La raíz de " +num1d+ " es ");
		System.out.printf("%1.4f", Math.sqrt(num1d));
		
		
	}

}
