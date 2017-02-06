package poker;

public class Baraja {

	private Carta[] cartas = new Carta[52];

	public Baraja() {

	}

	public void ordenar() {
		
		for(int palo = 0; palo<=3; palo++){
			
			for(int valor = 1; valor<=13; valor++){
				cartas[palo*13 + valor -1] = new Carta(valor,palo);
			}
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// public void ordenar() {
	//
	// int indice = 0;
	//
	// // En el bucle externo, el palo va cambiando de 0 a 3
	// for (int i = 0; i <= 3; i++) {
	//
	// // En el bucle interno, el valor de la carta va cambiando de 1 a 13
	// for (int j = 1; j <= 13; j++) {
	//
	// // La variable índice, irá tomando valores de 0 a 51.
	// indice = i * 13 + j - 1;
	// cartas[indice] = new Carta(i, j);
	// System.out.println("Creada carta " + indice +
	// " con valores (" + i + "," + j + ")");
	//
	// }
	// }
	// }

}
