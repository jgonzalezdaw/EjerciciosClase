package condicionales;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Nota: ");
		int nota = entrada.nextInt();

		if (nota < 5) {
			System.out.println("Insuficiente");
		} else if (nota == 5) {
			System.out.println("Suficiente");
		} else if (nota == 6) {
			System.out.println("Bien");
		} else if (nota == 7 || nota == 8) {
			System.out.println("Notable");
		} else if (nota >= 9) {
			System.out.println("Excelente");
		}

	}

}