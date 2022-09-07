package ar.edu.ort.p1.unidades.u3.practico03.ej11_comercio_informatico.src;

import java.util.ArrayList;

public class Historial {

	private ArrayList<Facturable> facturables;

	public Historial() {
		this.facturables = new ArrayList<Facturable>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: El metodo montoTotalFacturado que devuelva el valor que da
	 * nombre al mismo.
	 * 
	 * @return
	 */
	public double montoTotalFacturado() {
		double total = 0;
		for (Facturable f : this.facturables) {
			total += f.getMontoFacturacion(); // total = total + f.getMontoFacturacion();
		}
		return total;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo cantServiciosSimples que debe devolver la cantidad de
	 * servicios de reparacion con nivel de dificultad menor a 2.
	 * 
	 * @return
	 */
	public int cantServiciosSimples() {
		int cont = 0;
		for (Facturable f : this.facturables) {
			if (f instanceof ServicioDeReparacion) {
				ServicioDeReparacion sdr = (ServicioDeReparacion) f; // Downcasting
				if (sdr.esServicioSimple()) {
					cont++;
				}
			}
		}
		return cont;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarFacturable(Facturable facturable) {
		this.facturables.add(facturable);
	}
}
