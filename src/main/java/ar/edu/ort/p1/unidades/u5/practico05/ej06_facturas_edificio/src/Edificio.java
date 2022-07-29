package ar.edu.ort.p1.unidades.u5.practico05.ej06_facturas_edificio.src;

import ar.edu.ort.tp1.u5.tda.impl.ColaNodos;
import ar.edu.ort.tp1.u5.tda.interfaces.Cola;
import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

public class Edificio {

	private final static int CANT_COLAS = 4;
	private Cola<Factura>[] colasDeFacturas;

	public Edificio() {
		this.colasDeFacturas = new ColaNodos[CANT_COLAS];
		for (int i = 0; i < CANT_COLAS; i++) {
			this.colasDeFacturas[i] = new ColaNodos<Factura>();
		}
	}

	/*----------------------------------------------------------------------------*/

	public void catalogar(Pila<Factura> facturasApiladas) {
		Factura facturaActual;
		int posCola;

		while (!facturasApiladas.isEmpty()) {
			facturaActual = facturasApiladas.pop();
			posCola = facturaActual.getTipo().ordinal();
			System.out.println("Saco de la pila " + facturaActual + " y la pondre en la cola  -> "
					+ TipoFactura.values()[posCola]);

			colocarFacturaEnCola(this.colasDeFacturas[posCola], facturaActual);
		}
		System.out.println();
		mostrar(); // Metodo agregado
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
			}
			colaFacts.add(factActual);
			factActual = colaFacts.remove();
		}

		/* Si ninguna factura en la cola es mayor o la cola estaba vacia... */

		if (!entro) {
			colaFacts.add(fact);
		}
	}

	/*----------------------------------------------------------------------------*/

	public double[] montoAAbonarPorTipo() {
		double[] montosPorTipo;
		montosPorTipo = new double[TipoFactura.values().length];
		for (int i = 0; i <= CANT_COLAS - 1; i++) {
			montosPorTipo[i] = montoFacturasPorTipo(i);
		}
		return montosPorTipo;
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

	/*----------------------------------------------------------------------------*/

	private void mostrar() {
		for (int i = 0; i < CANT_COLAS; i++) {
			System.out.println("Muestro las facturas de la cola " + TipoFactura.values()[i]);
			Factura factCentinela;
			Factura factActual;
			factCentinela = new Factura(null, 0, 0, null); // Valores invalidos
			this.colasDeFacturas[i].add(factCentinela);
			factActual = this.colasDeFacturas[i].remove();

			while (factActual != factCentinela) {
				System.out.println("\t" + factActual);
				this.colasDeFacturas[i].add(factActual);
				factActual = this.colasDeFacturas[i].remove();
			}
		}
	}

}
