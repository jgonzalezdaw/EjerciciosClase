package buclesdowhile;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int respuesta = 0;
		do {
			System.out.println("¿Quién es el autor de la novela \"Ready Player One\"?");
			System.out.println("1) Douglas Capland\n2) Isaac Asimov\n3) Ernest Cline\n4) Ray Bradbury");
			respuesta = entrada.nextInt();
		} while (respuesta < 1 || respuesta > 4);

		if (respuesta == 3) {
			System.out.println("El resultado ES correcto");
		} else {
			System.out.println("El resultado NO es correcto.");
		}

		// Opcionalmente, en lugar del if podía hacerse:
		// String resultado =
		// respuesta==3 ? "Resultado correcto":
		// "Resultado incorrecto";
		// System.out.println(resultado);
	}
}
