package buclesfor;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// Amplía la aplicación anterior para que a medida que se van
		// introduciendo las notas se vayan sumando
		// (en una variable llamada suma). Al final, devolverá la nota media de
		// esas notas.

		float nota;
		float suma = 0;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			do {
				System.out.println("Escribe tus notas " + "(" + (5 - i) + ")");
				nota = entrada.nextFloat();
			} while (nota > 10 || nota < 0);
			
			suma = nota + suma;

		}

		System.out.println(suma / 5);

	}
}