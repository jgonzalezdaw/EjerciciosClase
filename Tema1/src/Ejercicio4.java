import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Ejercicio 4

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuál es tu nombre?");
		String nombre = entrada.nextLine();

		System.out.println("Dime las notas de las tres evaluaciones.");
		double nota1 = entrada.nextDouble();
		double nota2 = entrada.nextDouble();
		double nota3 = entrada.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		System.out.println("la media es " + media + ".");

	}

}