package condicionales;

import java.util.Scanner;

public class Condicionales4 {

	public static void main(String[] args) {

		// El programa pedirá una nota entera.
		// Si es menor que 5 escribirá la palabra INSUFICIENTE.
		// Si no, si es menor que 6 escribirá SUFICIENTE.
		// En otro caso, escribirá "BIEN HECHO".

		// Pedimos la nota del estudiante.
		Scanner entrada = new Scanner(System.in);

		System.out.print("Nota: ");
		int nota = entrada.nextInt();

		// Tomamos decisiones en función de la nota.
		if (nota < 5) {
			System.out.println("INSUFICIENTE");
		} else if (nota < 6) {
			System.out.println("SUFICIENTE");
		} else if (nota < 7) {
			System.out.println("BIEN");
		} else if (nota < 9) {
			System.out.println("NOTABLE");
		} else {
			System.out.println("EXCELENTE");
		}

		System.out.println("\nAplicación creada por Carlos.");
	}

}
