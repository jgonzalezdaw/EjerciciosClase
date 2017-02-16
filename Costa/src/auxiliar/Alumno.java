package auxiliar;

import java.util.Scanner;
import auxiliar.Grupo;

public class Alumno {

	private static Scanner entrada = new Scanner(System.in);

	// ATRIBUTOS //
	private int numExpediente;
	private String apellidos;
	private String nombre;
	private int numGrupo;

	// CONSTRUCTORES //
	public Alumno() {
	}

	public Alumno(int numExpediente, String apellidos, String nombre, int bnumGrupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.numGrupo = numGrupo;
	}

	// GET-SET //
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

	// MÉTODOS //
	public String toStringA() {

		return numExpediente + "\t" + apellidos + "\t" + nombre + "\t" + numGrupo;

	}

	public void leeDatosA() {

		System.out.print("Número de Expediente (I): ");
		numExpediente = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Apellidos (S): ");
		apellidos = entrada.nextLine();
		System.out.print("Nombre (S): ");
		nombre = entrada.nextLine();
		System.out.print("Número de grupo (I): ");
		numGrupo = entrada.nextInt();
		entrada.nextLine();

	}

}
