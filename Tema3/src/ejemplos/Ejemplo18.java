package ejemplos;

/**
 * Método de selección, para ordenar un array.
 * 
 * @author csogorb
 *
 */
public class Ejemplo18 {

	public static void main(String[] args) {

		int[] edades = { 10, 5, 4, 8, 20, 16 };

		int aux; // Variable auxiliar para intercambiar
					// dos posiciones del array
		int posMin; // Índice de la posición donde está
					// el mínimo

		// Recorremos el array desde la posición 0 hasta
		// la penúltima posición.
		for (int i = 0; i < edades.length - 1; i++) {
			
			// Para cada valor de i, buscamos el mínimo de 
			// los valores entre i y el final del array.
			posMin = i;
			for(int j = i; j<edades.length; j++){
				
				if(edades[j]<edades[posMin]){
					posMin = j;
				}
				
			}
			
			// Ahora posMin indica la posición del elemento
			// más pequeño entre i y el final del array.
			
			// Intercambios la posición i con la 
			// posición posMin.
			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;
			
			// Mostramos cómo va quedando el array,
			// simplemente para ver cómo va quedando.
			for(int k=0; k<edades.length; k++){
				System.out.print(edades[k] + " ");
			}
			System.out.println();
		}
		
		// Mostramos el array ya ordenado.
		System.out.println();
		for(int i=0; i<edades.length; i++){
			System.out.print(edades[i] + " ");
		}

	}
}





















