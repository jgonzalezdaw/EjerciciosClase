package condicionales;

import java.util.*;

public class Ejercicio19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número entre el 1 y el 10");

		if (entrada.hasNextInt()) {

			int numero = entrada.nextInt();

			if (numero >= 1 && numero <= 10) {
				System.out.println("Tienes " + numero + ".");

				if (numero == 3) {
					System.out.println("Has acertado");
				}
			}

		} else {
			System.out.println("Número incorrecto");
		}

	}
}