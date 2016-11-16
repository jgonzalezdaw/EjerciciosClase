package ejemplos;

import java.util.Scanner;

public class Ejemplo6 {

	public static void main(String[] args) {
		// Leemos seis edades por teclado y las guardamos en un array.
		// Después, las mostramos por pantalla
		Scanner entrada = new Scanner(System.in);
		int[] edades = new int[6];

		for (int i = 0; i < edades.length; i++) {
			System.out.println("Edad? ");
			edades[i] = entrada.nextInt();
		}

		System.out.println("\nListado de edades:");
		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i]);
		}
	}

}







