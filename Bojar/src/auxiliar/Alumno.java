package auxiliar;

import java.util.Scanner;

/**
 * La clase Alumno contiene todos los datos de alumno, como sus métodos de
 * acceso, métodos para pedir y mostrar datos. También tiene constructores.
 * 
 * @author Patryk
 *
 */
public class Alumno {

	// Atributos

	private int numExpediente;
	private String apellidos;
	private String nombre;
	private int numGrupo;

	// Constructores
	/**
	 * Constructor básico
	 */
	public Alumno() {

	}

	/**
	 * 
	 * @param numExpediente
	 *            Número del expediente del alumno.
	 * @param apellidos
	 *            Apellido del alumno.
	 * @param nombre
	 *            Nombre del alumno.
	 * @param grupo
	 *            Número del grupo al que pertence el alumno.
	 */
	public Alumno(int numExpediente, String apellidos, String nombre, int grupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.numGrupo = numGrupo;
	}

	/**
	 * Muestra datos del alumno.
	 */
	public String toString() {
		return numExpediente + "\t" + apellidos + "\t" + nombre + "\t" + numGrupo;
	}

	/**
	 * Pide los datos por consola del alumno.
	 */
	public void leeDatos() {
		Scanner input = new Scanner(System.in);

		System.out.println("Rellene los siguientes datos del alumno:");
		System.out.println("________________________________________");
		System.out.print("Número de expediente: ");
		numExpediente = input.nextInt();

		input.nextLine();

		System.out.print("Apellido/s: ");
		apellidos = input.nextLine();

		System.out.print("Nombre: ");
		nombre = input.nextLine();

		System.out.print("Número del grupo: ");
		numGrupo = input.nextInt();

	}

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumGrupo() {
		return numGrupo;
	}

	public void setNumGrupo(int numGrupo) {
		this.numGrupo = numGrupo;
	}

}
