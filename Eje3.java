import java.util.Scanner;
public class Eje3 {

	public static void main(String[] args) {
		
		/* Escribe un n�mero entero por teclado y muestra el n�mero en pantalla, 
		adem�s muestra el doble y el triple del n�mero */
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Escriba un n�mero por favor");
		num=sc.nextInt();
		
		System.out.println("El n�mero escrito es " +num);
		System.out.println("El doble de " +num+ " es " +(2*num));
		System.out.println("El triple de " +num+ " es " +(3*num));
		
	}

}
