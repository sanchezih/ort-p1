package ar.edu.ort.p1.unidades.u5.ejemplos._01_generics._01_ejemplos_iniciales._02_sorteador_bolillas.src;

public class Bolilla {

	private int numero;

	/*----------------------------------------------------------------------------*/

	public Bolilla(int numero) {
		this.numero = numero;
	}

	/*----------------------------------------------------------------------------*/

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Bolilla [numero=" + numero + "]";
	}

}
