package concesionario;

public class Coche extends Vehiculo {

	private int puertas;

	public Coche(String matricula, String marca, 
			String modelo, String color, int puertas) {
		super(matricula, marca, modelo, color);
		this.puertas = puertas;
	}
	

	public boolean abrirCapo() {
		return true;

	}

	public boolean cierreCentralizado() {
		return true;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Número de puertas: " + puertas);
	}
}
