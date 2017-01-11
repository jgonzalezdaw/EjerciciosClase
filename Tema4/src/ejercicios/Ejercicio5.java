package ejercicios;

public class Ejercicio5 {
	public static void main(String[] args) {

		int[] valores = { 10, 30, 5, 7, 2 };

		int[] valoresOrdenados = ordenar(valores);

		for (int i = 0; i < valoresOrdenados.length; i++) {
			System.out.println(valoresOrdenados[i]);
		}

	}

	static int[] ordenar(int[] numeros) {

		int posMin;
		int aux;

		for (int i = 0; i < numeros.length - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}

			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;

		}

		return numeros;
	}
}
