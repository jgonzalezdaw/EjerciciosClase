package poker;

import poker.Carta;

public class Inicio {

	public static void main(String[] args) {

		Carta c1 = new Carta(1,0);
		Carta c2 = new Carta(1,1);

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println("¿Son las cartas iguales? " + c1.compara(c2));

	}

}
