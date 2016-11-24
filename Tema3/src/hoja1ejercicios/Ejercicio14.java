package hoja1ejercicios;

public class Ejercicio14 {

	public static void main(String[] args) {
		int[] primos = new int[100];
		int numPrimos = 0; // Cantidad de primos encontrada
		int candidato = 2;
		boolean esPrimo = true;

		
		while (numPrimos < 100) {

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
			esPrimo = true;

		}

		for (int i = 0; i < primos.length; i++) {
			System.out.println("Primo nº " + i + ": " + primos[i]);
		}
	}

}
