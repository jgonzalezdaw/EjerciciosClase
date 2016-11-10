package bucleswhile;

import java.util.Scanner;

public class Ejercicio10Alternativo2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int respuesta = 0;
		while (respuesta < 1 || respuesta > 4) {
			System.out.println("¿Cómo se escribe 30 en hexadecimal?");
			System.out.println("1 → 1E\n2 → 2F\n3 → 33\n4 → Ninguno de los anteriores");
			respuesta = entrada.nextInt();
		}
		
		if (respuesta == 1) {
			System.out.println("El resultado es correcto");
		} else {
			System.out.println("El resultado NO es correcto.");
		}
		System.out.println("\n\nPrograma finalizado");
	}
}