import java.util.Scanner;
public class Eje10 {

	public static void main(String[] args) {

		// Introducir un número de 3 cifras y mostrar las cifras del número
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Digite un número de 3 cifras");
		n=sc.nextInt();
		
		System.out.println("El primer digito de "+n+" es "+ (n/100));
		System.out.println("El segundo digito de "+n+" es "+ (n/10)%10);
		System.out.println("El tercer dito de "+n+" es "+ (n%10));
		
	}

}
