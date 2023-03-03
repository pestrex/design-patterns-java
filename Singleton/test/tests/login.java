package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Login;

public class login {

	@Test
	public void getInstance() {
		// comprobar autenicación
		String nombre = "Pedro";
		String contraseña = "12345";
		assertTrue(Login.getInstance().autenticacion(nombre, contraseña));
	}
	
	@Test
	public void compararContraseña() {
		// comprobar autenicación
		String nombre = "Pedro";
		String contraseña = "123";
		assertFalse(Login.getInstance().autenticacion(nombre, contraseña));
	}

}
