package condicionales;

import java.util.Scanner;

public class Condicionales8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Qué edad tienes?");

		if (entrada.hasNextInt()) {
			int edad = entrada.nextInt();
			System.out.println("Tienes " + edad + " años.");
		} else {
			System.out.println("Entrada incorrecta");
		}

	}

}
