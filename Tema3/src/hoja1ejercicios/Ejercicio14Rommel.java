package hoja1ejercicios;

public class Ejercicio14Rommel {

	public static void main(String[] args) {
		// 14.- Escribe un programa que rellene un array llamado primos con los
		// 100 primeros números primos.
		// Recuerda que un número entero es primo si no puede dividirse por
		// ninguno que no sea 1 o él mismo.
		// Los primeros números primos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
		// ...

		int primos[] = new int[100];

		double base = 1; // Número que va de 1 a ...
		int resto; // Resto de las sucesivas divisiones			
		int comp = 0; // Contador de divisores de base
		int y = 0; // Posición del array a rellenar
		boolean fin = false;

		 // Formula para ver que el resto es " 0 "
		 for(int i=1;i<=7;i++){
		 System.out.println("Numero base " + i);
		 for(int m=1;m<=7;m++){
		 System.out.println((i%m));
		 }
		
		 }

		// Do para Buscar los numeros primos
		do {
			for (int i = 1; i <= base; i++) {
				resto = (int) (base % i);

				if (resto == 0) {
					comp++;
				}
			}

			if (comp == 2) {
				primos[y] = (int) base;
				y++;
			}

			base++;
			comp = 0;
		} while (y < 100);

		// Imprimir numeros primos

		System.out.println("\nFuera del bucle while: ");
		for (int i = 0; i < primos.length; i++) {
			System.out.println((i + 1) + ") " + primos[i] + " es primo.");
		}
	}
}
