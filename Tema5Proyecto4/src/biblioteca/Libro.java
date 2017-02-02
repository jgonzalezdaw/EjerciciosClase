package biblioteca;

public class Libro {

	// Atributos

	private String titulo;
	private String isbn;
	private Autor[] autores;
	private static int anyoActual;

	// Constructores

	public Libro(String titulo) {
		this.titulo = titulo;
	}

	public Libro(String titulo, String isbn, Autor[] autores) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;
	}

	// Métodos de entrada

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor[] getAutores() {
		return autores;
	}

	public void setAutores(Autor[] autores) {
		this.autores = autores;
	}

	public int getAnyoActual() {
		return anyoActual;
	}

	public void setAnyoActual(int anyoActual) {
		this.anyoActual = anyoActual;
	}

	// Métodos

	public String toString() {
		if (autores.length > 1) {
			return "El título del libro es " + titulo + ", el ISBN es " + isbn + ", escrito por varios autores "
					+ ", con año " + anyoActual;
		} else {
			return "El título del libro es " + titulo + " el ISBN es " + isbn + " el autor es " + autores[0].getNombre()
					+ " con año " + anyoActual;
		}
	}

	public String muestraAutores() {

		String lista = "";

		for (int i = 0; i < autores.length; i++) {
			lista = lista + "- " + autores[i].getNombre() + "\n";
		}
		
		return lista;
	}

}














