import java.util.*;

public class EjemplosMetodosParametros5 {

	public static void main(String[] args) {

		System.out.println("El área de un círculo de radio 5 m es " 
				+ areaCirculo(5) + " m².");

		System.out.println("El perímetro de un círculo de radio 5 m es " 
				+ perimetroCirculo(5) + " m.");

	}

	static double areaCirculo(double radio) {
		double area = 3.141592 * radio * radio;
		return area;
	}

	static double perimetroCirculo(double radio) {
		return 2 * 3.141592 * radio;
	}

}
















