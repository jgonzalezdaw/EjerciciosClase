import java.util.*;

public class EjemplosMetodosParametros3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			tablaMultiplicar(i);
		}

	}

	static void tablaMultiplicar(int num) {

		System.out.println("\nTabla de multiplicar del " + num);
		System.out.println("===================================");

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}

	}

}
