package inicio;

import java.util.Scanner;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

/**
 * Clase Inicio, nos permite mostrar todos los datos y métodos hechos en otras
 * clases.
 * 
 * @author Patryk
 *
 */
// Opciones de mejora:
// -- No dejar borrar un grupo si hay alumnos en ese grupo
// - No dejar matricular un alumno si no existe ese número de grupo
// - No dejar añadir un alumno con el mismo exepdiente

public class Inicio {

	private static Scanner entrada = new Scanner(System.in);
	private static Instituto instituto = new Instituto();

	public static void main(String[] args) {
		fakeData();
		while (true) {
			menuPrincipal();
		}
	}

	private static void fakeData() {

		instituto.addGrupo(new Grupo(1, "ESO", 1, "A"));
		instituto.addGrupo(new Grupo(2, "ESO", 1, "B"));
		instituto.addGrupo(new Grupo(3, "ESO", 1, "D"));

		instituto.addAlumno(new Alumno(101, "Pérez", "Ramón", 1));
		instituto.addAlumno(new Alumno(102, "Bojar", "Patryk", 1));
		instituto.addAlumno(new Alumno(103, "Baquerizo", "Gustavo", 2));
		instituto.addAlumno(new Alumno(104, "Beraldo", "Matías", 2));

	}
	// Menú principal con sus respectivas opciones.

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
	// Menú de alumnos con sus respectivas opciones.

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
			System.out.println("Alumnos:");
			instituto.muestraAlumnos();
			break;

		case 2:
			Alumno a1 = new Alumno();
			a1.leeDatos();
			instituto.addAlumno(a1);
			break;

		case 3:
			System.out.println("Indica el número de expediente del alumno que desea borrar.");
			numExp = entrada.nextInt();
			instituto.delAlumno(numExp);
			break;

		case 4:
			System.out.println("Indica el número de expediente del alumno que desea buscar.");
			numExp = entrada.nextInt();

			int posicion = instituto.buscaAlumno(numExp);
			System.out.println("Datos del alumno:");
			System.out.println(instituto.getAlumnos()[posicion].toString());
			break;
		}
	}

	// Menú de grupos con sus respectivas opciones.
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
			System.out.println("Grupos:");
			instituto.muestraGrupos();
			break;
		case 2:
			System.out.print("Grupo a consultar: ");
			int numGrupo = entrada.nextInt();
			instituto.muestraAlumnosGrupo(numGrupo);
			break;
		case 3:
			Grupo g1 = new Grupo();
			g1.leeDatos();
			instituto.addGrupo(g1);
			break;
		case 4:
			System.out.print("Grupo a elimianar: ");
			numGrupo = entrada.nextInt();
			instituto.delGrupo(numGrupo);
		}
	}

	// Muestra el número de alumnos y el número de grupos.
	public static void menuPrincipalResumen() {
		System.out.println("\nResumen del Instituto");
		System.out.println("======================");
		System.out.println("Alumnos: " + instituto.numAlumnos());
		System.out.println("Grupos: " + instituto.numGrupos());
	}

}