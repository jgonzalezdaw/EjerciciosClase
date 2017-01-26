package ejemplo18;

public class Persona {

	// Atributos
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	
	// Atributo que contará cuántos objetos de la clase  
	// Persona se han creado.
	static int contadorPersonas; 

	// Constructores
	Persona(String dni, String nombre, String apellidos, int edad) {
		System.out.println("Se ha llamado al constructor " + "Persona(dni, nombre, apellidos, edad)");
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		
		contadorPersonas++;
	}

	Persona() {
		System.out.println("Se ha llamado al constructor Persona()");
		contadorPersonas++;
	}

	Persona(String nombre, String apellidos) {
		this("00000000A", nombre, apellidos, 30);
	}

	// Métodos
	void mostrar() {
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
	}
	
	static void totalPersonas(){
		System.out.println("*** Hay " + contadorPersonas + 
				" objetos Persona creados.");
	}

	// Métodos de acceso.
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}





