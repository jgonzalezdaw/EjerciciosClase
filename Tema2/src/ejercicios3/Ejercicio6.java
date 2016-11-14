package ejercicios3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int i = 0;
		int num;
		do {
			System.out.println("Escribe un número para visualizar la tabla de multiplicar");
			num = entrada.nextInt();
			if (num == 1) {
				System.out.println("No seas tonto, escribe otro numero");
				continue;
			}
			for (i = 1; i <= 10; i++) {
				System.out.println(i + " * " + num + " = " + (i * num));
			}

		} while (num != 0);
		System.out.println("Eso es todo, compañero");
	}

}