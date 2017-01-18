package ejemplo1;

public class Persona {
	
	// Atributos
	String dni;
	String nombre;
	String apellidos;
	int edad;
	
	// Constructores
	Persona(String dni, String nombre, String apellidos, int edad){
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		
	}
	
	// Métodos
	void mostrar(){
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
	}
		
}
