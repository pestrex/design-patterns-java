package main;

import model.Login;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Login log = Login.getInstance();
		
		System.out.println("==========================");
		System.out.println("==== Inicio de sesión ====");
		System.out.println("==========================");
		System.out.print("Nombre: ");
		String nombre = scan.nextLine();
		System.out.print("Contraseña: ");
		String contraseña = scan.nextLine();
				
		log.autenticacion(nombre, contraseña);
	}
	
}
