package auxiliar;

import java.util.Scanner;

/**
 * La clase Grupo contienen los datos del grupo, al igual que los métodos
 * necesarios para pedir y mostrar los datos, también tiene constructores.
 * 
 * @author Patryk
 *
 */
public class Grupo {

	// Atributos
	private int numGrupo;
	private String nivel;
	private int curso;
	private String clase;

	// Constructores
	/**
	 * Constructor básico
	 */
	public Grupo() {

	}

	/**
	 * 
	 * @param numGrupo
	 *            Número del grupo.
	 * @param nivel
	 *            Nivel del clase: ESO, FP...
	 * @param curso
	 *            El año del curso: 1, 2...
	 * @param clase
	 *            Letra de la clase: A, B...
	 */
	public Grupo(int numGrupo, String nivel, int curso, String clase) {
		this.numGrupo = numGrupo;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}

	/**
	 * Devuelve una cadena de caracteres con los datos del grupo.
	 */
	public String toString() {
		return numGrupo + "\t" + nivel + "\t" + curso + "\t" + clase;
	}

	/**
	 * Pide por consola los datos del grupo: número, nivel, curso, clase.
	 */
	public void leeDatos() {
		Scanner input = new Scanner(System.in);

		System.out.println("----------------------------------------");
		System.out.println("Antes de completar todos los campos lea la siguiente información.");
		System.out.println("Se refiere a nivel todo aquel alumno que está cursando ESO, Bachillerato, FP...");
		System.out.println("El curso es su actual año de estudios dentro del nivel especificado.");
		System.out.println("Rellene los siguientes datos del grupo:");
		System.out.println("________________________________________");

		System.out.print("Número del grupo: ");
		numGrupo = input.nextInt();

		input.nextLine();

		System.out.print("Nivel: ");
		nivel = input.nextLine();

		System.out.print("Curso: ");
		curso = input.nextInt();

		input.nextLine();

		System.out.print("Clase: ");
		clase = input.nextLine();

	}

	public int getNumGrupo() {
		return numGrupo;
	}

}
