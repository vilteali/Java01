import javax.swing.JOptionPane;
public class Eje24 {

	public static void main(String[] args) {

		// Calcular el factorial de un número ingresado
		int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número por favor"));
		int resultado=1;
		
		for(int i=num; i>0; i--) {
			
			resultado=resultado*i;
			
		}
		
		System.out.println("El factorial de "+num+" es "+resultado);

	}

}
