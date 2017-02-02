import java.util.*;

public class EjemplosMetodosParametros {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe tu nombre de usuario");
		String nombreUsuario = entrada.nextLine();

		saludo(nombreUsuario);

	}

	static void saludo(String nombre) {

		System.out.println("Hola, " + nombre + " ¿cómo estás?");

	}

}
