public class Manipula_Cadenas_2 {

	public static void main(String[] args) {

		String frase="Hoy es un estupendo día para aprender a programar en Java";
		
		String frase_resumen=frase.substring(29, 57);
		
		System.out.println(frase_resumen);

		// ------------------------------------------- //
		
		String alumno1, alumno2;
		
		alumno1="David"; alumno2="david";
		
		System.out.println(alumno1.equals(alumno2)); 
		System.out.println(alumno1.equalsIgnoreCase(alumno2)); // Ignora las mayus y minus.
		
		// ------------------------------------------- //
		

	}

}
