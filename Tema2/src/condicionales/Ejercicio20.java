package condicionales;

import java.util.*;

public class Ejercicio20 {

	public static void main(String[] args) {
		// Escribe un programa que pida la edad del usuario. Si ésta es menor de
		// 18 años, el valor de la variable mayorDeEdad será verdadero. Si no,
		// será falso. Al final se mostrará este valor.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu edad.");

		if (entrada.hasNextInt()) {
			int edad = entrada.nextInt();
			boolean mayorDeEdad;

			mayorDeEdad = edad >= 18 ? true : false;

			System.out.println(mayorDeEdad);
		}

	}

}