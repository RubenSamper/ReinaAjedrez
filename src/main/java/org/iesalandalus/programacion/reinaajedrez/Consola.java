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
	
	public static int elegirOpcionMenu() {
		int aux;

		do {
			System.out.print("Elige una opción válida: ");
			aux = Entrada.entero();
		} while ((aux < 1) || (aux > 4));

		return aux;
	}

	public static Color elegirColor() {
		Color aux1 = null;
		int aux2;

		do {
			System.out.println("Elige un color válido: ");
			System.out.println("1. Blanco.");
			System.out.println("2. Negro.");
			aux2 = Entrada.entero();

		} while ((aux2 != 1) && (aux2 != 2));

		if (aux2 == 1) {
			aux1 = Color.BLANCO;
		} else if (aux2 == 2) {
			aux1 = Color.NEGRO;
		}

		return aux1;
	}

	public static void mostrarMenuDirecciones() {
		System.out.println("1. Norte.");
		System.out.println("2. Noreste.");
		System.out.println("3. Este.");
		System.out.println("4. Sureste.");
		System.out.println("5. Sur.");
		System.out.println("6. Suroeste.");
		System.out.println("7. Oeste.");
		System.out.println("8. Noroeste.");
	}

	public static Direccion elegirDireccion() {
		Direccion aux1 = null;
		int aux2;

		do {
			System.out.print("Introduce una dirección válida: ");
			aux2 = Entrada.entero();
		} while ((aux2 < 1) || (aux2 > 8));

		switch (aux2) {

		case 1:

			aux1 = Direccion.NORTE;
			break;

		case 2:

			aux1 = Direccion.NORESTE;
			break;

		case 3:

			aux1 = Direccion.ESTE;
			break;

		case 4:

			aux1 = Direccion.SURESTE;
			break;

		case 5:

			aux1 = Direccion.SUR;
			break;

		case 6:

			aux1 = Direccion.SUROESTE;
			break;

		case 7:

			aux1 = Direccion.OESTE;
			break;

		case 8:

			aux1 = Direccion.NOROESTE;
			break;
		}
		return aux1;
	}

	public static int elegirPasos() {
		int aux;
		System.out.println("Introduce un número de pasos a mover: ");
		aux = Entrada.entero();

		return aux;
	}

	public static void despedirse() {
		System.out.println("¡Hasta la próxima!");
	}
}
