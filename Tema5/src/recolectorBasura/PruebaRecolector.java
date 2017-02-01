package recolectorBasura;

public class PruebaRecolector {

	public static void main(String[] args) {

		Persona[] personas = new Persona[1000000];

		System.out.println("***Creando objetos...");
		// Rellenamos el array con objetos Persona.
		for (int i = 0; i < personas.length; i++) {
			personas[i] = new Persona("7625372Y", "Luis", "López", 40);
		}

		System.out.println("***Liberando objetos...");
		// Liberamos los objetos
		for (int i = 0; i < personas.length; i++) {
			personas[i] = null;
		}

		System.out.println("***Creando objetos...");
		// Rellenamos el array con objetos Persona.
		for (int i = 0; i < personas.length; i++) {
			personas[i] = new Persona("7625372Y", "Luis", "López", 40);
		}

		System.out.println("***Liberando objetos...");
		// Liberamos los objetos
		for (int i = 0; i < personas.length; i++) {
			personas[i] = null;
		}

	}

}
