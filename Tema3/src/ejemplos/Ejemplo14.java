package ejemplos;

/**
 * Ejemplo de obtención del mayor elemento de un array de valores, guardando en
 * una variable la posición del mayor valor.
 * 
 * @author csogorb
 *
 */
public class Ejemplo14 {

	public static void main(String[] args) {

		int[] temperaturas = { 5, 1, 3, 10, 8 };

		// Suponemos que el mínimo es el primer dato del array.
		int posMax = 0;

		// Recorremos el array comparando cada posición con el valor
		// guardado en la posición posMin.
		for (int i = 0; i < temperaturas.length; i++) {

			// Si encontramos un valor más pequeño que el de posMin,
			// lo intercambiamos.
			if (temperaturas[i] > temperaturas[posMax]) {
				posMax = i;
			}

		}

		System.out.println("La posición del menor elemento es " + posMax + " y el valor es " + temperaturas[posMax]);
	}

}
