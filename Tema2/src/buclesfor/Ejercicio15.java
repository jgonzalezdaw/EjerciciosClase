package buclesfor;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// 15.- Crea un programa que solicite al usuario los precios de cuatro
		// objetos y devuelva el precio total.
		Scanner entrada = new Scanner(System.in);
		double precioFinal = 0;
		double precio;

		for (int i = 1; i <= 4; i++) {
			System.out.println("Precio del producto " 
					+ i + ": ");
			precio = entrada.nextDouble();
			precioFinal = precioFinal + precio;
		}

		System.out.println(precioFinal);
	}

}






