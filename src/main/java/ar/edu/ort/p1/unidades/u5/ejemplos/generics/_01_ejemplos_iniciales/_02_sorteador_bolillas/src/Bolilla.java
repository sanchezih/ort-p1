package ar.edu.ort.p1.unidades.u5.ejemplos.generics._01_ejemplos_iniciales._02_sorteador_bolillas.src;

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