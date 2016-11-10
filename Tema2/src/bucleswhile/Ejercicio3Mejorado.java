package bucleswhile;
import java.util.Scanner;

public class Ejercicio3Mejorado {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"Introduzca un numero entero entre 1 y 10");
		
		int numero;
		while(!entrada.hasNextInt()){
			System.out.println(
					"Vuelva a intentarlo!");
			entrada.nextLine();
		}
		
		numero = entrada.nextInt();
		
		while (numero < 1 || numero > 10) {
			System.out.println("Entrada incorrecta, vuelva a intentar");
			
			while(!entrada.hasNextInt()){
				System.out.println("Vuelva a intentarlo 2!");
				entrada.nextLine();
			}
			
			numero = entrada.nextInt();
		}
		
		System.out.println("Número: " + numero);
	}
}






