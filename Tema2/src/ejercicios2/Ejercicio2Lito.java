package ejercicios2;

public class Ejercicio2Lito {

	public static void main(String[] args) {
		// 2.- Modifica el programa anterior para que no aparezcan los múltiplos
		// de 5 sino que, al final,
		// simplemente se muestre la suma de todos ellos. Utiliza un bucle while

		final int LIMIT = 1000;

		int resultat = 0;
		// PAS 3: Anar mirant els valors un per un. Es comença pel 0.
		int i = 0;
		while (i <= LIMIT) {
			// PAS a: És múltiple de tres?
			if ((i % 5) == 0) {

				resultat = resultat + i;
			}
			// PAS 3: Seguir anar mirant els valors un per un.
			i = i + 1;
		}
		System.out.println("Total de la suma de los 1000 primeros multiplos de 5: " + resultat + ".");
	}
}