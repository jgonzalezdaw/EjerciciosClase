package bucleswhile;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		// Dividendos altos con divisores bajos puede provocar que el sistema
		// funcione lento durante un largo tiempo.
		Scanner entrada = new Scanner(System.in);

		System.out.println("División de 2 números con resto");

		int dividendo, divisor;

		System.out.println("Dividendo");
		dividendo = entrada.nextInt();

		System.out.println("Divisor");
		divisor = entrada.nextInt();

		while (dividendo >= divisor) {
			System.out.println(dividendo + " - " + divisor + " = " + (dividendo - divisor));
			dividendo = dividendo - divisor;
		}

		System.out.println("El resto es " + dividendo);
		System.out.println("\nPrograma finalizado");
	}
}
