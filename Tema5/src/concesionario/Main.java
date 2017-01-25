package concesionario;

public class Main {

	public static void main(String[] args) {

		Coche c1 = new Coche();

		c1.setMarca("Audi");
		c1.setModelo("A4");
		c1.setMatricula("5879 FDS");
		c1.setColor("Negro");
		c1.setPrecio(15000);
		c1.descuento = 50;

		c1.mostrar();
		c1.verPrecio();
		c1.detenerse();

		Coche c2 = new Coche();

		Coche.descuento = 50;
		System.out.println("El descuento que se aplicara "
				+ "a toda la gama sera de " + Coche.descuento);

	}

}
