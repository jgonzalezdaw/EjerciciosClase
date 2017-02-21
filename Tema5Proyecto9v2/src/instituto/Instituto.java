package instituto;

import auxiliar.Alumno;
import auxiliar.Grupo;

public class Instituto {

	// Atributos

	private final int MAX_ALUMNOS = 30;
	private final int MAX_GRUPOS = 20;
	private Alumno alumnos[] = new Alumno[MAX_ALUMNOS];
	private Grupo grupos[] = new Grupo[MAX_GRUPOS];

	// Constructores

	// Método
	public void addAlumno(Alumno alu) {
		
		// Comprobamos que no haya un alumno con ese número de expediente.
		for(int i=0; i<alumnos.length; i++){
			if(alumnos[i] != null && 
					alumnos[i].getNumExpediente() == alu.getNumExpediente()){
				System.out.println("Número de expediente repetido.");
				return;
			}
		}
		
		// Comprobamos que el grupo exista.
		for (int i = 0; i < grupos.length; i++) {
			if(grupos[i] != null && grupos[i].getNumGrupo() == alu.getNumGrupo()){
				System.out.println("No existe el grupo. Operación cancelada.");
				return;
			}
		}

		// Añadimos al alumno.
		for (int i = 0; i < alumnos.length; i++) {

			if (alumnos[i] == null) {
				alumnos[i] = alu;
				break;
			}

		}

	}

	public void delAlumno(int numExp) {

		int posicion = buscaAlumno(numExp);
		if (posicion != -1) {
			alumnos[posicion] = null;
		}

	}

	public void muestraAlumnos() {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(alumnos[i].toString());
			}
		}
	}

	public int numAlumnos() {
		int suma = 0;

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				suma++;
			}
		}
		return suma;
	}

	public int numGrupos() {
		int suma = 0;
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null) {
				suma++;
			}
		}
		return suma;
	}

	public int buscaAlumno(int numExp) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExp) {
				return i;
			}
		}

		return -1;
	}

	public void muestraGrupos() {
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null) {
				System.out.println(grupos[i].toString());
			}
		}
	}

	public void muestraAlumnosGrupo(int numGrupo) {
		System.out.println("Exp.\tApellidos\tNombres\tGrupo");
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumGrupo() == numGrupo) {

				System.out.println(alumnos[i].toString());
			}
		}
		System.out.println();
	}

	public void addGrupo(Grupo grup) {
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] == null) {
				grupos[i] = grup;
				break;
			}
		}
	}

	public void delGrupo(int numGrupo) {
		
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] != null && alumnos[i].getNumGrupo() == numGrupo){
				System.out.println("No se puede eliminar el grupo. Hay alumnos matriculados.");
				return;
			}
		}
		
		int posicion = buscaGrupo(numGrupo);
		if (posicion != -1) {
			grupos[posicion] = null;
		}
	}

	public int buscaGrupo(int numGrupo) {
		for (int i = 0; i < alumnos.length; i++) {
			if (grupos[i] != null && grupos[i].getNumGrupo() == numGrupo) {
				return i;
			}
		}

		return -1;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

}