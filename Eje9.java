import java.util.Scanner;
public class Eje9 {

	public static void main(String[] args) {

		/* Programa que calcule el área de un triángulo en función de las longitudes 
		de sus lados (a, b, c) según la siguiente fórmula: 
		
		Área = RaízCuadrada (p*(p-a)*(p-b)*(p-c)) donde p = (a+b+c)/2   */
		  
		Scanner sc = new Scanner(System.in);
		double ladoA,ladoB,ladoC, p;
		
		System.out.println("Introduca la longitud del primer lado del triángulo:");
		ladoA=sc.nextDouble();
		
		System.out.println("Introduzca la longitud del segundo lado del triángulo:");
		ladoB=sc.nextDouble();
		
		System.out.println("Introduzca la longitud del tercer lado del triángulo:");
		ladoC=sc.nextDouble();
		
		p=(ladoA+ladoB+ladoC)/2;
		
		System.out.println("Área total: " +Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC)));	
		
		
		
		
		
		
		
	}

}
