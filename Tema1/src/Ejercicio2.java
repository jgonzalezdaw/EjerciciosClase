import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		System.out.println("Calculadora");
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número del 0 al 127");
		byte numero1 = entrada.nextByte();

		System.out.println("Dime un número del 0 al 127");
		byte numero2 = entrada.nextByte();

		int resultado = numero1 % numero2;

		System.out.println("El resto es " + resultado);

	}

}
