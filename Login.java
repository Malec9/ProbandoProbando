package Login;

import java.util.Scanner;
/**
 * programa para loguearse en el sistema
 * @author Pablo Ortiz
 * @version 1.0
 */
public class Login {
	/**
	 * comprueba si los parametros de login son correctos
	 * @param usuario usuario del cliente
	 * @param contrasenia contraseña del cliente
	 * @return bool 
	 */
	public static boolean login(String usuario, String contrasenia) {
		
		if (usuario.compareTo("usuario") == 0 && contrasenia.compareTo("usuario") == 0)  {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Este metodo se inicializa nada mas ejecutar el programa
	 * Preguntara por usuario y contrase�a para entrar al sistema
	 * @param args parametro por defecto
	 * @see login
	 */
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in); 
		String user;
		String passw;
		
		System.out.print("Ingresa tu usuario: ");
		user = sc.next();
		
		System.out.print("Ingresa tu contrase�a: ");
		passw = sc.next();
		
		
		if (login(user, passw)) {
			System.out.println("Ha entrado correctamente al sistema");
		}
		
		else {
			System.out.print("Usuario o contrase�a incorrectos");
		}
	}
}

