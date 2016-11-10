package condicionales;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Escribe un programa que pregunte el precio de un producto.
		// Si vale más de 80 €, le hará un descuento del 10%.
		// Se mostrará en pantalla el precio final.

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuánto cuesta el producto?");
		float producto = entrada.nextInt();

		if (producto > 80) {
			float descuento = (producto * 10) / 100;
			producto = producto - descuento;
		}
		
		System.out.println("El producto le costará: " + producto);

	}

}