package bucleswhile;

/**
 * @author Ramon
 *
 */
public class Ejercicio6 {

	/**
	 * Condicionales: Bucles Ejercicio 6
	 */
	public static void main(String[] args) {
		// Crea un programa que escriba todos los números pares menores de 200.

		// Este ejercicio no es con variable contador si no que en su lugar se
		// utiliza una variable acumulador.
		int i = 2; // Variable que va tomando valores pares

		System.out.println("Numeros pares menores de 200");
		System.out.println("============================");

		while (i < 200) {
			System.out.println(i);
			i = i + 2;
		}
	}

}





