package edu.ort.p1.u3.practico03.tp3_comercio_informatico.src;

import java.util.ArrayList;

public class Comercio {

	private ArrayList<Facturable> facturables;

	public Comercio() {
		this.facturables = new ArrayList();
	}

	public double montoTotalFacturado() {
		double total = 0;
		for (Facturable f : this.facturables) {
			total = total + f.getMontoDeFacturacion();
		}
		return total;
	}

	public int cantServiciosSimples() {
		int cantSimples = 0;
		for (Facturable f : this.facturables) {
			if (f instanceof ServicioDeReparacion) {
				ServicioDeReparacion s = (ServicioDeReparacion) f; // DOWNCASTING
				if (s.esServicioSimple()) {
					cantSimples++;
				}
			}
		}
		return cantSimples;
	}

	public void agregarFacturable(Facturable f) {
		this.facturables.add(f);
	}
}
