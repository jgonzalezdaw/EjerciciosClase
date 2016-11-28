package hoja1ejercicios;

/**
 * Este programa almacena en un array los 100 primeros números primos
 * 
 * @author csogorb
 *
 */
public class Ejercicio14 {

	public static void main(String[] args) {

		final int NUM_PRIMOS = 100;

		int[] primos = new int[NUM_PRIMOS];
		int numPrimos = 0; // Cantidad de primos encontrada
		int candidato = 2;
		boolean esPrimo;

		while (numPrimos < NUM_PRIMOS) {
			esPrimo = true;

			for (int i = 2; i < candidato; i++) {
				if (candidato % i == 0) {
					esPrimo = false;
					break;
				}
			}

			if (esPrimo) {
				primos[numPrimos] = candidato;
				numPrimos++;
			}

			candidato++;

		}

		for (int i = 0; i < primos.length; i++) {
			System.out.println("Primo nº " + i + ": " + primos[i]);
		}
	}

}
