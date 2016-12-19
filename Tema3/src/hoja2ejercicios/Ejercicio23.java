package hoja2ejercicios;

public class Ejercicio23 {

	public static void main(String[] args) {

		float temperaturas[][][] = new float[3][3][3];

		temperaturas[0][0][0] = 26f;
		temperaturas[0][0][1] = 21f;
		temperaturas[1][1][2] = 19f;
		temperaturas[2][2][2] = 11f;
		temperaturas[2][0][0] = 17f;

		float suma = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			for (int j = 0; j < temperaturas[0].length; j++) {
				for (int k = 0; k < temperaturas[0][0].length; k++) {
					suma = suma + temperaturas[i][j][k];
				}

			}
		}

		System.out.println("Suma de temperaturas del edificio: " + suma);

		System.out.println("Temperatura media de las 5 habitaciones: " + suma / 5);

	}

}
