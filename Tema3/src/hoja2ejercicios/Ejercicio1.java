package hoja2ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] edades = { 20, 25, 30, 35, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19 };
		boolean edadEncontrada = false;

		int i = 0;
		while (!edadEncontrada && i < edades.length) {

			if (edades[i] == 35) {
				System.out.println("Edad encontrada.");
				edadEncontrada = true;
			}
			i++;
		}

	}

}
