import java.util.Scanner;
public class Eje17 {

	public static void main(String[] args) {

		// Leer un carácter por teclado y comprobar si es una letra mayúscula
		Scanner in=new Scanner(System.in);
		char letra;
		
		System.out.println("Introduzca un carácter");
		letra=in.nextLine().charAt(0);
			
		if (Character.isUpperCase(letra))
			
			System.out.println("Es una letra mayúscula");
		else 
			System.out.println("Es una letra minúscula");
		
	}

}
