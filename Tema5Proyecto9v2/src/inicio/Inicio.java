
package inicio;

import java.util.Scanner;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	private static Scanner entrada = new Scanner(System.in);
	private static Instituto instituto = new Instituto();

	public static void main(String[] args) {
		fakeData();

		while (true) {
			menuPrincipal();
		}
	}

	/**
	 * Inicializamos el instituto con algunos datos de alumnos y grupos por
	 * comodidad.
	 */
	private static void fakeData() {
		instituto.addGrupo(new Grupo(1, "ESO", 1, "A"));
		instituto.addGrupo(new Grupo(2, "ESO", 1, "B"));
		instituto.addGrupo(new Grupo(3, "ESO", 1, "C"));

		instituto.addAlumno(new Alumno(101, "Pérez", "Ramón", 1));
		instituto.addAlumno(new Alumno(102, "Morillas", "Javier", 1));
		instituto.addAlumno(new Alumno(103, "García", "Rommel", 2));
		instituto.addAlumno(new Alumno(104, "Gallego", "Eneko", 2));
	}

	/**
	 * Muestra el menú principal y ejecuta la acción elegida por el usuario.
	 */
	public static void menuPrincipal() {
		System.out.println("Menú Principal");
		System.out.println("==============");
		System.out.println("1. Resumen");
		System.out.println("2. Alumnos");
		System.out.println("3. Grupos");
		System.out.println("4. Salir");

		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			menuPrincipalResumen();
			break;
		case 2:
			menuAlumnos();
			break;
		case 3:
			menuGrupos();
			break;
		case 4:
			System.out.println("Saliendo del programa.");
			System.exit(0);
		default:
			System.out.println("Error de entrada.\n");
		}

	}

	/**
	 * Muestra el menú Alumnos y ejecuta la acción elegida por el usuario.
	 */
	public static void menuAlumnos() {

		int numExp;

		System.out.println("\nMenú Alumnos");
		System.out.println("============");
		System.out.println("1. Listar alumnos");
		System.out.println("2. Añadir");
		System.out.println("3. Eliminar");
		System.out.println("4. Buscar");
		System.out.println("5. Atrás");

		int opcion = entrada.nextInt();
		switch (opcion) {

		case 1:
			// Listar los alumnos matriculados en el instituto.
			System.out.println("Alumnos:");
			instituto.muestraAlumnos();
			break;

		case 2:
			// Añadir un nuevo alumno.
			Alumno a1 = new Alumno();
			a1.leeDatos();
			instituto.addAlumno(a1);
			break;

		case 3:
			// Eliminar un alumno.
			System.out.println("Indica el número de expediente del alumno que desea borrar.");
			numExp = entrada.nextInt();
			instituto.delAlumno(numExp);
			break;

		case 4:
			// Buscar un alumno.
			System.out.println("Indica el número de expediente del alumno que desea buscar.");
			numExp = entrada.nextInt();

			int posicion = instituto.buscaAlumno(numExp);
			System.out.println("Datos del alumno:");
			System.out.println(instituto.getAlumnos()[posicion].toString());

			break;

		case 5:
			// Volver al menú principal.
			menuPrincipal();
		}
	}

	/**
	 * Muestra el menú Grupos y ejecuta la acción elegida por el usuario.
	 */
	public static void menuGrupos() {
		System.out.println("\nMenú Grupos");
		System.out.println("============");
		System.out.println("1. Listar grupos");
		System.out.println("2. Mostrar alumnos por grupo");
		System.out.println("3. Añadir");
		System.out.println("4. Eliminar");
		System.out.println("5. Atrás");

		int opcion = entrada.nextInt();
		switch (opcion) {

		case 1:
			// Listar los grupos del instituto.
			System.out.println("Grupos:");
			instituto.muestraGrupos();
			break;

		case 2:
			// Mostrar alumnos por grupo.
			System.out.println("¿Grupo a consultar?");
			int numGrupo = entrada.nextInt();
			instituto.muestraAlumnosGrupo(numGrupo);
			break;

		case 3:
			// Añadir un grupo.
			Grupo g1 = new Grupo();
			g1.leeDatos();
			instituto.addGrupo(g1);
			break;

		case 4:
			// Eliminar un grupo.
			System.out.println("¿Grupo a eliminar?");
			numGrupo = entrada.nextInt();
			instituto.delGrupo(numGrupo);
		}
	}

	/**
	 * Muestra el número de alumnos y el número de grupos.
	 */
	public static void menuPrincipalResumen() {
		System.out.println("\nResumen del Instituto");
		System.out.println("======================");
		System.out.println("Alumnos: " + instituto.numAlumnos());
		System.out.println("Grupos: " + instituto.numGrupos());
		System.out.println();
	}

}
