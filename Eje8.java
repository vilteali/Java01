import java.text.DecimalFormat;
import java.util.Scanner;
public class Eje8 {

	public static void main(String[] args) {

		/* Con un dato de entrada númerico que corresponde a la longitud del radio de una esfera,
		calcular y escribir el volumen de la esfera que corresponde con dicho radio.  
	
		 Fórmula para calcular el volumen de la esfera V = (4/3)*PI*r^3    */
		  
		double radio, volumen;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el radio de la esfera");
		radio=entrada.nextDouble();
		
		volumen=(4.0/3)*Math.PI*Math.pow(radio, 3);
		DecimalFormat volFormat = new DecimalFormat("#.000");
		
		System.out.println("Volumen de la esfera de radio " +radio+ " es " +volFormat.format(volumen));
		
	}

}
