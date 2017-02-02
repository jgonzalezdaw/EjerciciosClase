package cadenas;

public class ejCadenas {

	public static void main(String[] args) {

		String nombre = "Eneko Gallego Gomez";
		String numero = "1997";
		String nom = "Supercalifragilisticoespiralidoso";

		// Devuelve el número de caracteres del String.
		System.out.println("Longitud de la frase: " + nombre.length());

		// Devuelve el carácter situado en la posición 'index' pasada por
		// parámetro.

		System.out.println("El caracter en la posicion 4 es: " + nombre.charAt(4));

		// Método que nos permite cambiar un carácter por otro dentro de una
		// cadena.
		System.out.println("Cambiamos las 'e' por las 'o': " + nombre.replace('e', 'o'));

		// Indicamos la posicion del primer caracter dentro de la
		// cadena introducido en indexOf
		System.out.println("Vemos la posición de la primera letra 'o': " + nombre.indexOf("o"));

		// Indicamos la posicion del último caracter
		// dentro de la cadena introducido en indexOf
		System.out.println("Vemos la posición de la última letra 'o': " + nom.lastIndexOf("o"));

		// Compara la primera letra de dos caracteres
		// Numero positivo es mayor
		// 0 son iguales
		System.out.println("Vamos a comparar las primeras letras de las " + "dos frases " + nombre.compareTo(nom));

		// Devuelve una subcadena que corresponde a los valores beginIndex y
		// endIndex.
		System.out.println(
				"Vamos a ocultar el primer y último " + "caracter de la primer cadena: " + nombre.substring(1, 4));

		// Convierte una cadena a un array de cadenas.
		String[] stringComoArray = nombre.split(" ");
		for (int i = 0; i < stringComoArray.length; i++) {
			System.out.println(stringComoArray[i]);
		}

		// Convierte a cadenas los tipos de datos pasados como parámetro.
		float a = 2.5f;
		System.out.println("Convertimos el número a String: \n" + String.valueOf(a));

		// Convertimos un String a un int
		// numero = numero * 2; (no deja porque no se puede multiplicar un
		// string)
		// Lo pasamos a int
		int num = Integer.parseInt(numero);
		System.out.println("El numero por 2 es igual a " + num * 2);

	}
}
