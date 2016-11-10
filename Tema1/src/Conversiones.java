
public class Conversiones {

	public static void main(String[] args) {

		// Conversiones implícitas
		// byte edad = 40;
		//
		// short numero;
		//
		// numero = edad;
		//
		// int numeroInt;
		//
		// numeroInt = numero;
		//
		// System.out.println(numeroInt);

		// Conversiones explícitas
		int precio = 50;

		byte precioByte = (byte) precio;

		double precioArticulo = 2300.55;
		float precioFloat = (float) precioArticulo;

		long precioLong = 16184544585983L;
		short precioShort = (short) precioLong;

		char a = 'b';
		byte x = 5;

		byte resultado = (byte) (a + x);
		System.out.println(resultado);
	}

}
