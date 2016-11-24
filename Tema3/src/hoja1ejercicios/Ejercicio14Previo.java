package hoja1ejercicios;

public class Ejercicio14Previo {

	public static void main(String[] args) {

		boolean esPrimo = true;

		for (int candidato = 2; candidato < 100; candidato++) {

			esPrimo = true;
			for (int j = 2; j < candidato; j++) {
				if (candidato % j == 0) {
					esPrimo = false;
					break;
				}
			}

			if (esPrimo) {
				System.out.println(candidato);
			}

		}

	}
}
