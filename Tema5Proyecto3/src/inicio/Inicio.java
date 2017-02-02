package inicio;

import biblioteca.Autor;

public class Inicio {

	public static void main(String[] args) {
		Autor autor = new Autor("Pérez Reverte","preverte@gmail.com",1955);
		System.out.println(autor.toString());
	}

}
