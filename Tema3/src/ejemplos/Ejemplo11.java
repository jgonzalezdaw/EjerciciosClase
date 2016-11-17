package ejemplos;

import java.util.*;

public class Ejemplo11 {

	public static void main(String[] args) {

		// Modificar el ejemplo 9 de manera que
		// ambos bucles sean de tipo while

		Scanner entrada = new Scanner(System.in);
		int[] edades = new int[5];

		// Leemos los datos.
		System.out.println("Ve introduciendo las edades " + "de los alumnos y -1 cuando hayas acabado");
		int edad;
		int i = 0;
		do {
			System.out.print("Edad: ");
			edad = entrada.nextInt();
			edades[i] = edad;
			i++;
		} while (edad != -1 && i < edades.length);

		// Mostramos los datos del array.
		i = 0;
		while (i < edades.length) {
			if (edades[i] == -1) {
				break;
			}
			System.out.println(edades[i]);
			i++;
		}

	}

}
