package inicio;

import geometria.*;

public class Inicio {

	public static void main(String[] args) {
		
		Cilindro c1 = new Cilindro(10,5);
		System.out.println("El area del cilindro es " + c1.getArea());
		System.out.println("El volumen del clinidro es " + c1.getVolumen());
		
		System.out.println();
		System.out.println("================================");
		
		Cilindro c2 = new Cilindro();
		c2.setAltura(20);
		c2.setRadio(10);
		System.out.println("El area del cilindro es " + c2.getArea());
		System.out.println("El volumen del clinidro es " + c2.getVolumen());
		System.out.println(c2.toString());
	}

}
