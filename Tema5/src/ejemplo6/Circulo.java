package ejemplo6;

public class Circulo {

	// Atributos
	int x, y; // Coordenadas del centro.
	String color;
	int radio;
	
	// Constructores
	Circulo(){
		
	}
	
	Circulo(int x, int y, String color, int radio){
		this.x = x;
		this.y = y;
		this.color = color;
		this.radio = radio;
	}

	// Métodos
	void mostrar() {
		System.out.println("Coordenadas: (" + x + "," + y + ")");
		System.out.println("Radio: " + radio);
		System.out.println("Color: " + color);
	}

	double area() {
		return Math.PI * radio * radio;
	}

	double perimetro() {
		return 2 * Math.PI * radio;
	}

}
