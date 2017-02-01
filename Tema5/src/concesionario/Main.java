package concesionario;

public class Main {

	public static void main(String[] args) {

		Coche c1 = new Coche("Audi", "A4", "5879 FDS", "Negro", 15000);
		c1.descuento = 15;
		c1.mostrar();

		System.out.println("Precio: " + c1.verPrecio());
		c1.detenerse();

		Coche.descuento = 50;
		System.out.println("El descuento que se aplicara " + "a toda la gama sera de " + Coche.descuento);
	}

}
