package edu.ort.p1.u5.practico05.ej02_pelotas_tenis.src;

import edu.ort.p1.u5.practico05.ej10_elecciones.src.Estado;
import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class TuboPelotasDeTenis extends PilaNodos<PelotaDeTenis> {

	public final static int MAX_PELOTAS = 3;

	public TuboPelotasDeTenis() {
		super(MAX_PELOTAS);
	}

	public boolean hayAlgunaPelotaUsada() {
		boolean hayAlguna = false;
		Pila<PelotaDeTenis> pilaAux;
		pilaAux = new PilaNodos<PelotaDeTenis>();

		while (!isEmpty() && !hayAlguna) {
			PelotaDeTenis pelota = this.pop();
			pilaAux.push(pelota);
			hayAlguna = pelota.getEstado() != Estado.NUEVA;
		}
		while (!pilaAux.isEmpty()) {
			push(pilaAux.pop());
		}
		return hayAlguna;
	}

}
