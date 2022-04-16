package ar.edu.ort.p1.examenes.examenes_conducir.src;

import java.util.ArrayList;

public class ExamenDeMoto extends Examen {

	private final static int TOPE_CILINDRADA = 150;
	private final static int TOPE_SEGUNDOS = 120;

	private Moto moto;
	private ArrayList<Circuito> circuitos;

	public ExamenDeMoto(String fecha, Persona persona, Moto moto) {
		super(fecha, persona);
		this.moto = moto;
		this.circuitos = new ArrayList<Circuito>();
	}

	@Override
	public boolean isAprobado() {
		boolean aprueba;

		if (this.moto.getCilindrada() > TOPE_CILINDRADA) {
			aprueba = cantCircuitosAprobados() == this.circuitos.size();
		} else {
			aprueba = apruebaMotoMenorCC();
		}
		return aprueba;
	}

	private boolean apruebaMotoMenorCC() {
		return cantCircuitosAprobados() >= this.circuitos.size() - 1 && cumpleTiempoTotal();
	}

	private int cantCircuitosAprobados() {
		int cantApr = 0;

		for (Circuito c : this.circuitos) {
			if (c.isAprobado()) {
				cantApr++;
			}
		}
		return cantApr;
	}

	private boolean cumpleTiempoTotal() {
		int i = 0;
		int tiempoTotal = 0;
		while (i < this.circuitos.size() && tiempoTotal <= TOPE_SEGUNDOS) {
			tiempoTotal += this.circuitos.get(i).getTiempoEnSeg();
			i++;
		}
		return tiempoTotal <= TOPE_SEGUNDOS;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complemetarios
	public void agregarCircuito(Circuito circuito) {
		this.circuitos.add(circuito);
	}

}
