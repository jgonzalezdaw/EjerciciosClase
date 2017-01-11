package ejercicios;

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		// 6.- Crea un método que tome un número decimal y devuelva su cuadrado

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número");
		double numero = entrada.nextDouble();

		System.out.println(cuadrado(numero));
	}

	static double cuadrado(double numero) {

		double cuadrado = numero * numero;
		return cuadrado;
		
	}

}

















