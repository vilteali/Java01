import java.util.Scanner;
public class Eje2 {

	public static void main(String[] args) {
		
		// Programa que pide el nombre y imprime en pantalla "Buenos d�as nombre"
		Scanner entrada = new Scanner(System.in);
		String nombre;
		
		System.out.println("Introduzca su nombre por favor");
		nombre=entrada.nextLine();
		
		System.out.println("Buenos d�as " +nombre);
		
	}

}
