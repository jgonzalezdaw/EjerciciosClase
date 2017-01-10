package ejercicios;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("¿Cómo te llamas? ");
		String nombre = entrada.nextLine();

		System.out.print("¿Qué edad tienes? ");
		int edad = entrada.nextInt();

		saludo(nombre, edad);
	}

	static void saludo(String nombre, int edad) {
		System.out.println("Hola, " + nombre + " no parece que tengas " 
				+ edad + " años.");
	}

}








