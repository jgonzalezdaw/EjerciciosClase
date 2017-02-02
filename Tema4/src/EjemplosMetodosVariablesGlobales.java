import java.util.*;

public class EjemplosMetodosVariablesGlobales {

	static String nombre; // Variable global

	public static void main(String[] args) {
		leerNombre();
		System.out.println("El nombre es " + nombre);
	}

	static void leerNombre() {
		Scanner entrada = new Scanner(System.in); // Variable local
		System.out.println("¿Cómo te llamas?");
		nombre = entrada.nextLine();
	}

}
