package ejercicios3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Crea una aplicación para probar la capacidad de cálculo mental de los
		// usuarios. Se calcularán
		// dos números aleatorios entre 1 y 100 y se mostrarán en pantalla. A
		// continuación el usuario deberá
		// escribir el resultado de la suma de ambos números y se le indicará si
		// ha acertado o no.
		// Estas acciones se repetirán indefinidamente mediante un bucle while.
		// Ayuda: Puedes generar un número aleatorio mayor o igual a 0 y menor
		// que 1 con la orden
		// Math.random( ). Si lo multiplicas por 100 y le sumas 1, entonces
		// obtendrás un número entre 1 y
		// 100, ambos inclusive:
		// (int) (Math.random()*100 + 1)
		// Ayuda: Puedes hacer que un bucle se ejecute indefinidamente si pones
		// entre paréntesis una
		// condición que siempre sea verdadera

		Scanner entrada = new Scanner(System.in);

		while (true) {
			int numeroAleatorio = (int) (Math.random() * 100 + 1);
			int numeroAleatorio2 = (int) (Math.random() * 100 + 1);
			int resultado;
			
			System.out.println(numeroAleatorio + "+" + numeroAleatorio2 + "=");
			System.out.println("¿Resultado?");
			resultado = entrada.nextInt();
			
			int suma = numeroAleatorio + numeroAleatorio2;
			if (resultado == suma) {
				System.out.println("Has acertado\n");
			} else {
				System.out.println("Has fallado\n");
			}
		}

	}

}