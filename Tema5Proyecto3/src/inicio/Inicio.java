package inicio;

import biblioteca.*;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		// Autor
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Nombre del autor");
		String autor = entrada.nextLine();
		
		System.out.println("Email del autor");
		String email = entrada.nextLine();
		
		System.out.println("Año de nacimiento del autor");
		int anyoAutor = entrada.nextInt();
		
		Autor a1 = new Autor (autor, email, anyoAutor);
		
		entrada.nextLine();
		
		// Libro
		
		System.out.println("Título del libro");
		String titulo = entrada.nextLine();
		
		System.out.println("ISBN del libro");
		String isbn = entrada.nextLine();
		
		System.out.println("Introduce el año actual");
		int anyoLibro = entrada.nextInt();
		
		Libro l1 = new Libro(titulo, isbn,a1 );
		l1.setAnyoActual(anyoLibro);
		
		System.out.println(a1.toString());
		System.out.println(l1.toString());
	}

}
