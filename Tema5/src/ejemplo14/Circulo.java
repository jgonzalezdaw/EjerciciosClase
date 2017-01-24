package ejemplo14;

public class Circulo {

	// Atributos
	private int x, y; // Coordenadas del centro.
	private String color;
	private int radio;
	
	// Constructores
	Circulo(){
		
	}
	
	Circulo(int x, int y, String color, int radio){
		this.x = x;
		this.y = y;
		this.color = color;
		this.radio = radio;
	}
	
	Circulo(int x, int y){
		// Damos valores por defecto al radio y al color
		this(x,y,"negro",100);
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
	
	// Métodos de acceso
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	

}

















