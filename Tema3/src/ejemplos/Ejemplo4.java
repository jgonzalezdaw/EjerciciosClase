package ejemplos;

import java.util.*;

public class Ejemplo4 {

	public static void main(String[] args) {

		// Leemos cuatro precios desde la terminal y los guardamos en
		// un array.

		Scanner entrada = new Scanner(System.in);
		double[] precios = new double[4];
		double precio;

		for (int i = 0; i < precios.length; i++) {

			System.out.print("Precio " + i + ": ");
			precio = entrada.nextDouble();

			precios[i] = precio;

		}

		System.out.println();

		for (int i = 0; i < precios.length; i++) {
			System.out.println("Precio " + i + ": " + precios[i]);
		}

		System.out.println("Hecho.");

	}
}
