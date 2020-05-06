import java.util.Scanner;
public class Eje7 {

	public static void main(String[] args) {

		/* Leer la longitud de los catetos de un triángulo rectángulo y 
		calcular la longitud de la hipotenusa según el Teorema de Pitágoras */
		
		Scanner entrada = new Scanner(System.in);
		double catetoA, catetoB, hipotenusa;
		
		System.out.println("Introduzca la longitud del primer cateto");
		catetoA=entrada.nextDouble();
		
		System.out.println("Introduzca la longitud del segundo cateto");
		catetoB=entrada.nextDouble();
		
		hipotenusa=Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		
		System.out.println("La Hipotenusa del triángulo rectángulo es " +hipotenusa);
		
	}

}
