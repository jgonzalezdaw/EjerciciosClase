package ejemplo7;

/**
 * En este ejemplo, agregamos constructores a la clase Rectangulo
 * 
 * @author csogorb
 * 
 */
public class Ejemplo7 {

	public static void main(String[] args) {
		Rectangulo rect1 = new Rectangulo();
		rect1.mostrar();
		
		System.out.println();
		
		Rectangulo rect2 = new Rectangulo(5,5,20,10,"verde");
		rect2.mostrar();
	}

}









