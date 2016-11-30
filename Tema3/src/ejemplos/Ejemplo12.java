package ejemplos;
/**
 * Ejemplo de obtención del menor elemento de un array de valores,
 * guardando en una variable el menor valor.
 * @author csogorb
 *
 */
public class Ejemplo12 {
	public static void main(String[] args) {
		
		int[] temperaturas = { 5, 1, 3, 10, 8 };

		// Suponemos que el mínimo es el primer dato del array.
		int min = temperaturas[0];

		// Recorremos el array comparando cada posición con el valor
		// guardado en min.
		for (int i = 1; i < temperaturas.length; i++) {
			
			// Si encontramos un valor más pequeño que min,
			// lo intercambiamos.
			if(temperaturas[i] < min){
				min = temperaturas[i];
			}
			
		}
		
		System.out.println("La menor temperatura es " + min + "ºC.");
		
	}
}
