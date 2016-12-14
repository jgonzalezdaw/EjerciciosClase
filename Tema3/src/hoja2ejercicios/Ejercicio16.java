package hoja2ejercicios;

public class Ejercicio16 {
	public static void main(String[] args) {

		String[][] notas = {
				{"Jose Luis Martínez","7"},
				{"Antonia Ruiz", "9"},
				{"Marcos Ramírez","10"},
				{"Juana Herranz","4"},
				{"Alberto López", "7"}
		};
		
		float suma = 0;
		
		// Mostramos el array
		System.out.println("Listado de notas");
		System.out.println("============================");
		for(int i = 0; i<notas.length;i++){
			System.out.println(notas[i][0] + "\t" + notas[i][1]);
		}
		
		for (int i = 0; i < notas.length; i++) {
			suma = suma + Float.parseFloat(notas[i][1]);
		}
		
		System.out.println("\nLa nota media es " + suma/notas.length);
		
	}
}













