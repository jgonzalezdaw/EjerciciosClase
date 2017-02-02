package ejemplos;

import java.util.*;

/**
 * Guardamos el nombre y las diez notas de tres alumnos.
 * 
 * @author csogorb
 *
 */
public class Ejemplo23 {

	public static void main(String[] args) {

		String[][] notas = new String[3][11];

		Scanner entrada = new Scanner(System.in);

		// Leemos los datos desde teclado y los guardamos en el array.
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[0].length; j++) {

				if (j == 0) {
					System.out.print("Nombre alumno: ");
				} else {
					System.out.print("Nota " + j + ": ");
				}

				notas[i][j] = entrada.nextLine();

			}
		}

		// Mostramos los datos en forma de tabla.
		System.out.println();
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[0].length; j++) {
				System.out.print(notas[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
