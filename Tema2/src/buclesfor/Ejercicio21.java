package buclesfor;

import java.util.*;

public class Ejercicio21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero = 0;

		int i = 1;
		while (i <= 5) {
			
			System.out.print("Número: ");
			numero = entrada.nextInt();
			
			if (numero == 1) {
				System.out.println("No seas tonto.");
				continue;
			}

			for (int j = 1; j <= 10; j++) {
				System.out.println(numero + " x " 
						+ j + " = " + numero * j);
			}

			System.out.println();
			i++;
			
		}

	}

}
