package ejemplos;

/**
 * Método de selección, para ordenar un array.
 * 
 * @author csogorb
 *
 */
public class Ejemplo19 {

	public static void main(String[] args) {

		double precios[] = {10.4, 5.6, 12, 15, 3.1, 5}; 
		double aux;
		int posMin;
		// Recorremos el array.
		for (int i = 0; i < precios.length - 1; i++) {
			
			// Buscamos el mínimo entre i y el final.
			posMin = i;
			for(int j=i; j<precios.length;j++){
				
				if(precios[j]<precios[posMin]){
					posMin = j;
				}
			}
			
			// Intercambiamos i y posMin.
			aux = precios[i];
			precios[i] = precios[posMin];
			precios[posMin] = aux;
		
			// Mostramos cómo va quedando el array.
			for(int k = 0; k<precios.length; k++){
				System.out.print(precios[k] + " ");
			}
			System.out.println();
		}
		
		

	}

}













