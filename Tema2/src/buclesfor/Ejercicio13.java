package buclesfor;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número");
		int numero = entrada.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(numero + " x " + i + " = " + (i * numero));

		}
	}

}