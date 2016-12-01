package ejemplos;

/**
 * Intercambio de valores entre dos variables
 * 
 * @author csogorb
 *
 */
public class Ejemplo17 {

	public static void main(String[] args) {

		int[] precios = {3, 450, 2, 8, 2, 1};
		int aux;
		
		// Queremos intercambiar las posiciones 0 y 5:
		aux = precios[0];
		precios[0] = precios[5];
		precios[5] = aux;
		
		for (int i = 0; i < precios.length; i++) {
			System.out.print(precios[i] + " ");
		}
		
	}
}










