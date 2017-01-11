package ejercicios;

import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		// 6.- Crea un método que tome un número decimal y devuelva su cuadrado

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número");
		double numero = entrada.nextDouble();

		System.out.println(cubo(numero));
	}

	static double cubo(double numero) {
		double cubo = numero * numero * numero;
		return cubo;
	}

}
