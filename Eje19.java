import java.util.Scanner;
public class Eje19 {

	public static void main(String[] args) {

		/* Leer dos números por teclado y mostrar el resultado de la 
		división del primero por el segundo, se comprueba que el divisor
		es distinto de cero.                           */
		Scanner sc = new Scanner(System.in);
		double dividendo, divisor;
		
		System.out.println("Escriba un número para el dividiendo");
		dividendo=sc.nextDouble();
		
		System.out.println("Escriba un número para el divisor");
		divisor=sc.nextDouble();
		
		if (divisor == 0) {
			System.out.println("No se puede dividir por 0");
		} else {
			System.out.println("La división de "+dividendo+" por "+divisor+" es: "
					+ dividendo/divisor);
		}
	
	}
}

	