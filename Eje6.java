import java.text.DecimalFormat;
import java.util.Scanner;
public class Eje6 {

	public static void main(String[] args) {

		/* Programa que pase una velocidad en Km/h a m/s  */
		Scanner entrada = new Scanner(System.in);
		double velocidad, ms;
		
		System.out.println("Introduzca velocidad en Km/h");
		velocidad=entrada.nextDouble();
		
		ms=velocidad*0.2778; // Convertimos km/h a m/s
		DecimalFormat msformat = new DecimalFormat("#.00"); // Limitamos la cantidad de decimales
		
		System.out.println(velocidad + " Km/h son > " +msformat.format(ms)+ " M/s");
		
	}

}
