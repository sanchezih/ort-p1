package ar.edu.ort.p1.examenes.oop.examenes_conducir.src;

import java.util.ArrayList;

public class ExamenDeMoto extends Examen {

	private final static int TOPE_CILINDRADA = 150;
	private final static int TIEMPO_MAXIMO_PERMITIDO = 120;

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
			aprueba = apruebaExamenMotoAltaCilindrada();
		} else {
			aprueba = apruebaExamenMotoBajaCilindrada();
		}
		return aprueba;
	}

	/**
	 * Si la cilindrada de la moto es superior a 150cc, todos los circuitos deben
	 * haber sido aprobados (sin importar el tiempo).
	 * 
	 * @return
	 */
	private boolean apruebaExamenMotoAltaCilindrada() {
		return cantCircuitosAprobados() == this.circuitos.size();
	}

	/**
	 * Si la cilindrada de la moto es igual o inferior a 150cc, se puede tener hasta
	 * un solo circuito desaprobado y el tiempo total entre todos no debe superar
	 * los 2 minutos.
	 * 
	 * @return
	 */
	private boolean apruebaExamenMotoBajaCilindrada() {
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
		while (i < this.circuitos.size() && tiempoTotal <= TIEMPO_MAXIMO_PERMITIDO) {
			tiempoTotal += this.circuitos.get(i).getTiempoEnSeg();
			i++;
		}
		return tiempoTotal <= TIEMPO_MAXIMO_PERMITIDO;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complemetarios
	public void agregarCircuito(Circuito circuito) {
		this.circuitos.add(circuito);
	}

}
