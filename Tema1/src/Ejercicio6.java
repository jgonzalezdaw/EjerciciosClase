import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner actSeis = new Scanner(System.in);
		System.out.println("¿Cual es el precio del producto?");
		double precio = actSeis.nextDouble();

		System.out.println("¿Cuantas unidades?");
		double cantidad = actSeis.nextDouble();

		System.out.println("El precio total de todos los productos vendidos, asciende a " + (precio * cantidad));
	}

}
