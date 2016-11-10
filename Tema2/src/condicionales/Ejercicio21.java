package condicionales;
import java.net.SocketImpl;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// 21.- Crea un programa que pregunte el nombre del usuario y luego lo
		// escriba. Ahora bien, si el usuario no introduce nada, el nombre
		// deberá quedar con el valor "Desconocido".

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe tu nombre: ");
		String nombre = entrada.nextLine();

		nombre = nombre.equals("") ? nombre = "Desconocido" : nombre;

	
		System.out.println(nombre);

	}

}