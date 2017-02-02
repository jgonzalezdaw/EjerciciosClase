import java.util.*;

public class EjemplosMetodosParametros4 {

	public static void main(String[] args) {

		System.out.println("La suma de 5,3 y 20,1 es " + suma(5.3f, 20.1f));

	}

	static float suma(float x, float y) {
		float resultado = x + y;
		return resultado;
	}

}
