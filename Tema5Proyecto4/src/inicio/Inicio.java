package inicio;

import biblioteca.*;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// Un libro escrito por dos autores.
		Autor[] autores = new Autor[2];
		autores[0] = new Autor("Laura Lemay","lemay@gmail.com",1975);
		autores[1] = new Autor("Rogers Cadenhead","cadenhead@yahoo.com", 1970);
		
		Libro libro = new Libro("Java 6", "84287862", autores);
		libro.setAnyoActual(2017);
		
		System.out.println("Datos del libro:");
		System.out.println(libro.toString()); 
		
		// Un libro escrito por un autor solamente.
		Autor[] autores2 = new Autor[1];
		autores2[0] = new Autor("Robert Louis Stevenson",
				"stevenson@gmail.com",1800);
		
		Libro libro2 = new Libro(
				"El extraño caso del Doctor Jeckyll y Mr. Hide",
				"84099283",autores2);
		System.out.println("Datos del segundo libro:");
		System.out.println(libro2.toString());
		
		// Lista de autores de los libros
		System.out.println("\nAutores del primer libro:");
		System.out.println(libro.muestraAutores());
		System.out.println("\nAutores del segundo libro:");
		System.out.println(libro2.muestraAutores());
	}

}
























