package ar.edu.ort.p1.unidades.u4.practico04.ej02_baraja_espaniola.src;

public class Carta {
	public static final int MIN_NUM = 1;
	public static final int MAX_NUM = 12;
	private int numero;
	private Palo palo;

	public Carta(int numero, Palo palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public boolean esDe(Palo palo) {
		return this.palo == palo;
	}

	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}

}
