import java.util.Scanner;

public class Entrada_1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre, por favor ");
		String usuario=entrada.nextLine();
		
		System.out.println("Introduce edad, por favor");
		int edad=entrada.nextInt();
		
		System.out.println("Hola " +usuario+ ". El año que viene tendrás " +(edad+1)+ " años.");
	}

}
