import java.util.Scanner;

public class Cuentas {

	public static void main(String[] args) {
		
		/* Programa que lee por teclado el valor del radio de una circunferencia,
		calcula y muestra por pantalla la longitud y el área de la circunferencia.  */
		Scanner entrada = new Scanner(System.in);
		double radio, longitud, area;
		
		System.out.println("Introduce el radio de la circunferencia");
		radio=entrada.nextDouble();
		
		longitud = Math.round(2 * Math.PI * radio);
		area = Math.round(Math.PI * Math.pow(radio, 2));
		
		System.out.println("Longitud de la circunferencia > " +longitud);
		System.out.println("Áre de la circunferencia > " +area);
		
	}

}
