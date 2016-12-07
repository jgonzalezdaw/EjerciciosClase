package ejemplos;

/**
 * Intercambio de valores entre dos variables
 * 
 * @author csogorb
 *
 */
public class Ejemplo16 {

	public static void main(String[] args) {

		int x = 15;
		int y = 10;
		int aux;

		System.out.println("La X vale " + x + ", y la Y vale " + y);

		// x = y;
		// y = x;

		aux = x;
		x = y;
		y = aux;

		System.out.println("La X vale " + x + ", y la Y vale " + y);
	}
}
