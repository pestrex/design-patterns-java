package model;

import java.time.LocalDate;

public class Login {
	private static Login log;
	
	private User user;
	
	private Login() {
		user = new User();
	}
	
	public static Login getInstance() {
		
		if(log == null){
			log = new Login();
		}
		return log;
		
	}
	
	public boolean autenticacion(String nombre, String contraseña) {
		// comprueba el usuario y contraseña para efectuar el inicio de sesión
		if(nombre.equals(user.getNombre()) && contraseña.equals(user.getContraseña())) {
			System.out.println("\n\n" + user.getNombre() + " ha ejecutado la aplicación");
			System.out.println("fecha: " + LocalDate.now());
			return true;
		} else {
			System.out.println("Falla de Autenticación");
			return false;
		}
		
	}
}
