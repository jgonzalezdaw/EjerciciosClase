package ejercicios;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		System.out.println("Tu nombre es " + obtenerNombre() + ".");
		
	}
	
	static String obtenerNombre(){
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nombre?");
		String nombre = entrada.nextLine();
		
		return nombre;
	}
	
}
