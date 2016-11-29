package hoja1ejercicios;

public class Array16 {

	public static void main(String[] args) {
		// Añade al programa anterior la función de calcular cuántas
		// temperaturas ha habido por encima de 12ºC.

		double temperatura[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		int cantidad = 0;
		double suma = 0;
		double media = 0;

		for (int i = 0; i < temperatura.length; i++) {

			suma = suma + temperatura[i];

			if (temperatura[i] > 12) {

				cantidad++;

			}

		}

		media = suma / temperatura.length;

		// System.out.println("Temperatura media: " + media + "ºC");
		System.out.printf("Temperatura media %.2f", media);
		System.out.println("\nHa superado los 12º en " + cantidad + " ocasiones");
	}

}
