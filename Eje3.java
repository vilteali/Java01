import java.util.Scanner;
public class Eje3 {

	public static void main(String[] args) {
		
		/* Escribe un número entero por teclado y muestra el número en pantalla, 
		además muestra el doble y el triple del número */
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Escriba un número por favor");
		num=sc.nextInt();
		
		System.out.println("El número escrito es " +num);
		System.out.println("El doble de " +num+ " es " +(2*num));
		System.out.println("El triple de " +num+ " es " +(3*num));
		
	}

}
