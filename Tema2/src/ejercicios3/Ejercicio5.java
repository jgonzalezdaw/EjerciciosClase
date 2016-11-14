package ejercicios3;

import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Haz un programa que te pida un número y te devuelva su tabla de
		// multiplicar. Esto se repetirá
		// indefinidamente hasta que el usuario escriba 0. En ese caso se
		// escribirá la tabla del cero y el
		// programa terminará. Usa los bucles do-while y for.

		Scanner entrada = new Scanner(System.in);

		int i = 0;
		int num;
		do {
			System.out.println("Dime un número para multiplicarlo");
			num = entrada.nextInt();
			for (i = 1; i <= 10; i++) {
				System.out.println(i + " * " + num + " = " + (i * num));
			}

		} while (num != 0);
		System.out.println("Programa finalizado");
	}

}



