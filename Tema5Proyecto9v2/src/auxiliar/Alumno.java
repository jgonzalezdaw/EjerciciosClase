/**
 * @author tonino
 */

package auxiliar;

import java.util.Scanner;

/**
 * La clase Alumno representa un alumno del Instituto.
 */
public class Alumno {

	private int numExpediente;
	private String apellidos;
	private String nombre;
	private int numGrupo;

	/**
	 * Inicializa un objeto Alumno sin asignar valores a los atributos.
	 */
	public Alumno() {

	}

	/**
	 * Inicializa un objeto Alumno asignando valores a todos los atributos.
	 * 
	 * @param numExpediente
	 *            Número de expediente del alumno (único para cada alumno).
	 * @param apellidos
	 *            Apellidos del alumno.
	 * @param nombre
	 *            Nombre del alumno.
	 * @param numGrupo
	 *            Número de grupo del alumno.
	 */
	public Alumno(int numExpediente, String apellidos, String nombre, int numGrupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.numGrupo = numGrupo;
	}

	/**
	 * Devuelve un String con los apellidos, nombre y número de grupo del
	 * alumno.
	 * 
	 * @return String con los apellidos, nombre y número de grupo del alumno.
	 */
	public String toString() {
		return numExpediente + "\t" + apellidos + "\t" + nombre + "\t" + numGrupo;
	}

	/**
	 * Pregunta al usuario y lee desde la terminal los valores de los atributos
	 * del alumno.
	 */
	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Número de expediente?");
		numExpediente = entrada.nextInt();

		entrada.nextLine();

		System.out.println("¿Apellidos?");
		apellidos = entrada.nextLine();

		System.out.println("¿Nombre?");
		nombre = entrada.nextLine();

		System.out.println("¿Número de grupo?");
		numGrupo = entrada.nextInt();
	}

	/**
	 * Devuelve el número de expediente del alumno.
	 * 
	 * @return Número de expediente del alumno.
	 */
	public int getNumExpediente() {
		return numExpediente;
	}

	/**
	 * Asigna el número de expediente del alumno.
	 * 
	 * @param numExpediente
	 *            Número de expediente del alumno.
	 */
	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	/**
	 * Devuelve los apellidos del alumno.
	 * 
	 * @return Apellidos del alumno.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Devuelve el nombre del alumno.
	 * 
	 * @return Nombre del alumno.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve el número de grupo del alumno.
	 * 
	 * @return Número de grupo del alumno.
	 */
	public int getNumGrupo() {
		return numGrupo;
	}

}
