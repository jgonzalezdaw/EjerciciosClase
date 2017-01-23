package ejercicios;

import java.util.Scanner;

public class Prueba { // Ejercicio con un solo return cuando se piden dos.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca el nombre del planeta: ");
		String planeta = entrada.nextLine();
		System.out.println(planetas(planeta));

	}

	static String planetas(String planet) {

		String planetas[] = { "Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Uranio", "Neptuno",
				"Plutón" };

		String planets = null;

		for (int i = 0; i < planetas.length; i++) {

			if (planet.equals(planetas[i])) {
				planets = String.valueOf(i);
				break;

			} else {
				planets = "-1";
			}
		}
		return planets;

	}

}