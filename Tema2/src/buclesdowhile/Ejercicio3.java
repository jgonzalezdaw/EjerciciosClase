package buclesdowhile;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Escribe una aplicación que pregunte repetidamente un número entero
		// hasta que el usuario escriba un valor entre 1 y 10. A continuación el
		// programa escribirá un mensaje informando del número introducido.

		Scanner entrada = new Scanner(System.in);
		int num;

		do {
			System.out.println("Introduce un número entre 1 y 10:");
			num = entrada.nextInt();
		} while (num <1 || num > 10);
		System.out.println(num);
	}

}









