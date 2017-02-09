package inicio;

import algebra.Polinomio;

public class Inicio {

	public static void main(String[] args) {
		
		//double[] coeficientesP = {1,3,5};
		//Polinomio p = new Polinomio(coeficientesP);
		Polinomio p = new Polinomio(new double[]{1,3,5});
		
		double[] coeficientesQ = {1,6,7};
		Polinomio q = new Polinomio(coeficientesQ);
		
		Polinomio suma = p.sumar(q);
		
		
	}
	
}
