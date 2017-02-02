package ejercicios;

import java.util.Scanner;

public class Ejercicio11 { // Ejercicio con un solo return cuando se piden dos.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String planetas[] = { "Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Uranio", "Neptuno",
				"Plutón" };

		System.out.println("Introduzca el nombre del planeta: ");
		String planeta = entrada.nextLine();
		System.out.println(buscar(planetas, planeta));

	}

	static int buscar(String[] planetas, String planeta) {

		for (int i = 0; i < planetas.length; i++) {

			if (planeta.equals(planetas[i])) {
				return i;
			}
		}

		return -1;

	}

}