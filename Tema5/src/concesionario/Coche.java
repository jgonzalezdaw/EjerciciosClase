package concesionario;

public class Coche {

	// Atributos
	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private int precio;
	static int descuento;

	Coche(String marca, String modelo, String color, String matricula, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
		this.precio = precio;
	}

	// Metodos
	void mostrar() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Color: " + color);
		System.out.println("Matricula: " + matricula);
		System.out.println("Precio: " + precio + "€");
		System.out.println("Descuento: " + descuento + "%");
	}

	void arrancar() {
		System.out.println("Arrancando...");
	}

	void detenerse() {
		System.out.println("Deteniendo...");
	}

	void acelerar() {
		System.out.println("Acelerando...");
	}

	void frenar() {
		System.out.println("Frenando...");
	}

	double verPrecio() {
		int descontado = 
				precio / 100 * descuento;
		return precio-descontado;
	}

	// Metodos para mostrar
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
