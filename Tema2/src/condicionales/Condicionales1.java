package condicionales;

public class Condicionales1 {

	public static void main(String[] args) {

		int edad = 40;

		// Esta manera de colocar dos if no debería hacerse.
		// En su lugar hay que usar else.
		if (edad >= 18) {
			System.out.print("Puedes pasar");
			System.out.println(" (Ya eres mayor de edad)");
		}

		if (edad < 18) {
			System.out.print("No puedes pasar");
			System.out.println(" (No eres mayor de edad)");
		}

	}

}
