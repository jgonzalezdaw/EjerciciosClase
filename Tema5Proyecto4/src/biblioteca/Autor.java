package biblioteca;

public class Autor {

	// Atributos

	private String nombre;
	private String email;
	private int fechaNacimiento;

	// Constructores

	public Autor(String nombre, String email, int fechaNacimiento) {
		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Autor(String nombre) {
		this.nombre = nombre;
		this.email = "unknown";
		this.fechaNacimiento = 0;
	}

	// Métodos de entrada

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	// Métodos

	public String toString() {
		return "El nombre del autor es " + nombre + " con email " + email + " y con fecha de nacimiento "
				+ fechaNacimiento;
	}

}
