import java.util.Scanner;

public class Eje12 {

	public static void main(String[] args) {

		/* Pedir fecha de nacimiento (d�a-mes-a�o) y calcular n�mero de la suerte.
		N�mero de la suerte se obtiene sumando el d�a, mes y el a�o y las cifras obtenidas 
		sumarlas. 
		Ejemplo 11/11/2000 = 11+11+2000 > 2022 --> 2+0+2+2 = 6 es el n�mero de la suerte */
		
		Scanner sc = new Scanner(System.in);
		int dia, mes, a�o, suerte, suma, cifra1, cifra2, cifra3, cifra4;
		
		System.out.println("Introduzca fecha de nacimiento");
		System.out.print("d�a: ");
		dia=sc.nextInt();
		System.out.print("mes: ");
		mes=sc.nextInt();
		System.out.print("a�o: ");
		a�o=sc.nextInt();
	
		suma=dia+mes+a�o;
		
		cifra1=suma/1000;    // Obtener primer cifra
		cifra2=suma/100%10;  // Obtener segunda cifra
		cifra3=suma/10%10;	 // Obtener tercer cifra
		cifra4=suma%10;      // Obtener cuarta cifra
		
		suerte=cifra1+cifra2+cifra3+cifra4;
		
		System.out.println("Su n�mero de la suerte es: "+suerte);
        
	}

}
