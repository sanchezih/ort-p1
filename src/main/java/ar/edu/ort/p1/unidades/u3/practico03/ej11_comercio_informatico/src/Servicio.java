package ar.edu.ort.p1.unidades.u3.practico03.ej11_comercio_informatico.src;

import ar.edu.ort.p1.util.Matematica;

public abstract class Servicio implements Facturable {

	private int cantHoras;

	public Servicio(int cantHoras) {
		this.cantHoras = cantHoras;
	}

	public int getCantHoras() {
		return cantHoras;
	}

	public abstract double getValorHora();

	/*----------------------------------------------------------------------------*/

	@Override
	public double getMontoFacturacion() {
		return Matematica.sumarPorcentaje(getPrecio(), Facturable.IVA / 2);
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public double getPrecio() {
		return getCantHoras() * getValorHora();
	}
}
