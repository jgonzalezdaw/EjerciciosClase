
package inicio;

import java.util.Scanner;

public class Inicio {
	
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		menuPrincipal();
	}

	public static void menuPrincipal() {
		System.out.println("Menú Principal");
		System.out.println("==============");
		System.out.println("1. Resumen");
		System.out.println("2. Alumnos");
		System.out.println("3. Grupos");
		System.out.println("4. Salir");
		
		int opcion = entrada.nextInt();
		switch(opcion){
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
			System.exit(0);
		default:
			System.out.println("Error de entrada.");
		}
		
	}

	public static void menuAlumnos() {
		System.out.println("\nMenú Alumnos");
		System.out.println("============");
		System.out.println("1. Listar alumnos");
		System.out.println("2. Añadir");
		System.out.println("3. Eliminar");
		System.out.println("4. Buscar");
		System.out.println("5. Atrás");
	}

	public static void menuGrupos() {
		System.out.println("\nMenú Grupos");
		System.out.println("============");
		System.out.println("1. Listar grupos");
		System.out.println("2. Mostrar alumnos por grupo");
		System.out.println("3. Añadir");
		System.out.println("4. Eliminar");
		System.out.println("5. Atrás");
	}

}













