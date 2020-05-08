import java.util.Scanner;
public class Eje22 {

	public static void main(String[] args) {

		/* Introducir dos números enteros por teclado y mostrarlos en pantalla
		 * desde el menor hasta el mayor de los números introducidos. Los dos 
		 * números introducidos deben ser distintos. Si son iguales se mostrará 
		 * un mensaje indicándolo y se vuelve a introducir.       */
		
		Scanner sc = new Scanner(System.in);
 		int n1, n2, menor, mayor;
 		
 		// Lectura de datos ingresados
 		do {
 			System.out.println("Introduzca el primer número");
 			n1=sc.nextInt();
 			System.out.println("Introduzca el segundo número");
 			n2=sc.nextInt();
 			
 			if (n1 == n2) {
 				System.out.println("\nVuelva a introducir dos números distintos");
 			}
 			
 		} while (n1==n2);
		
 		// Calcular cuál es el menor y el mayor
 		if (n1 > n2) {
 			mayor=n1;
 			menor=n2;
 		} else {
 			mayor=n2;
 			menor=n1;
 		}
 		
 		System.out.println("\nNúmeros desde "+menor+" hasta "+mayor+":");
 		
 		for(int i=menor; i <= mayor; i++) {
 			System.out.println(i);
 		}
 		
	}

}
