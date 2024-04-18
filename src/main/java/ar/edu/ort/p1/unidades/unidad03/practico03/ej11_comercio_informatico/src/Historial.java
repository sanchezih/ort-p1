package ar.edu.ort.p1.unidades.unidad03.practico03.ej11_comercio_informatico.src;

import java.util.ArrayList;
import java.util.List;

public class Historial {

	private List<Facturable> facturables;

	/*----------------------------------------------------------------------------*/

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
		for (Facturable facturable : this.facturables) {
			total += facturable.getMontoFacturacion(); // total = total + facturable.getMontoFacturacion();
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
		for (Facturable facturable : this.facturables) {
			if (facturable instanceof ServicioDeReparacion) {
				ServicioDeReparacion sdr = (ServicioDeReparacion) facturable; // Downcasting
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
