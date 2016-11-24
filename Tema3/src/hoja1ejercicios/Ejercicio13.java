package hoja1ejercicios;

public class Ejercicio13 {

	public static void main(String[] args) {

		int[] potencias = new int[20];

		for (int i = 0; i < potencias.length; i++) {

			potencias[i] = (int) Math.pow(2, i);

		}
		
		System.out.println("Lista de potencias de dos:");

		int i = 0;
		while (i < 20) {

			System.out.println("2 elevado a " + i + " igual a " + potencias[i]);
			i++;

		}
	}
}


