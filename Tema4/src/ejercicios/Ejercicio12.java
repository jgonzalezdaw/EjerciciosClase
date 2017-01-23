package ejercicios;

import java.util.Scanner;

class Ejercicio12 {

	public static void main(String[] args) {
		// 12.- Desarrolla modularmente (usando tres métodos,
		// además de main( )) un programa que solicite
		// por consola una lista de números enteros,
		// los ordene y los muestre en pantalla.

		// llamamos al metodo introducir sin pasarle ningun valor
		int[] valores = introducir();
		ordenar(valores);
		imprimir(valores);
	}

	static int[] introducir() {
		Scanner input = new Scanner(System.in);
		// introduciremos los numeros en un array
		int numeroStr[] = new int[4];
		for (int i = 0; i < numeroStr.length; i++) {
			System.out.println("Introduce un numero:");
			numeroStr[i] = input.nextInt();
		}
		// llamamos al metodo ordenar pasando el array
		return numeroStr;
	}

	static void ordenar(int[] numeroStr) {
		int posMin = 0;
		int aux;

		// ordenamos el array
		for (int i = 0; i < numeroStr.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < numeroStr.length; j++) {
				if (numeroStr[posMin] > numeroStr[j]) {
					posMin = j;
				}
			}
			aux = numeroStr[i];
			numeroStr[i] = numeroStr[posMin];
			numeroStr[posMin] = aux;
		}
	}

	static void imprimir(int[] numeros) {
		// en el metodo imprimir mostramos
		// los numeros ordenados
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}