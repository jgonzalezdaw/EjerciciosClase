package inicio;

import auxiliar.Grupo;
import auxiliar.Alumno;
import instituto.Instituto;
import java.util.Scanner;

public class Inicio {

	private static Scanner entrada = new Scanner(System.in);
	private static Instituto instituto = new Instituto();

	private static int continuar = 0;

	// MAIN //
	public static void main(String[] args) {
		
		Grupo g1 = new Grupo("ESO",1,"A");
		Grupo g2 = new Grupo("ESO",1,"B");
		instituto.addGrupo(g1);
		instituto.addGrupo(g2);
		
		while (true) {
			mainMenu();
		}
	}

	// MENU PRINCIPAL //
	public static void mainMenu() {
		instituto.clearScreen();
		System.out.println("Panel de control:" + "\n1. Ver lista completa de alumnos y grupos"
				+ "\n2. Gestionar alumnos" + "\n3. Gestionar grupos" + "\n4. Salir");
		int seleccion = entrada.nextInt();
		switch (seleccion) {
		case 1:
			subMenuMostrar();
			break;
		case 2:
			subMenuAlumno();
			break;
		case 3:
			subMenuGrupo();
			break;
		case 4:
			subExit();
			break;
		default:
			mainMenu();
			break;
		}
	}

	// SUB MENU MOSTRAR //
	public static void subMenuMostrar() {
		instituto.clearScreen();
		System.out.println("Resumen:");
		System.out.println("Alumnos: " + instituto.numAlumnos());
		System.out.println("Grupos: " + instituto.numGrupos());
		System.out.println("\nPulse 1 para volver atrás");
		continuar = entrada.nextInt();
		switch (continuar) {
		case 1:
			mainMenu();
			break;
		}
	}

	// SUB MENU ALUMNO //
	public static void subMenuAlumno() {
		instituto.clearScreen();
		Alumno a1 = new Alumno();
		System.out.println("Gestionar alumnos:" + "\n1. Ver alumnos" + "\n2. Añadir alumno" + "\n3. Eliminar alumno"
				+ "\n4. Buscar alumno" + "\n5. Atrás...");
		continuar = entrada.nextInt();
		switch (continuar) {
		case 1:// OK //
			instituto.clearScreen();
			instituto.muestraAlumnos();
			System.out.println("\nPulse 1 para volver atrás");
			continuar = entrada.nextInt();
			switch (continuar) {
			case 1:
				subMenuAlumno();
				break;
			}
			break;
		case 2:// OK //
			instituto.clearScreen();
			a1.leeDatosA();
			instituto.addAlumno(a1);
			subMenuAlumno();
			break;
		case 3:// OK //
			instituto.clearScreen();
			System.out.println("Número de expediente: ");
			instituto.delAlumno(entrada.nextInt());
			subMenuAlumno();
			break;
		case 4:// OK //
			instituto.clearScreen();
			System.out.println("Número de expediente: ");
			System.out.println(instituto.buscAlumno(entrada.nextInt()));
			System.out.println("\nPulse 1 para volver atrás");
			continuar = entrada.nextInt();
			switch (continuar) {
			case 1:
				subMenuAlumno();
				break;
			}
			break;
		case 5:// OK //
			mainMenu();
			break;
		}
	}

	// SUB MENU GRUPO //
	public static void subMenuGrupo() {
		instituto.clearScreen();
		Grupo g1 = new Grupo();
		System.out.println("Gestionar grupos:" + "\n1. Ver grupos" + "\n2. Ver alumnos de cada grupo"
				+ "\n3. Añadir grupo" + "\n4. Eliminar grupo" + "\n5. Atrás...");
		continuar = entrada.nextInt();
		switch (continuar) {
		case 1:// OK //
			instituto.clearScreen();
			instituto.muestraGrupos();
			System.out.println("\nPulse 1 para volver atrás");
			continuar = entrada.nextInt();
			switch (continuar) {
			case 1:
				subMenuGrupo();
				break;
			}
			break;

		case 2: // REVISAR //
			instituto.clearScreen();
			instituto.muestraGrupAlum();
			System.out.println("\nPulse 1 para volver atrás");
			continuar = entrada.nextInt();
			switch (continuar) {
			case 1:
				subMenuGrupo();
				break;
			}
			break;
		case 3:// OK //
			instituto.clearScreen();
			g1.leeDatosG();
			instituto.addGrupo(g1);
			subMenuGrupo();
			break;
		case 4:// OK //
			instituto.clearScreen();
			instituto.delGrupo(entrada.nextInt());
			subMenuGrupo();
			break;
		case 5:// OK //
			mainMenu();
			break;
		}
	}

	// EXIT //
	public static void subExit() {
		instituto.clearScreen();
		System.out.println("Cerrando aplicación...");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Limpiando residuos de memoria...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Limpiando consola...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10000; ++i) {
			System.out.println();
		}
		System.exit(0);
	}

}