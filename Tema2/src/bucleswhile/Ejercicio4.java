package bucleswhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Escribe una aplicación que pregunte al usuario un número entre 1
		// y 5. Si responde "3", se le felicitará por haber acertado. Si no, se
		// le seguirá pidiendo más números.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Adivina el número entero entre 1 y 5");

		int numero, numeroCorrecto = 3;

		numero = entrada.nextInt();

		while (numero != numeroCorrecto) {
			if (numero < 1 || numero > 5) {
				System.out.println("Fuera de rango, vuelva a intentar");
			} else {
				System.out.println("Nope.... vuelve a probar");
			}
			numero = entrada.nextInt();
		}

		System.out.println("Correcto, el número secreto era el " + numeroCorrecto + "\n\nPrograma finalizado");
	}
}
