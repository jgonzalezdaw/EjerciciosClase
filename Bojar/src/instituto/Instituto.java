package instituto;

import auxiliar.Alumno;
import auxiliar.Grupo;

/**
 * La clase Instituto representa los datos de un Instituto con sus alumnos y
 * grupos, así como las operaciones con ambos.
 * 
 * @author Patryk Bojar
 *
 */
public class Instituto {

	// Atributos

	private final int MAX_ALUMNOS = 30;
	private final int MAX_GRUPOS = 20;
	private Alumno alumnos[] = new Alumno[MAX_ALUMNOS];
	private Grupo grupos[] = new Grupo[MAX_GRUPOS];

	// Constructores

	/**
	 * Añade el alumno que se le pasa como parámetro al array alumnos[].
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

		// Comprobamos que el grupo exista.
		boolean grupoExiste = false;
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null && grupos[i].getNumGrupo() 
					== alu.getNumGrupo()) {
				grupoExiste = true;
				break;
			}
		}
		if (!grupoExiste) {
			System.out.println("No existe el grupo. Operación cancelada.");
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
	 * Añade un grupo que hayamos pasado como parámetro
	 * 
	 * @param grup
	 *            Datos del grupo, número, curso, año, letra.
	 */
	public void addGrupo(Grupo grup) {
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] == null) {
				grupos[i] = grup;
				break;
			}
		}
	}

	/**
	 * Elimina un alumno que hayamos pasado como parámetro.
	 * 
	 * @param numExp
	 *            Número del grupo.
	 */
	public void delAlumno(int numExp) {

		int posicion = buscaAlumno(numExp);
		if (posicion != -1) {
			alumnos[posicion] = null;
		}

	}

	/**
	 * Elimina un grupo que hayamos pasado como parámetro. Si hay alumnos en el
	 * grupo especificado, el grupo no será borrado.
	 * 
	 * @param numGrupo
	 *            Número del grupo.
	 */
	public void delGrupo(int numGrupo) {

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumGrupo() == numGrupo) {
				System.out.println("No se puede eliminar el grupo. Hay alumnos matriculados en él");
				return;
			}
		}
		int posicion = buscaGrupo(numGrupo);
		if (posicion != -1) {
			grupos[posicion] = null;
		}
	}

	/**
	 * Muestra todos los datos de los alumnos existenes.
	 */
	public void muestraAlumnos() {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(alumnos[i].toString());
			}
		}
	}

	/**
	 * Muestra todos los datos de los grupos existentes.
	 */
	public void muestraGrupos() {
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null) {
				System.out.println(grupos[i].toString());
			}
		}
	}

	/**
	 * Muestra todos los alumnos ordenados por un grupo específico.
	 * 
	 * @param numGrupo
	 *            Número del grupo.
	 */
	public void muestraAlumnosGrupo(int numGrupo) {
		System.out.println("NºExp\tApellidos\tNombre\tNºGrupo");
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumGrupo() == numGrupo) {
				System.out.println(alumnos[i].toString());
			}
		}
	}

	/**
	 * Devuelve el número de los alumnos existentes en el instituto.
	 * 
	 * @return Número de alumnos del instituto.
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
	 * Devuelve el número de los grupos existenes en el instituto.
	 * 
	 * @return Número de grupos del instituto.
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
	 * Busca si un alumno está matriculado en el instituto y devuelve su
	 * posición en el array alumno[].
	 * 
	 * @param numExp
	 *            Número de expediente del alumno.
	 * @return Posición en el array del alumno que hemos recibido como
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
	 * Busca si un grupos está en el instituto y devuelve su posición en el
	 * array grupos.
	 * 
	 * @param numGrupo
	 *            Número del grupo.
	 * @return Posición en el array de grupos que hemos recibido como parámetro,
	 *         o -1 si no se encuentra.
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
	 * Devuelve todos los alumnos con todos sus datos del array alumnos que
	 * están matriculados en el instituto
	 * 
	 * @return Todos los alumnos con todos sus datos
	 */
	public Alumno[] getAlumnos() {
		return alumnos;
	}

}