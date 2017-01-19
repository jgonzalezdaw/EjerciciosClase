package ejemplo5;

/**
 * En este ejemplo, agregamos constructores a la clase Punto
 * 
 * @author csogorb
 * 
 */
public class Ejemplo5 {

	public static void main(String[] args) {

		Punto p1 = new Punto();
		p1.x = 10;
		p1.y = 20;
		p1.color = "rojo";

		Punto p2 = new Punto(5, 15, "verde");

		p1.mostrar();
		p2.mostrar();

	}

}








