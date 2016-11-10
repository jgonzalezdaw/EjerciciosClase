package condicionales;
import java.util.Scanner;

public class Condicionales2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Precio: ");
		float precio = entrada.nextFloat();

		if (precio >= 20) {
			System.out.println("Tiene derecho a descuento.");
		} else {
			System.out.println("No tiene derecho a descuento.");
		}

	}

}
