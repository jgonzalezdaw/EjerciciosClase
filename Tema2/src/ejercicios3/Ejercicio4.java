package ejercicios3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Modifica el programa anterior para que después de decir el resultado
		// te haga la siguiente
		// pregunta:
		// ¿Quieres continuar (s/n)?
		// Si la respuesta es 's', volverá a empezar el bucle. Si la respuesta
		// es cualquier otra, acabará el
		// programa, con un mensaje de despedida.

		// Ayuda: Puedes leer un carácter de la consola con la orden:
		// letra = teclado.next().charAt(0);
		// Esta orden lee un String y devuelve el primer carácter del mismo (el
		// que ocupa la posición 0)

		Scanner entrada = new Scanner(System.in);

		while (true) {
			int numeroAleatorio = (int) (Math.random() * 100 + 1);
			int numeroAleatorio2 = (int) (Math.random() * 100 + 1);
			int resultado;
			System.out.println(numeroAleatorio + "+" + numeroAleatorio2 + "=");
			System.out.println("¿Resultado?");
			resultado = entrada.nextInt();
			int suma = numeroAleatorio + numeroAleatorio2;
			if (resultado == suma) {
				System.out.println("\nHas acertado");
			} else {
				System.out.println("\nHas fallado");
			}

			System.out.println("¿Quieres continuar (s/n)?");
			char letra = entrada.next().charAt(0);

			if (letra == 's') {
				continue;
			} else {
				break;
			}
		}

	}
}