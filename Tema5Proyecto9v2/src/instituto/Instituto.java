package instituto;

import auxiliar.Alumno;
import auxiliar.Grupo;

/**
 * La clase Instituto representa los datos de un Instituto, con sus alumnos y
 * grupos, así como las operaciones con ambos.
 */
public class Instituto {

	private final int MAX_ALUMNOS = 30;
	private final int MAX_GRUPOS = 20;
	private Alumno alumnos[] = new Alumno[MAX_ALUMNOS];
	private Grupo grupos[] = new Grupo[MAX_GRUPOS];

	/**
	 * Añade el alumno que se le pasa como argumento al array alumnos[].
	 * 
	 * @param alu
	 *            Alumno que hay que dar de alta en el instituto.
	 */
	public void addAlumno(Alumno alu) {

		// Comprobamos que no haya un alumno con ese número de expediente.
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == alu.getNumExpediente()) {
				System.out.println("Número de expediente repetido.");
				return;
			}
		}

		// Comprobamos que el grupo en el que queremos matricular
		// al alumno exista.
		boolean grupoExiste = false;
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null && grupos[i].getNumGrupo() == alu.getNumGrupo()) {
				grupoExiste = true;
				break;
			}
		}

		if (!grupoExiste) {
			return;
		}

		// Añadimos al alumno.
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alu;
				break;
			}
		}

	}

	/**
	 * Borra del array alumnos[] al alumno cuyo número de expediente se pasa
	 * como parámetro.
	 * 
	 * @param numExp
	 *            Número de expediente del alumno que se quiere eliminar.
	 */
	public void delAlumno(int numExp) {

		int posicion = buscaAlumno(numExp);
		if (posicion != -1) {
			alumnos[posicion] = null;
		}

	}

	/**
	 * Añade el grupo que se le pasa como argumento al array grupos[].
	 * 
	 * @param grupo
	 *            Grupo que hay que dar de alta en el instituto.
	 */
	public void addGrupo(Grupo grupo) {
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] == null) {
				grupos[i] = grupo;
				break;
			}
		}
	}

	/**
	 * Borra del array grupos[] el grupo cuyo número se pasa como parámetro.
	 * 
	 * @param numGrupo
	 *            Número del grupo que se quiere eliminar.
	 */
	public void delGrupo(int numGrupo) {

		// Recorremos el array de alumnos para comprobar si alguno está
		// matriculado en el grupo que se quiere borrar.
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumGrupo() == numGrupo) {
				System.out.println("No se puede eliminar el grupo. Hay alumnos matriculados.");
				return;
			}
		}

		int posicion = buscaGrupo(numGrupo);
		if (posicion != -1) {
			grupos[posicion] = null;
		}
	}

	/**
	 * Devuelve el número de alumnos del instituto.
	 * 
	 * @return Número de alumnos en el instituto.
	 */
	public int numAlumnos() {
		int suma = 0;

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				suma++;
			}
		}
		return suma;
	}

	/**
	 * Devuelve el número de grupos del instituto.
	 * 
	 * @return Número de grupos en el instituto.
	 */
	public int numGrupos() {
		int suma = 0;
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null) {
				suma++;
			}
		}
		return suma;
	}

	/**
	 * Busca si un alumno está matriculado en el centro, y devuelve su posición
	 * en el array alumnos[].
	 * 
	 * @param numExp
	 *            Número de expediente del alumno.
	 * @return Posición en el array alumnos del alumno que hemos recibido como
	 *         parámetro, o -1 si no se encuentra.
	 */
	public int buscaAlumno(int numExp) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExp) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * Muestra una lista en la consola de todos los alumnos matriculados.
	 */
	public void muestraAlumnos() {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(alumnos[i].toString());
			}
		}

		System.out.println();
	}

	/**
	 * Muestra una lista en la consola de todos los grupos del instituto.
	 */
	public void muestraGrupos() {
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null) {
				System.out.println(grupos[i].toString());
			}
		}
	}

	/**
	 * Muestra por consola una lista con los datos de los alumnos que pertenecen
	 * al grupo pasado como parámetro.
	 * 
	 * @param numGrupo
	 *            Número de grupo cuyos alumnos se van a listar.
	 */
	public void muestraAlumnosGrupo(int numGrupo) {
		System.out.println("Exp.\tApellidos\tNombres\tGrupo");
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumGrupo() == numGrupo) {

				System.out.println(alumnos[i].toString());
			}
		}
		System.out.println();
	}

	/**
	 * Devuelve la posición en el array grupos[] del grupo cuyo número se pasa
	 * como parámetro.
	 * 
	 * @param numGrupo
	 *            Número del grupo a buscar.
	 * @return Posición en el array grupos[] del grupo buscado, o -1 si no se
	 *         encuentra.
	 */
	public int buscaGrupo(int numGrupo) {
		for (int i = 0; i < alumnos.length; i++) {
			if (grupos[i] != null && grupos[i].getNumGrupo() == numGrupo) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * Devuelve el array alumnos[].
	 * 
	 * @return Array alumnos[].
	 */
	public Alumno[] getAlumnos() {
		return alumnos;
	}

}
