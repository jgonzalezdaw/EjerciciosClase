package hoja2ejercicios;

import java.util.Scanner;

public class Ejercicio6Javier {

	public static void main(String[] args) {
		// 6.- Escribe una aplicación que vaya preguntando los votos de seis
		// partidos políticos en unas elecciones
		// y guardándolos en un array. Al acabar, dirá cuál ha sido el menor
		// número de votos y cuál el mayor, así como las posiciones del array
		// que ocupan estos partidos.
		Scanner entrada = new Scanner(System.in);
		int votos[] = new int[6];
		int posMax = 0;
		int posMin = 0;

		for (int i = 0; i < votos.length; i++) {
			System.out.println("Numero de votos del partido: ");
			votos[i] = entrada.nextInt();
			for (int j = 1; j < votos.length; j++) {
				if (votos[i] < votos[j]) {
					posMin = j;
				}
				if (votos[i] > votos[j]) {
					posMax = j;
				}
			}
		}
		System.out.println(posMin);
		System.out.println(posMax);
	}

}