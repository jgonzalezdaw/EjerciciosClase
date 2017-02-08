package algebra;

public class Polinomio {

	// Atributos
	private double coeficientes[];
	
	// Constructores
	public Polinomio(){
		// Creamos un polinomio de grado 2 con
		// coeficientes 0.
		coeficientes = new double[3];
	}
	
	public Polinomio(int grado){
		// Creamos un polinomio del grado indicado 
		// con coeficientes 0.
		coeficientes = new double[grado+1];
	}
	
	public Polinomio(double[] coefs){
		coeficientes = coefs;
	}
	
	public int getGrado(){
		return coeficientes.length - 1;
	}

	// Suma un polinomio p a nuestro polinomio.
	// Damos por supuesto que ambos son del mismo grado.
	public Polinomio sumar(Polinomio q){
		double[] suma = new double[coeficientes.length];
		for (int i=0; i<coeficientes.length;i++){
			suma[i] = coeficientes[i] + q.getCoeficientes()[i];
		}
		
		return new Polinomio(suma);
	}
	
	public void mostrarCoeficientes(){
		// Muestra en una fila los coeficientes de este polinomio.
		
	}

	public double[] getCoeficientes() {
		return coeficientes;
	}

	public void setCoeficientes(double[] coeficientes) {
		this.coeficientes = coeficientes;
	}
	
	
}
















