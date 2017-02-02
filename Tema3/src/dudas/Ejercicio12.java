package dudas;

public class Ejercicio12 {

	public static void main(String[] args) {

		int[] numAtomicos = { 8, 2, 10, 20, 12, 71, 15, 23 };
		int aux;
		int posMin;

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

		}

		for (int i = 0; i < numAtomicos.length; i++) {
			System.out.print(numAtomicos[i] + " ");
		}

		System.out.println("\nEl menor es " + numAtomicos[0]);
		System.out.println("El mayor es " + numAtomicos[numAtomicos.length - 1]);

	}

}
