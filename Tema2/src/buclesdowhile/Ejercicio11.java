package buclesdowhile;

import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Escribe un programa que pregunte un número entre 1 y 20. Si el número
		// introducido no cumple la condición, se le volverá a preguntar hasta
		// que la cumpla. Al final simplemente se mostrará el número en
		// pantalla.

		Scanner entrada = new Scanner(System.in);

		int num;

		do {
			System.out.println("Introduce un número entre 1 " + "y 20:");
			num = entrada.nextInt();
		} while (num < 1 || num > 20);
		// while (!(num >= 1 && num <= 20));
		System.out.println("El número es: " + num);

	}

}
