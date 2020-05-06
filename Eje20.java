import java.util.Scanner;
public class Eje20 {

	public static void main(String[] args) {

		/* Leer tres números enteros H, M, S que contienen la hora,
		minutos y segundos respectivamente. Comprobar si los datos 
		ingresados son un formato valido de 24hs.               */
		
		Scanner entrada = new Scanner(System.in);
		int h, m, s;
		
		System.out.println("Ingrese la hora");
		h = entrada.nextInt();
		System.out.println("Ingrese los minutos");
		m = entrada.nextInt();
		System.out.println("Ingrese los segundos");
		s = entrada.nextInt();
		
		if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60)) {
			System.out.println("Hora correcta");
		} else {
			System.out.println("Hora incorrecta");
		}
		
	}

}
