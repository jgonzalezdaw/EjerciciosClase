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
		Conversor c1 = new Conversor();

		getDatos();

		c1.setMi(km);
		c1.setAt(milibares);
		c1.setJu(calorias);

		System.out.println(km + " Km son : " + c1.getkm() + " Millas");
		System.out.println(milibares + " Milibares son : " + c1.getMi() + " Atmosferas");
		System.out.println(calorias + " Julios son : " + c1.getCa() + " Julios");

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
