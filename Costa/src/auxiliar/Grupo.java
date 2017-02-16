package auxiliar;

import java.util.Scanner;

public class Grupo {
	private static Scanner entrada = new Scanner(System.in);

	// ATRIBUTOS //
	private String nivel;
	private int curso;
	private String clase;
	private int numGrupo;

	// CONSTRUCTOR //
	public Grupo() {
	}

	public Grupo(String nivel, int curso, String clase) {
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}

	// GET-SET //
	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getNumGrupo() {
		return numGrupo;
	}

	public void setNumGrupo(int numGrupo) {
		this.numGrupo = numGrupo;
	}

	// MÉTODOS //
	public String toStringG() {
		return numGrupo + "\t" + nivel + "\t" + curso + "\t" + clase;
	}

	public void leeDatosG() {

		System.out.println("Número de Grupo (I): ");
		numGrupo = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Nivel (S): ");
		nivel = entrada.nextLine();
		System.out.println("Curso (I): ");
		curso = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Clase (S): ");
		clase = entrada.nextLine();
	}

}
