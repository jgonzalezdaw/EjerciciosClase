package poker;

public class Carta {

	private int valor;
	private int palo;

	// Constructores
	Carta(int valor, int palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getPalo() {
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}

	public boolean compara(Carta otraCarta) {
		if (valor == otraCarta.valor && palo == otraCarta.palo) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {

		String[] nombres = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Sota",
				"Reina", "Rey" };
		String[] palos = { "Diamantes", "Corazones", "Picas", "Tréboles" };

		String valorString = nombres[valor - 1];
		String paloString = palos[palo];

		return valorString + " de " + paloString;

	}

}
