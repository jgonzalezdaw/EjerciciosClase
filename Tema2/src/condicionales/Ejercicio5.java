package condicionales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Crea un programa que pregunte un número de mes. Si el número
		// introducido está entre 1 y 12, mostrará un mensaje de aceptación:
		// "Mes correcto". De lo contrario, se mostrará un mensaje de error:
		// "Mes no válido".

		// TERMINAR EL EJERCICIO

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un número (1-12) del mes.");

		int mes = entrada.nextInt();

		if (mes >= 1 && mes <= 12) {
			System.out.println("Mes correcto");
		} else {
			System.out.println("Mes no válido");
		}

	}

}