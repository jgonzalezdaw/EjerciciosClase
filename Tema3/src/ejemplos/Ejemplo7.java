package ejemplos;

import java.util.Scanner;

public class Ejemplo7 {
	public static void main(String[] args) {

		// Leemos siete pesos por la consola y los guardamos en un array.
		// Después, los mostramos por pantalla.

		Scanner entrada = new Scanner(System.in);
		float[] pesos = new float[7];

		for (int i = 0; i < pesos.length; i++) {
			System.out.print("Peso " + i + ": ");
			pesos[i] = entrada.nextFloat();
		}

		System.out.println("\nListado de pesos:");
		for (int i = 0; i < pesos.length; i++) {
			System.out.println("Peso " + i + ": " + pesos[i]);
		}
	}
}
