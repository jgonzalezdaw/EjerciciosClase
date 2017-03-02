package concesionario;

public abstract class Vehiculo {

	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	
	public Vehiculo(){
		
	}

	public Vehiculo(String matricula, String marca, 
			String modelo, String color){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public void mostrar() {
		System.out.println("Matrícula: " + matricula);
		System.out.println("Marca: " + matricula);
		System.out.println("Modelo: " + matricula);
		System.out.println("Matrícula: " + matricula);
	}

	public boolean arrancar() {
		return false;
	}

	public void acelerar() {
		System.out.println("Acelerando");
	}

	public void frenar() {
		System.out.println("Frenando");
	}

}
