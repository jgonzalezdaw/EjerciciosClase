package dudas;

public class Ejercicio14 {

	public static void main(String[] args) {

		String[][] precios = { { "Tele samsung", "120" }, { "Móvil Sony", "115" }, { "iPad mini", "290" },
				{ "Móvil HTC", "95" } };
		int total = 0;
		int posMin = 0, posMax = 0;

		System.out.println("Artículos");
		System.out.println("===============================");
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i][0] + "\t" + precios[i][1]);
			total = total + Integer.parseInt(precios[i][1]);
		}

		System.out.println("\nTotal: " + total + " €");

		for (int i = 0; i < precios.length; i++) {

			if (Integer.parseInt(precios[i][1]) < Integer.parseInt(precios[posMin][1])) {
				posMin = i;
			}

			if (Integer.parseInt(precios[i][1]) > Integer.parseInt(precios[posMax][1])) {
				posMax = i;
			}

		}

		System.out.println("\nEl producto más barato es " + precios[posMin][0] + ", que vale " + precios[posMin][1]);
		System.out.println("\nEl producto más caro es " + precios[posMax][0] + ", que vale " + precios[posMax][1]);

	}

}
