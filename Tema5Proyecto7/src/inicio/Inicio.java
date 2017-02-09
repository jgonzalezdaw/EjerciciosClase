package inicio;

import algebra.Polinomio;

public class Inicio {

	public static void main(String[] args) {
		
		//double[] coeficientesP = {1,3,5};
		//Polinomio p = new Polinomio(coeficientesP);
		Polinomio p = new Polinomio(new double[]{1,3,5,10,3});
		System.out.print("p = ");
		p.mostrarCoeficientes();
		
		double[] coeficientesQ = {1,6,7,4,5};
		Polinomio q = new Polinomio(coeficientesQ);
		System.out.print("q = ");
		q.mostrarCoeficientes();
		
		Polinomio suma = p.sumar(q);
		System.out.println("Suma de p y q = ");
		suma.mostrarCoeficientes();
		
		Polinomio resta = p.restar(q);
		System.out.println("Resta de p y q = ");
		resta.mostrarCoeficientes();
		
		System.out.println("Llamamos al método toString de p:");
		System.out.println(p.toString());
	}
	
}












