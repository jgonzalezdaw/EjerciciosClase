package condicionales;

import java.util.Scanner;

public class Condicionales11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuántos años tienes?");

		// El siguiente bucle lee un valor por consola y
		// evalúa si es un entero.
		while (!entrada.hasNextInt()) {

			System.out.println("Entrada incorrecta, prueba de nuevo:");

			// Vaciamos el buffer de entrada, para que al
			// repetirse el bucle, se le vuelva a pedir el dato
			// al usuario.
			entrada.nextLine();

		}

		// Guardamos el valor escrito por consola en la
		// variable edad.
		int edad = entrada.nextInt();
		System.out.println("Tienes " + edad + " años.");

	}

}
