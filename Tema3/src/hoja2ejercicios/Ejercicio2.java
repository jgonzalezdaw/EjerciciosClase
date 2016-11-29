package hoja2ejercicios;

import java.util.*;

public class Ejercicio2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float[] estaturas = new float[10];

		for (int i = 0; i < estaturas.length; i++) {
			System.out.print("Estatura " + i + ": ");
			estaturas[i] = entrada.nextFloat();
		}

		for (int i = 0; i < estaturas.length; i++) {
			if (estaturas[i] > 1.90f) {
				System.out.println("Hay alguna estatura mayor de 1'90m.");
				break;
			}
		}

	}
}
