import java.util.Scanner;

public class Adivina_Numero {

	public static void main(String[] args) {

		// Adivinar el número que genera el programa entre 0 al 100
		Scanner entrada = new Scanner(System.in);
		int aleatorio=(int)(Math.random()*100); // Generar numeros random 
		
		int num=0, intentos=0;
		
		do {
			
			intentos++;
			
			System.out.println("Introduce un numero por favor:"); // Pedimos un numero y lo guardamos en la variable num
			num=entrada.nextInt();
			
			if(aleatorio<num) {
				
				System.out.println("Más bajo");
				
			} else if (aleatorio>num) {
				
				System.out.println("Más alto");
			}
			
		} while (num!=aleatorio);
		
		System.out.println("\nCorrecto! \nLo has conseguido en "+intentos+ " intentos.");
		
	}

}
