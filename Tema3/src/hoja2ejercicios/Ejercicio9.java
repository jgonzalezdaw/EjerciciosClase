
package hoja2ejercicios;

/**
 *
 * @author Patryk
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		// 9.- Crea un programa que muestre los siguientes precios (guardados en
		// un array llamado precios) ordenados de menor a mayor, usando el
		// método de selección.

		double[] precios = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };
		double aux;
		int posMin;

		for (int i = 0; i < precios.length - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < precios.length; j++) {
				if (precios[j] < precios[posMin]) {
					posMin = j;

				}
			}

			aux = precios[i];
			precios[i] = precios[posMin];
			precios[posMin] = aux;

			for (int k = 0; k < precios.length; k++) {
				System.out.print(precios[k] + " - ");
			}
			System.out.println();

		}
	}

}