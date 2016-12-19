package hoja2ejercicios;

public class Ejercicio24 {

	public static void main(String[] args) {

		int[][][] huecos = new int[3][3][3];

		for (int i = 0; i < huecos.length; i++) {

			for (int j = 0; j < huecos[0].length; j++) {

				for (int k = 0; k < huecos[0][0].length; k++) {

					huecos[i][j][k] = (int) (Math.random() * 2 + 1);

				}

			}

		}

		int rojas = 0;
		int azules = 0;
		for (int i = 0; i < huecos.length; i++) {
			for (int j = 0; j < huecos[0].length; j++) {
				for (int k = 0; k < huecos[0][0].length; k++) {

					if (huecos[i][j][k] == 1) {
						rojas++;
					} else {
						azules++;
					}

				}
			}
		}

		System.out.println("Hay " + rojas + " bolas rojas y " + azules + " azules.");

	}

}
