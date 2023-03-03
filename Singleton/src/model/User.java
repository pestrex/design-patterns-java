package model;

public class User {
	
	private String nombre;
	private String contraseña;
	
	public User() {
		// Usuario por defecto
		nombre = "Pedro";
		contraseña = "12345";
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
