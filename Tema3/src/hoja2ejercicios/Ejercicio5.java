package hoja2ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {

		float min = 100, max = 0,
				temperatura[] = { 15F, 16.1F, 16F, 15.4F, 15F, 14F, 10.2F, 11F, 11.5F, 10F, 10.1F, 9.8F, 9F, 6F };
		int i, posmin = 0, posmax = 0;

		for (i = 0; i < temperatura.length; i++) {
			System.out.println((i + 1) + "º temperatura es: " + temperatura[i]);
			if (min > temperatura[i]) {
				min = temperatura[i];
				posmin = (i + 1);
			}
			if (max < temperatura[i]) {
				max = temperatura[i];
				posmax = (i + 1);
			}
		}
		System.out.println("\nTemperatura mínima es " + min + " y está en la posición: " + posmin
				+ "\nTemperatura máxima es: " + max + " y está en la posición: " + posmax);
	}
}