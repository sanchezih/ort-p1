package ar.edu.ort.p1.unidades.u1.practico01.ej10_ortland.src;

import java.util.ArrayList;

public class Mazo {

	private ArrayList<Carta> cartas;

	public int cantCartas() {
		return this.cartas.size();
	}

	public Carta proximaCarta() {
		return this.cartas.remove(0);
	}

}
