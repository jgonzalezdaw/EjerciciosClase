/**
 * @author tonino
 */

package auxiliar;

import java.util.Scanner;

public class Alumno {

	// Atributos

	private int numExpediente;
	private String apellidos;
	private String nombre;
	private int numGrupo;

	// Constructores

	public Alumno() {

	}

	public Alumno(int numExpediente, String apellidos, String nombre, int numGrupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.numGrupo = numGrupo;
	}

	// M�todos

	public String toString() {
		return numExpediente + "\t" + apellidos + "\t" + nombre + "\t" + numGrupo;
	}

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

	// Metodos de acceso

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumGrupo() {
		return numGrupo;
	}

}