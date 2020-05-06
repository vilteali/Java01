import java.util.Scanner;
public class Eje21 {

	public static void main(String[] args) {

		/* Leer una variable entera para mes y comprobar si el valor corresponde
		a un mes de 30 días, 31 o 28 días. Además de mostrar el nombre del mes */
		
		Scanner sc = new Scanner(System.in);
		int mes;
		
		System.out.println("Introduzca el mes");
		mes = sc.nextInt();
		
		if (mes < 1 || mes > 12) { 	// Comprobamos el mes correcto		
			
			System.out.println("Mes incorrecto");
			
		} else {					// Si el mes es correcto
		
			switch (mes) {          // Se muestra el mes según el número
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febrero");
				break;
			case 3: 
				System.out.println("Marzo");
				break;
			case 4: 
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8: 
				System.out.println("Agosto");
				break;
			case 9: 
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;
			default:
				System.out.println("Mes no valido");
				break;
			}
			
		}
		
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			
			System.out.println("Es un mes de 30 días");
			
		} else if (mes == 2) {
			
			System.out.println("Es un mes de 28 días");
			
		} else {
			
			System.out.println("Es un mes de 31 días");
			
		}
			
	}

}	
