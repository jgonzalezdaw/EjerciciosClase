import java.util.*;

public class EjemplosMetodosParametros6 {

	public static void main(String[] args) {

		float num = 27.3f;
		/*
		 * Cuando llamamos a un método y le pasamos como parámetro una variable
		 * de un tipo primitivo, ésta se pasa por valor.
		 * 
		 * Cuando pasamos una variable por valor, su contenido no cambia aunque
		 * cambie dentro del método.
		 */
		System.out.println("El área de un cuadrado de lado 27,3 m es " + areaCuadrado(num) + " m².");

		System.out.println("Después de llamar al método, " + "la variable num vale " + num);

		/*
		 * Cuando llamamos a un método y le pasamos como parámetro una variable
		 * de un tipo no primitivo (un array, por ejemplo), ésta se pasa por
		 * referencia.
		 * 
		 * Cuando pasamos una variable por referencia, su contenido cambia
		 * cuando el parámetro cambia dentro del método.
		 */
		int[] temperaturas = { 20, 15, 18, 21, 12, 10 };
		System.out.print("El array ordenado queda: ");
		ordenar(temperaturas);

		System.out.println("\nEl primer valor de temperaturas " + "después de llamar al método es " + temperaturas[0]);

	}

	static float areaCuadrado(float num) {
		float resultado = num * num;

		num = 5;

		return resultado;
	}

	static void ordenar(int[] valores) {
		int aux;
		int posMin;
		for (int i = 0; i < valores.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < valores.length; j++) {
				if (valores[j] < valores[posMin]) {
					posMin = j;
				}
			}

			aux = valores[i];
			valores[i] = valores[posMin];
			valores[posMin] = aux;
		}

		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
	}
}
