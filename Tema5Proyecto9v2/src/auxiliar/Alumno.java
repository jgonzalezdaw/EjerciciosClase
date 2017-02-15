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
	private Grupo grupo;

	// Constructores

	public Alumno() {

	}

	public Alumno(int numExpediente, String apellidos, String nombre, Grupo grupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
	}

	// M�todos

	public String toString() {
		return numExpediente + "\t" + apellidos + 
				"\t" + nombre + "\t" + grupo.toString();
	}

	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("�N�mero de expediente?");
		numExpediente = entrada.nextInt();

		entrada.nextLine();

		System.out.println("�Apellidos?");
		apellidos = entrada.nextLine();

		System.out.println("�Nombre?");
		nombre = entrada.nextLine();

		grupo = new Grupo();
		grupo.leeDatos();
	}

	// Metodos de acceso

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

}