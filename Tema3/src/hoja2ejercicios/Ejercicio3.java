package hoja2ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// 3.- Escribe un programa que lea una lista de nombres (uno a uno,
		// hasta un máximo de 10) por consola y
		// los vaya guardando en un array llamado nombres.
		// La aplicación terminará de pedir palabras cuando el usuario escriba
		// "nadie"

		// A continuación revisará el array y averiguará si se ha introducido el
		// nombre "Calderón".
		// Si es así escribirá "de la Barca". Si no, escribirá "Nombre no
		// encontrado".
		// Utiliza una variable semáforo llamándola nombreEncontrado.

		Scanner entrada = new Scanner(System.in);
		String nombres[] = new String[10];
		boolean nombreEncontrado = false;

		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Ingresa nombre " + (i + 1));
			nombres[i] = entrada.nextLine();
			if (nombres[i].equals("nadie")) {
				System.out.println("programa terminado");
				break;
			}
		}

		int i = 0;
		while (i < nombres.length && !nombreEncontrado 
				&& !nombres[i].equals("nadie")) {
			System.out.println(nombres[i]);
			if (nombres[i].equals("calderon")) {
				nombreEncontrado = true;
			}
			i++;
		}

		if (nombreEncontrado) {
			System.out.println("de la Barca");
		} else {
			System.out.println("Nombre no encontrado");
		}

	}

}






