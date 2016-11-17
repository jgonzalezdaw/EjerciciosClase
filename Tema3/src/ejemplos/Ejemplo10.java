package ejemplos;

import java.util.*;

public class Ejemplo10 {

	public static void main(String[] args) {

		// Modificar el ejemplo 9 de manera que
		// ambos bucles sean de tipo FOR

		Scanner entrada = new Scanner(System.in);
		int[] edades = new int[1000];

		// Leemos los datos.
		System.out.println("Ve introduciendo las edades " + "de los alumnos y -1 cuando hayas acabado");
		int edad;

		for (int i = 0; i < edades.length; i++) {
			System.out.print("Edad: ");
			edad = entrada.nextInt();
			edades[i] = edad;
			if (edad == -1) {
				break;
			}
		}

		// Mostramos los datos del array.
		for (int i = 0; i < edades.length; i++) {
			if (edades[i] != -1) {
				System.out.println(edades[i]);
			} else {
				break;
			}
		}

	}

}
