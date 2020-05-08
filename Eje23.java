import javax.swing.JOptionPane;
public class Eje23 {

	// Verificar el ingreso de un mail que al menos tenga un '@' y un '.' para ser correctos
	public static void main(String[] args) {
		
		int arroba=0;
		boolean punto=false;
		String mail = JOptionPane.showInputDialog("Introduce tu mail"); 
		
		for(int i=0; i<mail.length(); i++) { // Recorrera la longitud total del mail ingresado
			if(mail.charAt(i)=='@') {		 // Si un índice de la cadena es = '@' entonces se
				arroba++;					 // le suma uno a la variable.
			}
			
			if (mail.charAt(i)=='.') {		 // Si dentro de la cadena encuentra un '.'
				punto=true;					 // cambia el valor a true.
			}
		
		}
		
		// Ahora con el condicional if verificamos los datos para mostrar en pantalla
		if (arroba==1 && punto==true) {
			System.out.println("Es correcta la dirección de mail");
		} else {
			System.out.println("No es correcta la dirección de mail");
		}
	}

}
