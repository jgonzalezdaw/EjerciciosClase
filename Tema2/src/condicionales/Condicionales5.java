package condicionales;

import java.util.Scanner;

public class Condicionales5 {

	public static void main(String[] args) {

		// El programa pedirá al usuario el número de mes.
		// Devolverá el número de días que tiene el mes.
		Scanner entrada = new Scanner(System.in);

		System.out.print("¿En qué mes (1 a 12) estamos? ");
		int mes = entrada.nextInt();

		if (mes == 1) {
			System.out.println("31 DÍAS");
		} else if (mes == 2) {
			System.out.println("28 DÍAS");
		} else if (mes == 3) {
			System.out.println("31 DÍAS");
		} else if (mes == 4) {
			System.out.println("30 DÍAS");
		} else if (mes == 5) {
			System.out.println("31 DÍAS");
		} else if (mes == 6) {
			System.out.println("30 DÍAS");
		} else if (mes == 7) {
			System.out.println("31 DÍAS");
		} else if (mes == 8) {
			System.out.println("31 DÍAS");
		} else if (mes == 9) {
			System.out.println("30 DÍAS");
		} else if (mes == 10) {
			System.out.println("31 DÍAS");
		} else if (mes == 11) {
			System.out.println("30 DÍAS");
		} else if (mes == 12) {
			System.out.println("31 DÍAS");
		} else {
			System.out.println("Entrada de datos errónea.");
		}

	}

}
