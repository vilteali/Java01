import java.util.Scanner;
public class Eje9 {

	public static void main(String[] args) {

		/* Programa que calcule el �rea de un tri�ngulo en funci�n de las longitudes 
		de sus lados (a, b, c) seg�n la siguiente f�rmula: 
		
		�rea = Ra�zCuadrada (p*(p-a)*(p-b)*(p-c)) donde p = (a+b+c)/2   */
		  
		Scanner sc = new Scanner(System.in);
		double ladoA,ladoB,ladoC, p;
		
		System.out.println("Introduca la longitud del primer lado del tri�ngulo:");
		ladoA=sc.nextDouble();
		
		System.out.println("Introduzca la longitud del segundo lado del tri�ngulo:");
		ladoB=sc.nextDouble();
		
		System.out.println("Introduzca la longitud del tercer lado del tri�ngulo:");
		ladoC=sc.nextDouble();
		
		p=(ladoA+ladoB+ladoC)/2;
		
		System.out.println("�rea total: " +Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC)));	
		
		
		
		
		
		
		
	}

}
