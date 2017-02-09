package inicio;

import algebra.Polinomio;

public class Inicio {

	public static void main(String[] args) {
		
		//double[] coeficientesP = {1,3,5};
		//Polinomio p = new Polinomio(coeficientesP);
		Polinomio p = new Polinomio(new double[]{10,5,3});
		System.out.print("p = ");
		System.out.println(p.toString());
		
		double[] coeficientesQ = {1,6,7};
		Polinomio q = new Polinomio(coeficientesQ);
		System.out.print("q = ");
		System.out.println(q.toString());
		
		Polinomio suma = p.sumar(q);
		System.out.println("Suma de p y q = ");
		System.out.println(suma.toString());
		
		Polinomio resta = p.restar(q);
		System.out.println("Resta de p y q = ");
		System.out.println(resta.toString());
		
		System.out.println("Llamamos al método toString de p:");
		System.out.println(p.toString());
		
		System.out.println("Calculamos el valor numérico "
				+ "de p para x=2:");
		System.out.println(p.evaluar(2));
	}
	
}












