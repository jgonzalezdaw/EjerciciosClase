package condicionales;
import java.util.Scanner;

public class Condicionales9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escriba el precio del producto");
		double precio = entrada.nextDouble();

		double precioFinal;
		// if (precio > 100){
		// precioFinal = 0.85 * precio;
		// } else{
		// precioFinal = 0.95 * precio;
		// }

		precioFinal = precio > 100 ? 0.85 * precio : 0.95 * precio;

		System.out.println("Precio final: " + precioFinal);

	}

}
