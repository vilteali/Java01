import javax.swing.JOptionPane;

public class Entrada_Numeros {

	public static void main(String[] args) {

		String num1=JOptionPane.showInputDialog("Introduce un n�mero");
		double num1d=Double.parseDouble(num1);
		
		
		System.out.print("La ra�z de " +num1d+ " es ");
		System.out.printf("%1.4f", Math.sqrt(num1d));
		
		
	}

}
