package concesionario;

public class Moto extends Vehiculo {

	private boolean sidecar;

	public Moto(String matricula, String marca, 
			String modelo, String color, boolean sidecar) {
		super(matricula, marca, modelo, color);
		this.sidecar = sidecar;
	}

	public boolean antiwheelie() {
		return false;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("¿Tiene sidecar? " + sidecar);
	}

}
