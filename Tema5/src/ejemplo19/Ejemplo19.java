package ejemplo19;

/**
 * En este ejemplo hacemos que un constructor llame a otro.
 * 
 * @author csogorb
 *
 */
public class Ejemplo19 {

	public static void main(String[] args) {

		Punto p1 = new Punto();
		Punto.totalPuntos();
		p1.setX(10);
		p1.setY(20);
		p1.setColor("rojo");
		p1.mostrar();

		Punto p2 = new Punto(5, 15, "verde");
		Punto.totalPuntos();

		p2.mostrar();

		Punto p3 = new Punto(10, 10);
		Punto.totalPuntos();
		p3.mostrar();

	}

}
