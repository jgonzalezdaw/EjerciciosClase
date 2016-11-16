package ejemplos;

public class Ejemplo3 {

	public static void main(String[] args) {

		// Crea un array con los nombres de los meses
		// del año. Después, muestra todos los valores
		// usando un bucle while.

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		int i = 0;
		while (i < 12) {
			System.out.println(meses[i]);
			i++;
		}
	}
}
