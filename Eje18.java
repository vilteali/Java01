import java.util.Scanner;
public class Eje18 {

	public static void main(String[] args) {

		// Introducir dos carácteres y imprimir si son iguales(No diferencia mayus de minus)
		Scanner sc = new Scanner(System.in);
		char a, b;
		
		System.out.println("Escriba un carácter");
		a=sc.nextLine().charAt(0);
		
		System.out.println("Escriba otro carácter");
		b=sc.nextLine().charAt(0);
		
		if (a == b) {
			System.out.println(a+" y "+b+" son iguales");
		}
		else {
			System.out.println(a+" y "+b+" son distintos");
		}	
		
	}

}
