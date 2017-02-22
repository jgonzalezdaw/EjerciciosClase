package principal;

public class Empleado extends Persona {
	private String rango;
	
	@Override
	public void mostrar(){
		super.mostrar();
		
		System.out.println("Rango: " + rango);
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}
	
}
