package buclesdowhile;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Número: ");
		int num = entrada.nextInt();

		int i = 1;

		do {
			System.out.println(num + " x " + i + " = " + num * i);
			i++;
		} while (i <= 10);

	}

}
