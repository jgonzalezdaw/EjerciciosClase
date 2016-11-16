package condicionales;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// Crea un programa que pregunte dos números al usuario.
		// A continuación mostrará un menú similar a éste

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número");
		int numero1 = entrada.nextInt();

		System.out.println("Dime otro número");
		int numero2 = entrada.nextInt();

		System.out.println("Elige una opción");

		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multiplicación");
		System.out.println("(4) División");

		System.out.println(" ");
		int opcion = entrada.nextInt();

		switch (opcion) {
		case 1:
			int suma = numero1 + numero2;
			System.out.println("El resultado es " + suma);
			break;
		case 2:
			int resta = numero1 - numero2;
			System.out.println("El resulado es " + resta);
			break;
		case 3:
			int multiplicacion = numero1 * numero2;
			System.out.println("El resultado es" + multiplicacion);
			break;
		case 4:
			int division = numero1 / numero2;
			System.out.println("El resultado es " + division);
			break;
		default:
			System.out.println("Operación no válida");

		}
	}

}