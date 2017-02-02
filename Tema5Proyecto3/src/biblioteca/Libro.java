package biblioteca;

public class Libro {

	// Atributos
	
	private String titulo;
	private String isbn;
	private Autor autor;
	static private int anyoActual;
	
	// Constructores
	
	public Libro (String titulo){
		this.titulo = titulo;
	}
	
	public Libro (String titulo, String isbn,Autor autor){
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
	}
	
	
	// Métodos de entrada
	
	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getAnyoActual() {
		return anyoActual;
	}

	public void setAnyoActual(int anyoActual) {
		this.anyoActual = anyoActual;
	}
	
	// Métodos
	
	public String toString(){
		return "El título del libro es " + titulo + " el ISBN es " + isbn + " el autor es " + autor.getNombre() +
				" con anyo " + anyoActual;
	}
	
}
