package condicionales;
import java.util.Scanner;

public class Condicionales3 {

	public static void main(String[] args) {

		// Pedimos al usuario su PIN (4 cifras).
		// Si es 4652, escribimos "Acceso concedido".
		// Si no, escribimos "Acceso no permitido

		Scanner entrada = new Scanner(System.in);

		System.out.println("PIN: ");
		int pin = entrada.nextInt();

		if (pin == 4652) {
			System.out.println("Acceso concedido");
		} else {
			System.out.println("Acceso no permitido");
		}

	}

}
