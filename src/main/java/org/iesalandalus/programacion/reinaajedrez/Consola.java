package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	public Consola() {

	}
	
	public static void mostrarMenu() {
		System.out.println("1. Crear reina por defecto.");
		System.out.println("2. Crear reina eligiendo el color.");
		System.out.println("3. Mover.");
		System.out.println("4. Salir.");

	}
}
