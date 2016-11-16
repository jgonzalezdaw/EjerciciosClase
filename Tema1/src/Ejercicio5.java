import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Ejercicio 5 Nombre del producto, precio y porcentaje

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el nombre de un producto.");
		String producto = entrada.nextLine();

		System.out.println("Dime el precio del producto.");
		double precio = entrada.nextDouble();

		System.out.println("Dime el porcentaje del producto");
		double porcentaje = entrada.nextDouble();

		double descuento = precio * porcentaje / 100;

		System.out.println("El producto " + producto + " cuesta " + (precio - descuento) + ".");

	}

}
