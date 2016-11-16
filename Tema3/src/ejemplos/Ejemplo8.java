package ejemplos;

public class Ejemplo8 {

	public static void main(String[] args) {

		// Precios de varios productos
		double[] a = { 2.5, 1.15, 4, 10.50, 6.35 };

		// Unidades compradas de cada producto
		int[] b = { 3, 5, 1, 3, 4 };

		// Total gastado en cada producto
		double[] c = new double[5];

		int i = 0;
		do {
			c[i] = a[i] * b[i];
			i++;
		} while (i < c.length);

		for (i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
}
