package ejemplo11;

/**
 * En este ejemplo, agregamos constructores a la clase Rectangulo
 * 
 * @author csogorb
 * 
 */
public class Ejemplo11 {

	public static void main(String[] args) {
		Rectangulo rect1 = new Rectangulo();
		rect1.mostrar();

		System.out.println();

		Rectangulo rect2 = new Rectangulo(5, 5, 20, 10, "verde");
		rect2.mostrar();

		System.out.println();

		Rectangulo rect3 = new Rectangulo("verde");
		rect3.mostrar();
	}

}
