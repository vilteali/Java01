import java.util.Scanner;

public class Eje11 {

	public static void main(String[] args) {

		// Leer un número de 5 cifras y mostrar sus cifras de manera ascendente
		
		Scanner k = new Scanner(System.in);
		int x,y;
		
		System.out.println("Digite un número entero de 5 cifras");
		x=k.nextInt();
		
		System.out.println(x/10000);
		System.out.println(x/1000);
		System.out.println(x/100);
		System.out.println(x/10);
		System.out.println(x);
		
		// Ahora de manera contraria 
		
		System.out.println("\nDigite un número entero de 5 cifras");
		y=k.nextInt();
		
		System.out.println(y);
		System.out.println(y/10);
		System.out.println(y/100);
		System.out.println(y/1000);
		System.out.println(y/10000);
		
		
		
		
		
	}

}
