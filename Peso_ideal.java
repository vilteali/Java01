import java.util.Scanner;

public class Peso_ideal {

	public static void main(String[] args) {
	
	Scanner entrada= new Scanner (System.in);	
	String genero="";
	int altura=0, pesoIdeal=0;
	
	
	do {
		
		System.out.println("Introduzca su género H/M");
		genero=entrada.nextLine();
		
	} while (genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")==false);
	
		System.out.println("Ingrese su altura en cm");
		altura=entrada.nextInt();
		
		if (genero.equalsIgnoreCase("H")) {
			pesoIdeal = altura-110;
		}
		else if (genero.equalsIgnoreCase("M")) {
			pesoIdeal = altura-120;
		}
	
	System.out.println("Tu peso ideal es " +pesoIdeal+ " kgs");
		
	}

}
