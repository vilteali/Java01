import java.util.Scanner;
public class Eje4 {

	public static void main(String[] args) {

		/* Pasar de grados centrígados a Fahrenheit 
		La formula es: F = 32 + ( 9 * C / 5) */
		Scanner entrada = new Scanner(System.in);
		double gradosC, gradosF;
		
		System.out.println("Introduce temperatura en grados centrígados");
		gradosC=entrada.nextDouble();
		
		gradosF= 32 + (9 * gradosC / 5);
		System.out.println(+gradosC+ " °C a Fahrenheit es > " + gradosF) ;
		
	}

}
