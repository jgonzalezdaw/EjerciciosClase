
package auxiliar;

import java.util.Scanner;

/**
 * La clase Grupo representa un grupo de estudiantes del Instituto.
 */
public class Grupo {

	private int numGrupo;
	private String nivel;
	private int curso;
	private String clase;

	/**
	 * Inicializa un objeto Grupo sin asignar valores a los atributos.
	 */
	public Grupo() {

	}

	/**
	 * Inicializa un objeto Grupo asignando valores a todos los atributos.
	 * 
	 * @param numGrupo
	 *            Número de grupo (debería ser distinto a los demás grupos).
	 * @param nivel
	 *            Nivel del grupo (ESO, BACHILLERATO, etc.).
	 * @param curso
	 *            Número de curso (1, 2, 3, etc.).
	 * @param clase
	 *            Letra del curso (A, B, C, etc.).
	 */
	public Grupo(int numGrupo, String nivel, int curso, String clase) {
		this.numGrupo = numGrupo;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}

	/**
	 * Devuelve un String con un resumen de los datos del grupo.
	 * 
	 * @return String con un resumen de los datos del grupo.
	 */
	public String toString() {
		return numGrupo + "\t" + nivel + "\t" + curso + "\t" + clase;
	}

	/**
	 * Pregunta al usuario y lee desde la terminal los valores de los atributos
	 * del grupo.
	 */
	public void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Número de Grupo?");
		numGrupo = entrada.nextInt();

		entrada.nextLine();

		System.out.println("¿Nivel?");
		nivel = entrada.nextLine();

		System.out.println("¿Curso?");
		curso = entrada.nextInt();

		entrada.nextLine();

		System.out.println("¿Clase?");
		clase = entrada.nextLine();
	}

	/**
	 * Devuelve el número de grupo.
	 * 
	 * @return Número de grupo.
	 */
	public int getNumGrupo() {
		return numGrupo;
	}

}