package condicionales;

import java.util.Scanner;

public class Condicionales7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Elige una opción:");

		System.out.println("(1) Crear archivo");
		System.out.println("(2) Renombrar archivo");
		System.out.println("(3) Borrar archivo");
		System.out.println("(4) Salir");

		System.out.print("? ");
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Creando archivo...");
			break;

		case 2:
			System.out.println("Renombrando archivo...");
			break;

		case 3:
			System.out.println("Borrando archivo...");
			break;

		case 4:
			System.out.println("Saliendo...");
			break;
		default:
			System.out.println("Opción incorrecta");

		}

	}

}
