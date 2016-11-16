package bucleswhile;

import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int opcion = 0;
		boolean valido = false; // Variable semáforo.

		while (valido == false) {
			System.out.println("¿Cómo se escribe 30 en hexadecimal?"
					+ "\n 1) 1E \n 2) 2F \n 3) 33 \n 4) Ninguno de los anteriores");

			opcion = input.nextInt();
			if (opcion > 0 && opcion <= 4) {
				valido = true;

				if (opcion == 1) {
					System.out.println("Correcto.");
				} else {
					System.out.println("Incorrecto.");
				}
			}

		}
	}
}