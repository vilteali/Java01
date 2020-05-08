import java.util.Scanner;
public class Eje22 {

	public static void main(String[] args) {

		/* Introducir dos n�meros enteros por teclado y mostrarlos en pantalla
		 * desde el menor hasta el mayor de los n�meros introducidos. Los dos 
		 * n�meros introducidos deben ser distintos. Si son iguales se mostrar� 
		 * un mensaje indic�ndolo y se vuelve a introducir.       */
		
		Scanner sc = new Scanner(System.in);
 		int n1, n2, menor, mayor;
 		
 		// Lectura de datos ingresados
 		do {
 			System.out.println("Introduzca el primer n�mero");
 			n1=sc.nextInt();
 			System.out.println("Introduzca el segundo n�mero");
 			n2=sc.nextInt();
 			
 			if (n1 == n2) {
 				System.out.println("\nVuelva a introducir dos n�meros distintos");
 			}
 			
 		} while (n1==n2);
		
 		// Calcular cu�l es el menor y el mayor
 		if (n1 > n2) {
 			mayor=n1;
 			menor=n2;
 		} else {
 			mayor=n2;
 			menor=n1;
 		}
 		
 		System.out.println("\nN�meros desde "+menor+" hasta "+mayor+":");
 		
 		for(int i=menor; i <= mayor; i++) {
 			System.out.println(i);
 		}
 		
	}

}
