package hoja1ejercicios;

public class Ejercicio12 {

	public static void main(String[] args) {

		// Declarar el array.
		String[] matriculas = new String[100];

		// Recorrerlo asignando a cada posición el valor "sinmatricula".
		for (int i = 0; i < matriculas.length; i++) {
			matriculas[i] = "sinmatricula";
		}

		// Recorrelo para mostrar por pantalla todos los valores.
		System.out.println("Listado de matrículas");
		System.out.println("------- -- ----------");
		for (int i = 0; i < matriculas.length; i++) {
			System.out.println(i + " - " + matriculas[i]);
		}

	}

}
