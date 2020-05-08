import java.util.Scanner;

public class Evalua_Edad {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int edad=0;
		
		System.out.println("Introduce tu edad, por favor");	
		edad=entrada.nextInt();
		
		if (edad<18) {
			System.out.println("Eres un adolescente");
		}
		else if (edad <40) {
			System.out.println("Eres joven");
		}
		else if (edad < 65) {
			System.out.println("Eres adulto");
		}
		else {
			System.out.println("Cuidate porque sos un viejo choto");
		}
		
	}

}
