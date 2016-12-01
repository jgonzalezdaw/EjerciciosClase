package hoja2ejercicios;

/**
 * Ampliamos el ejercicio anterior para que nos diga también los días de la semana.
 * @author csogorb
 *
 */
public class Ejercicio7Ampliado {

	public static void main(String[] args) {
		// 7.- La siguiente tabla guarda el número de espectadores que vieron La
		// 2 a las 23:00 horas, cada día de la semana. Escribe un programa que
		// busque el máximo y el mínimo de audiencia en esta semana.

		int[] espectadores = { 2000000, 2500000, 3100000, 3000000, 1200000, 
				1800000, 2050000 };
		String[] diasSemana = { "Lunes", "Martes", "Miércoles", "Jueves", 
				"Viernes", "Sábado", "Domingo" };
		
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
		System.out.println("El día de la semana fue: " + diasSemana[maxAud]);
		System.out.println("====================================");
		
		System.out.println("====================================");
		System.out.println("Espectadores mínimos de esta semana: " + espectadores[minAud]);
		System.out.println("El día de la semana fue: " + diasSemana[minAud]);
		System.out.println("====================================");
	}
}
