package principal;

public class Cliente extends Persona{
	private String visa;
	
	@Override
	public void mostrar(){
		super.mostrar();
		System.out.println("Visa: " + visa);
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}
	
}
