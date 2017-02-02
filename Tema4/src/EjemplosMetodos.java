
public class EjemplosMetodos {

	public static void main(String[] args) {

		System.out.println("Llamando al mayordomo...");
		mayordomo();
		System.out.println("Más instrucciones...");

		System.out.println("\nÉsta es la tabla del 5:");
		tablaDel5();

	}

	// Muestra una frase en pantalla.
	static void mayordomo() {
		System.out.println("¿Qué se le ofrece, señor?");
	}

	// Método que escribe la tabla de multiplicar del 5.
	static void tablaDel5() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("5 x " + i + " = " + 5 * i);
		}

	}

}
