package ejercicios;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("¿Cómo te llamas? ");
		String nombre = entrada.nextLine();

		System.out.print("¿Qué edad tienes? ");
		int edad = entrada.nextInt();

		System.out.println(saludo(nombre, edad));
	}

	static String saludo(String nombre, int edad) {
//		System.out.println("Hola, " + nombre + " no parece que tengas " 
//				+ edad + " años.");
		
		String saludo = "Hola, " + nombre + " no parece que tengas " 
				+ edad + " años.";
		return saludo;
	}

}








