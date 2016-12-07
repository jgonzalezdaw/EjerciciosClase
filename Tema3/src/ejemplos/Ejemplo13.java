package ejemplos;

/**
 * Ejemplo de obtención del mayor elemento de un array de valores, guardando en
 * una variable el mayor valor.
 * 
 * @author csogorb
 *
 */
public class Ejemplo13 {
	public static void main(String[] args) {

		int[] temperaturas = { 5, 1, 3, 10, 8 };

		// Suponemos que el mínimo es el primer dato del array.
		int max = temperaturas[0];

		// Recorremos el array comparando cada posición con el valor
		// guardado en min.
		for (int i = 1; i < temperaturas.length; i++) {

			// Si encontramos un valor más pequeño que min,
			// lo intercambiamos.
			if (temperaturas[i] > max) {
				max = temperaturas[i];
			}

		}

		System.out.println("La mayor temperatura es " + max + "ºC.");

	}
}
