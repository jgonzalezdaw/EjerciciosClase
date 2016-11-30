package hoja2ejercicios;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio4 {

	/**
	 * @PDF-Ejercicio de Arrays II 2/17 Descripcion: Búsqueda en Arrays
	 *                desordenados 1-4
	 */
	public static void main(String[] args) {
		// 4.- Escribe un programa que pida 10 precios de productos y los guarde
		// en un array llamado productos. Después recorrerá el array hasta
		// encontrar un precio menor que 0. Si lo encuentra escribirá el mensaje
		// "Se ha encontrado un valor no válido en la posición x. El programa
		// terminará"
		// (x es la posición del array donde está ese dato). Si no lo encuentra,
		// calculará la suma de todos los precios y la mostrará.
		// Utiliza una variable semáforo llamada preciosCorrectos, que valdrá
		// true si todos los precios son mayores o iguales a cero, y false si se
		// encuentra un número negativo.

		Scanner sc = new Scanner(System.in);
		System.out.println("Productos");
		System.out.println("*=*=*=*=*");

		double productos[] = new double[10];

		// Declaracion de Variables.
		double suma = 0;

		// Variable Semaforo.
		boolean preciosCorrectos = true;

		for (int i = 0; i < productos.length; i++) {
			System.out.println("Precio: ");
			productos[i] = sc.nextDouble();
		}

		int i = 0;
		while (i < productos.length && preciosCorrectos) {

			suma = suma + productos[i];
			if (productos[i] < 0) {
				preciosCorrectos = false;
				System.out.println("Se ha encontrado un valor no válido "
						+ "en la posición " + i + ". El programa terminará.");
			}

			i++;

		}

		if (preciosCorrectos) {
			System.out.println("Suma: " + suma);
		}

		sc.close();

	}
}