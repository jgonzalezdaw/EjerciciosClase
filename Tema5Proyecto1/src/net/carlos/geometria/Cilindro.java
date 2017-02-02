package net.carlos.geometria;

public class Cilindro {

	private int altura;
	private int radio;
	private final static double PI = 3.141592;

	// Contructores
	public Cilindro() {

	}

	public Cilindro(int altura, int radio) {
		this.altura = altura;
		this.radio = radio;
	}

	// Métodos de acceso
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	// Métodos
	public double getArea() {
		double area;
		area = 2 * PI * radio * (altura + radio);
		return area;
	}

	public double getVolumen() {
		double volumen;
		volumen = PI * radio * radio * altura;
		return volumen;
	}

	public String toString() {
		return "La altura del cilindro es " + altura + " y el radio es " + radio;
	}

}
