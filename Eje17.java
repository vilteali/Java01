import java.util.Scanner;
public class Eje17 {

	public static void main(String[] args) {

		// Leer un car�cter por teclado y comprobar si es una letra may�scula
		Scanner in=new Scanner(System.in);
		char letra;
		
		System.out.println("Introduzca un car�cter");
		letra=in.nextLine().charAt(0);
			
		if (Character.isUpperCase(letra))
			
			System.out.println("Es una letra may�scula");
		else 
			System.out.println("Es una letra min�scula");
		
	}

}
