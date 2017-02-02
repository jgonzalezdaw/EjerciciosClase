package ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println("El menor de 3 y 10 es " + min(3, 10));
		System.out.println("El mayor de 3 y 10 es " + max(3, 10));
	}

	static int max(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}

	static int min(int x, int y) {
		return x < y ? x : y; // Usando el operador ternario para abreviar.
		//
		// if(x < y){
		// return x;
		// }else{
		// return y;
		// }
	}

}
