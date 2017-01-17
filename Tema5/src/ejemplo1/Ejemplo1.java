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
		
		

	}

}
