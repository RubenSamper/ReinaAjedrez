package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {

	private static Reina reina;

	public static void main(String[] args) {

		int aux;
		do {
			System.out.println("-----------------------------------------------------------");
			Consola.mostrarMenu();
			System.out.println("-----------------------------------------------------------");
			aux = Consola.elegirOpcionMenu();
			ejecutarOpcion(aux);
		} while (aux != 4);

	}

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {

		case 1:
			crearReinaDefecto();
			mostrarReina();
			System.out.println("-----------------------------------------------------------");
			break;
		case 2:
			crearReinaColor();
			mostrarReina();
			System.out.println("-----------------------------------------------------------");
			break;
		case 3:
			mover();
			mostrarReina();
			System.out.println("-----------------------------------------------------------");
			break;
		case 4:
			System.out.println("-----------------------------------------------------------");
			Consola.despedirse();
			System.out.println("-----------------------------------------------------------");

			break;
		}
	}

	private static Reina crearReinaDefecto() {
		reina = new Reina();
		return reina;
	}

	private static Reina crearReinaColor() {
		System.out.println("-----------------------------------------------------------");
		reina = new Reina(Consola.elegirColor());
		return reina;
	}

	private static void mover() {
		System.out.println("-----------------------------------------------------------");
		Consola.mostrarMenuDirecciones();
		try {
			System.out.println("-----------------------------------------------------------");
			reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());
		} catch (OperationNotSupportedException | IllegalArgumentException | NullPointerException  ae) {
			System.out.println(ae.getMessage());
		}

	}

	private static void mostrarReina() {

		if (reina == null) {
			System.out.println("La reina no ha sido creada, crea una.");
		}else {
			System.out.println(reina);
		}
	}
}