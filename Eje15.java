import java.util.Scanner;
public class Eje15 {

	public static void main(String[] args) {

		// Programa que lea un n�mero entero por teclado y calcule si es par o impar
		Scanner entrada = new Scanner(System.in);
		int x;
		
		System.out.println("Introduzca un n�mero por favor");
		x=entrada.nextInt();
		
		if (x%2==0) { // Si el resto de la divisi�n entre 2 es igual a 0 es par
			
			System.out.println("El "+x+ " es par ");
			
		} else {     // Si es distinto de 0 entonces es impar
			
			System.out.println("El "+x+ " es impar");
		} 
		
	}

}
