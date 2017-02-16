package instituto;

import java.util.Scanner;
import auxiliar.Alumno;
import auxiliar.Grupo;

public class Instituto {
	private static Scanner entrada = new Scanner(System.in);
	// Atributos //

	private final int MAX_ALUMNOS = 2;
	private final int MAX_GRUPOS = 2;
	private Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
	private Grupo grupos[] = new Grupo[MAX_GRUPOS];

	// MÉTODOS ALUMNOS //

	public void addAlumno(Alumno alu) { // AÑADIR ALUMNO //

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alu;
				break;
			}
		}

	}

	public void delAlumno(int numExp) { // ELIMINAR ALUMNO //

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExp) {

				System.out.println("Desea eliminar el Alumno: " + "\nE \tApellidos \tNombre \tG\n"
						+ alumnos[i].toStringA() + "\n(si / no)?");
				String respuesta = entrada.nextLine();
				if (respuesta.equals("si")) {
					alumnos[i] = null;
				} // else {break;}
				break;
			}
		}
	}

	public void muestraAlumnos() { // MOSTRAR ALUMNOS //
		System.out.print("E \tApellidos \tNombre \tG\n");
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(alumnos[i].toStringA());
			} else {
				continue;
			}
		}
	}

	public int numAlumnos() { // NUMERO DE ALUMNOS //
		int count = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				count++;
			} else {
				continue;
			}
		}
		return count;
	}

	public int buscAlumno(int numExp) {
		int pos = -1; // BUSCAR ALUMNO
		System.out.print("E \tApellidos \tNombre \tG \tP\n");
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExp) {
				pos = i;
				System.out.print(alumnos[pos].toStringA() + "\t");
			}
		}
		return pos;
	}

	// METODOS GRUPOS //
	public int numGrupos() {
		int suma = 0;
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null) {
				suma++;
			}
		}
		return suma;
	}

	public void addGrupo(Grupo gru) { // AÑADIR GRUPO //

		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] == null) {
				grupos[i] = gru;
				break;
			}
		}
	}

	public void muestraGrupos() { // MOSTRAR GRUPOS //
		System.out.print("G \tNivel \tCurso \tClase\n");
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null) {
				System.out.println(grupos[i].toStringG());
			} else {
				continue;
			}
		}
	}

	public void muestraGrupAlum() { // MOSTRAR GRUPOS Y SUS ALUMNOS //
		for (int i = 0; i < grupos.length; i++) {
			//System.out.println("i=" + i);
			if (grupos[i] != null) {
				System.out.print("\n\n\nG \tNivel \tCurso \tClase\n");
				System.out.println(grupos[i].toStringG());
				System.out.print("\n\tE \tApellidos \tNombre \tG\n");
				//System.out.println("Antes del for j, alumnos tiene " + alumnos.length);
				for (int j = 0; j < alumnos.length; j++) {
					//System.out.println("j=" + j);
					if (alumnos[j] != null && alumnos[j].getNumGrupo() == i) {
						System.out.println("\t" + alumnos[j].toStringA());
					} else {
						continue;
					}
				}
			} else {
				continue;
			}
		}
	}

	public void delGrupo(int numGrupo) { // ELIMINAR GRUPO //

		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null && grupos[i].getNumGrupo() == numGrupo) {
				System.out.println("Desea eliminar el Grupo: " + "\nG \tNivel \tCurso \tClase\n" + grupos[i].toStringG()
						+ "\n(si / no)?");
				String respuesta = entrada.nextLine();
				if (respuesta.equals("si")) {
					grupos[i] = null;
				} // else {break;}
				break;
			}
		}
	}

	// Limpiar pantalla //
	public void clearScreen() {
		for (int i = 0; i < 1000; ++i) {
			System.out.println();
		}
	}
}
