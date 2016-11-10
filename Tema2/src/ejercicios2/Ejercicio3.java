package ejercicios2;

public class Ejercicio3 {

	public static void main(String[] args) {
		// 3.- Crea una aplicación que calcule una lista con las potencias de 3
		// menores que 12000. Haz que en
		// cada pasada del bucle se muestre el exponente y el valor de la
		// potencia. Utiliza un bucle do-while.
		// Ayuda: Recuerda que para elevar un número a otro usamos la función
		// Math.pow(base, exponente)

		double exponente = 0;
		double potencia = 0;
		double base = 3;

		do {

			potencia = Math.pow(base, exponente);
			if (potencia > 12000) {
				break;
			}
			System.out.println("Exponente: " + exponente + " Potencia: " + potencia);

			exponente++;
		} while (true);

	}

}