package bucleswhile;

import java.util.*;

public class Bucles01 {
	public static void main(String[] args) {

		// Programa que pide al usuario la edad y se la hace
		// repetir mientras no escriba un valor entre 20 y 60

		// Preguntar la edad
		// Si no está entre 20 y 60 volver a repetir

		Scanner entrada = new Scanner(System.in);
		int edad;

		do {
			System.out.print("Edad? ");
			edad = entrada.nextInt();
		} while (edad <= 20 || edad >= 60);
	}
}
