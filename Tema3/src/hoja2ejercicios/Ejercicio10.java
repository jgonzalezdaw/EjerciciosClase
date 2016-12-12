package hoja2ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		// Escribe un programa que pregunte las temperaturas de las últimas ocho
		// horas
		// y las muestre ordenadas de menor a mayor, usando el método de
		// selección. Al
		// final también indicará la temperatura menor y la mayor.

		double temp[] = new double[8];
		double aux;
		int posMin;

		for (int i = 0; i < temp.length; i++) {
			System.out.println("Temperatura " + (i + 1));
			temp[(int) i] = entrada.nextDouble();
		}

		for (int i = 0; i < temp.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < temp.length; j++) {
				if (temp[j] < temp[posMin]) {
					posMin = j;
				}
			}

			aux = temp[i];
			temp[i] = temp[posMin];
			temp[posMin] = aux;
		}

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");

		}

		System.out.println();
		System.out.println("Posición mínima " + temp[0]);
		System.out.println("Posición máxima " + temp[temp.length - 1]);

	}

}