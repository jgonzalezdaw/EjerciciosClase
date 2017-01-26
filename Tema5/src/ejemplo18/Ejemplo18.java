package ejemplo18;

/**
 * En este ejemplo hacemos que un constructor llame a otro.
 * 
 * @author csogorb
 *
 */
public class Ejemplo18 {

	public static void main(String[] args) {

		Persona p1;
		p1 = new Persona("82911922H", "Jose Antonio", "Coca", 21);
		Persona.totalPersonas();

		System.out.println("Nombre completo: " + p1.getNombre() + " " + p1.getApellidos());

		if (p1.getEdad() >= 18) {
			System.out.println("Puede entrar a la discoteca.");
		} else {
			System.out.println("No puede entrar a la discoteca.");
		}

		Persona p2 = new Persona();
		Persona.totalPersonas();
		p2.setDni("3782363H");
		// p2.nombre = "Gustavo";
		p2.setNombre("Gustavo");
		p2.setApellidos("Baquerizo");
		p2.setEdad(21);

		System.out.println(
				"Me llamo " + p2.getNombre() + " " + p2.getApellidos() + " y tengo " + p2.getEdad() + " años.");

		// Utilizamos el método mostrar()
		System.out.println("\nDatos de p1:\n");
		p1.mostrar();

		System.out.println("Creamos una tercera persona");
		Persona p3 = new Persona("Carlos", "Sogorb");
		Persona.totalPersonas();
		p3.mostrar();

	}

}
