package hoja2ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		// 7.- La siguiente tabla guarda el número de espectadores que vieron La
		// 2 a las 23:00 horas, cada día de la semana. Escribe un programa que
		// busque el máximo y el mínimo de audiencia en esta semana.

		/*
		 * Día Espectadores Lunes 2.000.000 Martes 2.500.000 Miércoles 3.100.000
		 * Jueves 3.000.000 Viernes 1.200.000 Sábado 1.800.000 Domingo 2.050.000
		 */

		int[] espectadores = { 2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000 };
		int minAud = 0;
		int maxAud = 0;

		for (int i = 0; i < espectadores.length; i++) {

			if (espectadores[i] < espectadores[minAud]) {
				minAud = i;
			}
			if (espectadores[i] > espectadores[maxAud]) {
				maxAud = i;
			}
		}
		System.out.println("====================================");
		System.out.println("Espectadores máximos de esta semana: " + espectadores[maxAud]);
		System.out.println("====================================");
		System.out.println("====================================");
		System.out.println("Espectadores mínimos de esta semana: " + espectadores[minAud]);
		System.out.println("====================================");
	}
}
