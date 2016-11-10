package bucleswhile;
import java.util.Scanner;

public class Ejercicio3 {// @MCC//
	public static void main(String[] args) {

		Scanner repetir = new Scanner(System.in);

		System.out.println(
				"Introduzca un numero entero entre 1 y 10");

		int numero;
		numero = repetir.nextInt();
		
		while (numero < 1 || numero > 10) {
			System.out.println("Entrada incorrecta, vuelva a intentar");
			numero = repetir.nextInt();
		}
		
		System.out.println("Número: " + numero);
	}
}