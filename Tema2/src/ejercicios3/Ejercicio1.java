package ejercicios3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Escribe un programa que invente un nº aleatorio entre 1 y 10. El
		// usuario tendrá que adivinarlo en
		// tres intentos como máximo. Al finalizar el programa se le dirá si ha
		// acertado el número y en cuántos
		// intentos lo ha hecho. Utiliza while y break.
		// Ayuda: Puedes generar un número aleatorio mayor o igual a 0 y menor
		// que 1 con la orden
		// Math.random( ). Si lo multiplicas por 10 y le sumas 1, entonces
		// obtendrás un número entre 1 y 10,
		// ambos inclusive:
		// (int) (Math.random()*10 + 1)

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
			} else {
				System.out.println("Has fallado :(");

			}
			i++;

		}

	}

}