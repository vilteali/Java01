import java.util.Scanner;
public class Eje16 {

	public static void main(String[] args) {

		// Programa que lea un n�mero y muestre si es m�ltiplo de 10
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Escriba un n�mero por favor");
		num=sc.nextInt();
		
		if (num%2==0) {
			System.out.println("El "+num+ " s�, es m�ltiplo de 10");
		} 
		else 
			System.out.println("El "+num+ " no, es m�ltiplo de 10");
		
	}

}
