package buclesfor;

public class Ejercicio17 {

	public static void main(String[] args) {

		System.out.println("TABLAS DE MULTIPLICAR");
		System.out.println("==========================\n");
		for (int num = 1; num <= 10; num++) {
			
			System.out.println("Tabla de multiplicar del " + num);
			System.out.println("===============================");
			// Mostramos la tabla de multiplicar de num.
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " 
						+ i + " = " + num * i);
			}
			System.out.println();

		}

	}

}
