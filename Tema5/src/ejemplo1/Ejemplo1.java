package ejemplo1;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		Persona p1;
		p1 = new Persona();

		p1.dni = "82911922H";
		p1.nombre = "Jose Antonio";
		p1.apellidos = "Coca";
		p1.edad = 21;

		System.out.println("Nombre completo: " 
				+ p1.nombre + " " + p1.apellidos);

		if (p1.edad >= 18) {
			System.out.println("Puede entrar a la discoteca.");
		} else {
			System.out.println("No puede entrar a la discoteca.");
		}
		
		Persona p2 = new Persona();
		p2.dni = "3782363H";
		p2.nombre = "Gustavo";
		p2.apellidos = "Baquerizo";
		p2.edad = 21;
		
		System.out.println("Me llamo " + p2.nombre + " " 
				+ p2.apellidos + " y tengo " + p2.edad + " años.");
		
		// Utilizamos el método mostrar()
		System.out.println("\nDatos de p1:\n");
		p1.mostrar();

	}

}













