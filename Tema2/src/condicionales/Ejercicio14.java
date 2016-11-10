package condicionales;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Angel Hernandez ejercicio14

		Scanner entrada = new Scanner(System.in);

		System.out.println("Elige un numero del 1 al 12:");

		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Enero");
	
		case 2:
			System.out.println("Febrero");
		
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("Opcion incorrecta.");
		}

	}

}