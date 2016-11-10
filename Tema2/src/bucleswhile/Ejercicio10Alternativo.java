package bucleswhile;

import java.util.Scanner;

public class Ejercicio10Alternativo {

	public static void main(String[] args) {

		// Trivial. Escribe una aplicación que haga una pregunta y
		// muestre un menú con cuatro posibles respuestas numeradas. Por
		// ejemplo:

		Scanner entrada = new Scanner(System.in);

		System.out
				.println("¿Cómo se escribe 30 en hexadecimal? \n1) 1E \n2) 2F \n3) 33 \n4) Ninguno de los anteriores");

		final int respuestaCorrecta = 1;
		int respuesta;

		respuesta = entrada.nextInt();

		while (respuesta != respuestaCorrecta) {
			if (respuesta < 1 || respuesta > 4) {
				System.out.println("Fallaste, el número tiene que estar entre 1 y 4");
			} else {
				System.out.println(
						"¿Cómo se escribe 30 en hexadecimal) \n1) 1E \n2) 2F \n3) 33 \n4) Ninguno de los anteriores");
			}

			respuesta = entrada.nextInt();
		}

		System.out.println("La respuesta es " + respuestaCorrecta + "\n\nPrograma finalizado");
	}

}