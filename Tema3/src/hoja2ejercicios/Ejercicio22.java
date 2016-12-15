package hoja2ejercicios;

import java.util.*;

public class Ejercicio22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String[][] notas = new String[3][4];

		System.out.println("Introducción de notas");
		System.out.println("=====================");
		for (int i = 0; i < notas.length; i++) {

			System.out.print("Nombre: ");
			notas[i][0] = entrada.nextLine();

			System.out.print("Exámenes: ");
			notas[i][1] = entrada.nextLine();

			System.out.print("Trabajos: ");
			notas[i][2] = entrada.nextLine();

			System.out.print("Actitud: ");
			notas[i][3] = entrada.nextLine();
		}

		System.out.println("\nNota de evaluación");
		System.out.println("=====================");
		
		float media;
		float examenes;
		float trabajos;
		float actitud;
		for (int i = 0; i < notas.length; i++) {
			examenes = Float.parseFloat(notas[i][1]);
			trabajos = Float.parseFloat(notas[i][2]);
			actitud = Float.parseFloat(notas[i][3]);
			media = (50 * examenes + 40 * trabajos + 10 * actitud) / 100;

			System.out.println(notas[i][0] + ": " + media);

		}

	}

}












