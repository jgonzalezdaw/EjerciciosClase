/**
 * 
 */
package Examen2;

/**
 * @author Ramon
 *
 */
public class Ejercicio3 {

	/**
	 * Array Bidimensional con posición minima posMin y posición máxima posMax.
	 */
	public static void main(String[] args) {
		// Escribe un programa que almacene los datos de la siguiente tabla en
		// un array bidimencional.
		// Nombre Altura(m)
		// Juan 1.77
		// Pedro 2.01
		// Marcos 1.85
		// Raúl 1.74

		// A continuacion nos informará de cuál es la persona con mayor altura,
		// y cual es la menor altura, con este formato...

		// Declaracion del Array
		String datos[][] = { { "Juan", "1.77" }, { "Pedro", "1" },
				{ "Marcos", "2" }, { "Raúl", "3" } };

		// Declaracion de Variable
		int posMin = 0;
		int posMax = 0;
		double min = 0;
		double max = 0;
		double valor = 0;

		for (int i = 0; i < datos.length; i++) {
			

			valor = Double.parseDouble(datos[i][1]);
			min = Double.parseDouble(datos[posMin][1]);
			max = Double.parseDouble(datos[posMax][1]);

			if (valor < min) {
				posMin = i;
			}
			if (valor > max) {
				posMax = i;
			}
		}
		System.out.println(" \t == Array ==");
		System.out.println("================================");
		for (int i = 0; i < datos.length; i++) {
			System.out.println("\t" + datos[i][0] + "\t " + datos[i][1]);
		}
		System.out.println("================================");
		System.out.println("La persona con menor altura es " 
		+ "\"" + datos[posMin][0] + "\"" + " y mide " + "\"" + min
				+ "\"" + " m");
		System.out.println("La persona con mayor altura es " 
				+ "\"" + datos[posMax][0] + "\"" + " y mide " 
				+ "\"" + max
				+ "\"" + " m");
		System.out.println("================================");
		System.out.println("     == Fin del Programa == ");

	}

}