import java.util.Scanner;
public class Eje5 {

	public static void main(String[] args) {

		/* Programa que lee por teclado el valor del radio de una circunferencia,
		calcula y muestra por pantalla la longitud y el �rea de la circunferencia.  */
		Scanner entrada = new Scanner(System.in);
		double radio, longitud, area;
		
		System.out.println("Introduce el radio de la circunferencia");
		radio=entrada.nextDouble();
		
		longitud = (2 * Math.PI * radio);
		area = (Math.PI * Math.pow(radio, 2));
		
		System.out.println("Longitud de la circunferencia > " +longitud);
		System.out.println("�re de la circunferencia > " +area);
		
	}

}
