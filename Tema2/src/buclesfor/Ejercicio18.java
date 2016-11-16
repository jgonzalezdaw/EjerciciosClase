package buclesfor;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		float nota;
		int contador;

		Scanner entrada = new Scanner(System.in);

		for (contador = 0; contador < 5; contador++) {

			do {
				System.out.println("Escribe tus " + (5 - contador) + " notas");
				nota = entrada.nextFloat();
			} while (nota > 10 || nota < 0);

		}

	}
}
