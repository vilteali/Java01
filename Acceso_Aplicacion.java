import javax.swing.*;

public class Acceso_Aplicacion {

	public static void main(String[] args) {

		String clave="Ivan";
		
		String pass="";
		
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("Contrase�a incorrecta");
				
			}
			
		}
		
		System.out.println("Contrase�a correcta. Acceso permitido");
		
		
	}

}
