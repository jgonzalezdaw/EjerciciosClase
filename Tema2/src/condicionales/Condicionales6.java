package condicionales;

import java.util.Scanner;

public class Condicionales6 {

	public static void main(String[] args) {

		// El programa pedirá al usuario el número de mes.
		// Devolverá el número de días que tiene el mes.

		// Versión más corta.
		Scanner entrada = new Scanner(System.in);

		System.out.print("¿En qué mes (1 a 12) estamos? ");
		int mes = entrada.nextInt();

		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			System.out.println("31 DÍAS");
		} else if (mes == 2) {
			System.out.println("28 DÍAS");
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("30 DÍAS");
		} else {
			System.out.println("Entrada de datos errónea.");
		}

	}

}
