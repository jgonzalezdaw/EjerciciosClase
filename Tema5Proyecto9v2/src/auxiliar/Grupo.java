/**
 * @author tonino
 */

package auxiliar;

import java.util.Scanner;

public class Grupo {

	// Atributos
	private int numGrupo;
	private String nivel;
	private int curso;
	private String clase;

	// Constructores

	public Grupo() {

	}

	public Grupo(int numGrupo, String nivel, int curso, String clase) {
		this.numGrupo = numGrupo;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}

	// Métodos
	public String toString() {
		return numGrupo + "\t" + nivel + "\t" + curso + "\t" + clase;
	}

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

	public int getNumGrupo() {
		return numGrupo;
	}

	
}