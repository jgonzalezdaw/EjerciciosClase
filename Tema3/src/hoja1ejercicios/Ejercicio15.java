package hoja1ejercicios;

public class Ejercicio15 {

	public static void main(String[] args) {

		double temp[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		double suma = 0;
		double media = 0;

		for (int i = 0; i < temp.length; i++) {

			suma = suma + temp[i];

		}

		media = suma / temp.length;

		System.out.println("Temperatura media: " + media + "ºC");
		System.out.printf("Temperatura media %.2f", media);

	}

}
