package condicionales;

import java.util.*;

public class Ejercicio22 {

	public static void main(String[] args) {
		// Crea un programa que calcule la hora de cierre de una tienda. Esta
		// hora depende del valor de una variable de tipo String llamada dia. Si
		// su valor es "entre semana", la hora de cierre de la tienda será
		// "20:00". En otro caso, la hora de cierre será "14:00".

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe \"entre semana\" si es un día de lunes a viernes.");
		String dia = entrada.nextLine();

		String horarioCierre = (dia.equals("entre semana")) ? "La tienda cerrará a las 20:00h"
				: "La tienda cerrará a las 14:00h";

		System.out.println(horarioCierre);

	}
}
