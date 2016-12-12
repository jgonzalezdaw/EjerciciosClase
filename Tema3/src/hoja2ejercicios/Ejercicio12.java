package hoja2ejercicios;

public class Ejercicio12 {

	public static void main(String[] args) {
		// 12.- La siguiente tabla muestra los números atómicos de los elementos
		// que forman una muestra de un material desconocido. Escribe un
		// programa que los muestre ordenados de menor a mayor. Al final también
		// indicará el número atómico menor y el mayor.

		int[] numAtomicos = { 8, 2, 10, 20, 12, 71, 15, 23 };
		int aux;
		int posMin;
		final int POS_MAX = numAtomicos.length - 1;

		for (int i = 0; i < numAtomicos.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < numAtomicos.length; j++) {
				if (numAtomicos[j] < numAtomicos[posMin]) {
					posMin = j;

				}
			}

			aux = numAtomicos[i];
			numAtomicos[i] = numAtomicos[posMin];
			numAtomicos[posMin] = aux;

			for (int k = 0; k < numAtomicos.length; k++) {
				System.out.print(numAtomicos[k] + " - ");
			}
			System.out.println();

		}
		System.out.println("El número atómico más pequeño es:" + " " + numAtomicos[0]);
		System.out.println("El número atómico más grande es: " + "" + numAtomicos[POS_MAX]);
	}

}