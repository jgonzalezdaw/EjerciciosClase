package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int mes;

		System.out.print("Introduzca un mes entre 1 y 12: ");

		meses(mes = entrada.nextInt());

	}

	static void meses(int mes) {

		String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		if (mes >= 1 && mes <= 12) {
			System.out.println(meses[mes - 1]);
		} else {
			System.out.println("Fin del programa");
		}
	}
}