package ejemplo17;

/**
 * En este ejemplo hacemos que un constructor llame a otro.
 * 
 * @author csogorb
 *
 */
public class Ejemplo17 {

	public static void main(String[] args) {

		Punto p1 = new Punto();
		System.out.println("\n***Hasta ahora hay " + Punto.contadorPuntos + " objetos Punto creados.");
		p1.setX(10);
		p1.setY(20);
		p1.setColor("rojo");
		p1.mostrar();

		Punto p2 = new Punto(5, 15, "verde");
		System.out.println("\n***Hasta ahora hay " + Punto.contadorPuntos + " objetos Punto creados.");

		p2.mostrar();

		Punto p3 = new Punto(10, 10);
		System.out.println("\n***Hasta ahora hay " + Punto.contadorPuntos + " objetos Punto creados.");
		p3.mostrar();

	}

}
