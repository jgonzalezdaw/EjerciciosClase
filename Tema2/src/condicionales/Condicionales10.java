package condicionales;

// Pediremos un precio. Si es mayor de 100 € haremos un 
// descuento del 15 %. Y si no, no haremos descuento.

import java.util.*;

public class Condicionales10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Precio? ");
		
		if(entrada.hasNextDouble()){
			
			double precio = entrada.nextDouble();
			double precioFinal;

			precioFinal = precio > 100 ? 0.85 * precio : precio;

			System.out.println("Precio final: " + precioFinal);

		} else{
			
			System.out.println("Entrada incorrecta.");
			
		}
		
	}

}






