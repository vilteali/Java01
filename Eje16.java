import java.util.Scanner;
public class Eje16 {

	public static void main(String[] args) {

		// Programa que lea un número y muestre si es múltiplo de 10
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Escriba un número por favor");
		num=sc.nextInt();
		
		if (num%2==0) {
			System.out.println("El "+num+ " sí, es múltiplo de 10");
		} 
		else 
			System.out.println("El "+num+ " no, es múltiplo de 10");
		
	}

}
