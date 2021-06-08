package edu.ort.p1.u5.practico05.ej06_facturas_edificio.src;

import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.Pila;

public class Edificio {

	private final static int CANT_COLAS = 4;
	private Cola<Factura>[] colasDeFacturas;

	public void catalogar(Pila<Factura> facturasApiladas) {
		Factura facturaActual;
		int posCola;

		while (!facturasApiladas.isEmpty()) {
			facturaActual = facturasApiladas.pop();
			posCola = facturaActual.getTipo().ordinal();
			colocarFacturaEnCola(this.colasDeFacturas[posCola], facturaActual);
		}
	}

	public double[] montoAAbonarPorTipo() {
		double[] montosPorTipo;
		montosPorTipo = new double[TipoFactura.values().length];
		for (int i = 0; i < CANT_COLAS; i++) {
			montosPorTipo[i] = montoFacturasPorTipo(i);
		}
		return montosPorTipo;
	}

	private void colocarFacturaEnCola(Cola<Factura> colaFacts, Factura fact) {
		Factura factCentinela;
		Factura factActual;
		boolean entro = false;

		factCentinela = new Factura(null, 0, 0, null); // Valores invalidos
		colaFacts.add(factCentinela);
		factActual = colaFacts.remove();

		while (factActual != factCentinela) {
			if (factActual.getNroMes() > fact.getNroMes() && !entro) {
				colaFacts.add(fact);
				entro = true;
				colaFacts.add(factActual);
				factActual = colaFacts.remove();
			}
		}

		/* Si ninguna factura en la cola es mayor o la cola estaba vacía... */

		if (!entro) {
			colaFacts.add(fact);
		}
	}

	private double montoFacturasPorTipo(int i) {
		Factura factCentinela;
		Factura factActual;
		Cola<Factura> colaAProcesar;
		double monto = 0;
		colaAProcesar = this.colasDeFacturas[i];
		factCentinela = new Factura(null, 0, 0, null); // Valores invalidos
		colaAProcesar.add(factCentinela);
		factActual = colaAProcesar.remove();

		while (factActual != factCentinela) {
			monto += factActual.getMonto();
			colaAProcesar.add(factActual);
			factActual = colaAProcesar.remove();
		}

		return monto;
	}
}
