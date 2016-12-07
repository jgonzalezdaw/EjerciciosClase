package ejemplos;

import java.util.Scanner;

public class Lluc {

	public static void main(String[] args) {

		// Modificar el ejemplo 9 de manera que
		// ambos bucles sean de tipo while

		Scanner entrada = new Scanner(System.in);
		int[] edades = new int[1000];
		int i = 0;
		// Leemos los datos

		while (i < edades.length) {
			System.out.println("Introduce edades. Tienes 1000 entradas. -1 para finalizar");
			edades[i] = entrada.nextInt();
			if (edades[i] == -1) {
				break;
			}
			i++;
		}

		// Mostramos los datos del array
		i = 0;
		while (i < edades.length && edades[i] != -1) {
			System.out.println(edades[1]);
			i++;

		}

	}
}
