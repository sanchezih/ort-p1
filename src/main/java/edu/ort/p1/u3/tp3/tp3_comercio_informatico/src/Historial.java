package edu.ort.p1.u3.tp3.tp3_comercio_informatico.src;

import java.util.ArrayList;

public class Historial {

	public ArrayList<Facturable> itemsVendidos = new ArrayList<Facturable>();

	public double montoTotalFacturado() {
		double montoTotal = 0;
		for (Facturable iv : itemsVendidos) {
			montoTotal = montoTotal + iv.getMontoFacturacion();
		}
		return montoTotal;
	}

	public int cantServiciosSimples() {
		int cant = 0;
		for (Facturable iv : itemsVendidos) {
			if (iv instanceof ServicioDeReparacion) {
				if (((ServicioDeReparacion) iv).getNivelDificultad() < 2) {
					cant++;
				}
			}
		}
		return cant;
	}
}
