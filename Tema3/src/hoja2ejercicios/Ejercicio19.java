package hoja2ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		String[][] nominas = new String[4][3];
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < nominas.length; i++) {
			System.out.print("Apellidos: ");
			nominas[i][0] = entrada.nextLine();
			System.out.print("Nombre: ");
			nominas[i][1] = entrada.nextLine();
			System.out.print("Sueldo: ");
			nominas[i][2] = entrada.nextLine();
		}

		for (int i = 0; i < nominas.length; i++) {
			System.out.println(nominas[i][0] + "\t" + nominas[i][1] + "\t" + nominas[i][2]);
		}

		float suma = 0;
		for (int i = 0; i < nominas.length; i++) {

			suma = suma + Float.parseFloat(nominas[i][2]);

		}

		System.out.println("\nTotal nóminas: " + suma + " €.");

	}

}
