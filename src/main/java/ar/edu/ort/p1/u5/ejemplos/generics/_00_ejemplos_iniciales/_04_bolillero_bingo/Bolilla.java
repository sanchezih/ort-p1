package ar.edu.ort.p1.u5.ejemplos.generics._00_ejemplos_iniciales._04_bolillero_bingo;

public class Bolilla {
	private int numero;

	public Bolilla(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Bolilla [numero=" + numero + "]";
	}

}
