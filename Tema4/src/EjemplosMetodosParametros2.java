import java.util.*;

public class EjemplosMetodosParametros2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número:");
		int numero = entrada.nextInt();
		
		tablaMultiplicar(numero);

	}

	static void tablaMultiplicar(int num) {
		
		System.out.println("\nTabla de multiplicar del " + num);
		System.out.println("===================================");

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}

	}

}














