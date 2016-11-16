package condicionales;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// 18.- Crea un programa que pida un número entero por teclado, entre 1
		// y 10.
		// Si el usuario escribe un número entero, se escribirá su valor en
		// pantalla.
		// Si lo que escribe no es un entero, se mostará un mensaje de error.

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Ingresa un número entero");

		if (entrada.hasNextInt()) {
			int edad = entrada.nextInt();

			if ((edad >= 1) && (edad <= 10)) {
				System.out.println(edad);
			} else {
				System.out.println("Este valor no esta entre 1 y 10");
			}

		} else {
			System.out.println("Valor entrada incorrecta");
		}
	}

}