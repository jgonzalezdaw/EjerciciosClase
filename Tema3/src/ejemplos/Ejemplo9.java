package ejemplos;

import java.util.*;

public class Ejemplo9 {

	public static void main(String[] args) {

		// Arrays incompletos
		// Crea un array de enteros de 1000 elementos y ve pidiendo
		// edades de alumnos. Cuando el usuario escriba -1, el programa
		// terminará y mostrará todas las edades introducidas.

		Scanner entrada = new Scanner(System.in);
		int[] edades = new int[1000];

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
		for (i = 0; i < edades.length; i++) {
			if (edades[i] != -1) {
				System.out.println(edades[i]);
			} else {
				break;
			}
		}

	}

}
