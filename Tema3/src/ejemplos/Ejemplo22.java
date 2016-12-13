package ejemplos;

/**
 * Recorrer un array bidimensional mostrando todos sus datos
 * @author csogorb
 *
 */
public class Ejemplo22 {

	public static void main(String[] args) {
		
		// Array que contendrá una tabla con nombres y edades
		// de cuatro personas.
		String[][] datosAlumnos = {
				{"Teo Waelder", 		"20" },
				{"Gustavo Baquerizo", 	"20"},
				{"Patryk Bojar",		"18"},
				{"Matías Beraldo",		"20"}
		};
		
		// Mostramos los datos
		for(int i=0;i<datosAlumnos.length; i++){
			System.out.println(datosAlumnos[i][0] + " " 
							+ datosAlumnos[i][1]);
		}
		
		
		
	}
}





















