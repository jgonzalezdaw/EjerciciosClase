package ejemplos;

import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {
		// Leemos diez nombres desde teclado y los almacenamos en un array.
		// A continuación, los mostramos.

		Scanner entrada = new Scanner(System.in);
		String[] nombres = new String[10];
		for (int i = 0; i < nombres.length; i++) {
			System.out.print("Nombre " + i + "? ");
			nombres[i] = entrada.nextLine();
		}

		System.out.println();

		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}

	}
}










