package bucleswhile;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Crea un programa que pida un carácter al usuario. A continuación lo
		// escribirá 100 veces.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un caracter.");
		String caracter = entrada.nextLine();

		int contador = 0;
		while (contador < 101) {
			System.out.println(contador + " " + caracter);
			contador++;
		}

	}

}




