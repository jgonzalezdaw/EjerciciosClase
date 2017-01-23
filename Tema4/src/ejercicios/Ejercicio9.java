package ejercicios;

/**
*
* @author Patryk
*
* 9.- Crea un método que tome como parámetro un entero representando un
* año, y devuelva true o false indicando si es bisiesto o no.
*
*/
import java.util.*;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Introduce un año para deducir si es bisiesto o no: ");
		int year = input.nextInt();

		if (esBisiesto(year)) {
			System.out.println("Bisiesto");
		} else {
			System.out.println("No es bisiesto");
		}

	}

	static boolean esBisiesto(int year) {
		boolean resultado = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
		return resultado;
	}
}
