package inicio;

import java.util.*;

import conversion.Conversor;

public class Inicio {

	static double km;
	static double milibares;
	static double calorias;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Conversor de unidades");

		// Leemos algunos datos de consola.
		getDatos();

		System.out.println(km + " Km son : " + Conversor.millas(km) + " Millas");
		System.out.println(milibares + " milibares son : " + Conversor.atmosferas(milibares) + " Atmosferas");
		System.out.println(calorias + " calorías son : " + Conversor.julios(calorias) + " Julios");

	}

	static void getDatos() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Conversor de Kilometros a Millas");
		System.out.println("Ingresa km:");
		km = entrada.nextInt();
		System.out.println("Conversor de Milibares a Atmosferas");
		System.out.println("Ingresa Milibares:");
		milibares = entrada.nextInt();
		System.out.println("Conversor de Calorias a Julios");
		System.out.println("Ingresa Calorias:");
		calorias = entrada.nextInt();
	}

}
