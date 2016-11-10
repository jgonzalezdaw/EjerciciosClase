package condicionales;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el precio de un producto");
		double precio = entrada.nextDouble();

		System.out.println("¿Número de unidades?");
		double unidades = entrada.nextDouble();

		double coste = precio * unidades;

		double descuento;

		if (coste < 100) {
			System.out.println("El precio es: " + coste);
		} else if (coste > 200) {
			descuento = coste * 15 / 100;
			System.out.println("El precio es: " + (coste - descuento));
		} else {
			descuento = coste * 10 / 100;
			System.out.println("El precio es: " + (coste - descuento));
		}
	}

}