package hoja1ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		// Escribe una aplicación que pida al usuario diez precios de productos.
		// Después devolverá el precio total a pagar y el número de productos
		// cuyo precio sea mayor de 10 euros.

		Scanner entrada = new Scanner(System.in);

		float total = 0, precio[] = new float[10];
		int preciosMayores = 0;

		for (int i = 0; i < precio.length; i++) {
			System.out.println("Precio " + (i + 1));
			precio[i] = entrada.nextFloat();
			total += precio[i];
			if (precio[i] > 10) {
				preciosMayores++;
			}

		}

		System.out.print("Precio total a pagar: ");
		System.out.printf("%.2f € de los cuales %d productos cuestan " + "más de 10 euros.", total, preciosMayores);

	}
}
