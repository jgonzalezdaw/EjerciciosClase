package condicionales;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime la temperatura");
		int temperatura = entrada.nextInt();

		if (temperatura > 120) {
			System.out.println("TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, INSENSATOS!");
		}
	}

}