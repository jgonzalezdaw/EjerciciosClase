package ejercicios2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//
		// 4.- Utiliza un bucle
		// for para preguntar 5 veces por un número entero, y al final devolver
		// la frase
		// "Has fallado".

		Scanner entrada = new Scanner(System.in);
		int num;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Ingresa un numero entero");
			num = entrada.nextInt();

		}
		System.out.println("Has fallado");

	}

}
