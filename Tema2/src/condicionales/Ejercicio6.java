package condicionales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el precio del producto");
		double precio = entrada.nextDouble();

		System.out.println("¿Cuántos productos has comprado?");
		int cantidad = entrada.nextInt();

		double total = precio * cantidad;

		double descuento;
		
		if (total > 75) {
			descuento = total * 15 / 100;
			System.out.println("El precio es " + (total - descuento) + ".");
		} else {
			descuento = total * 5 / 100;
			System.out.println("El precio es " + (total - descuento) + ".");
		}
		
		entrada.close();
	}

}









