package ejercicios3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// 2.- Añade al final del programa anterior el código necesario para que
		// indique la puntuación obtenida
		// por el jugador:
		// • Si ha acertado en un intento → Recibe 10 puntos.
		// • Si ha acertado en dos intentos → Recibe 5 puntos.
		// • Si ha acertado en tres intentos → Recibe 2 puntos.
		// • En otro caso → Recibe 0 puntos.

		Scanner entrada = new Scanner(System.in);

		int numeroAleatorio = (int) (Math.random() * 10 + 1);
		int i = 1;
		int numero;

		// si queremos saber el número aleatorio descomentar la siguiente línea

		System.out.println(numeroAleatorio);

		while (i <= 3) {
			
			System.out.println("Número");
			numero = entrada.nextInt();
			if (numero == numeroAleatorio) {
				System.out.println("Has acertado en " + i + " intentos");
				break;
			}
			i++;

		}

		switch (i) {
		case 1:
			System.out.println("Recibes 10 puntos");
			break;
		case 2:
			System.out.println("Recibes 5 puntos");
			break;
		case 3:
			System.out.println("Recibes 2 puntos");
			break;
		default:
			System.out.println("Recibes 0 puntos");
		}

	}
	
	
	
	
	
	
	
	
	
}