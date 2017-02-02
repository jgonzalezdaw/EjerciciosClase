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
		
	}

}
