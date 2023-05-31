package ar.edu.ort.p1.unidades.u5.practico05.ej06_facturas_edificio.src;

import ar.edu.ort.p1.util.UtilCola;
import ar.edu.ort.tp1.u5.tda.interfaces.Cola;

public class Edificio {

	private final static int CANT_COLAS = 4;
	private ColaDeFacturas[] colasDeFacturas;

	/*----------------------------------------------------------------------------*/

	public Edificio() {
		this.colasDeFacturas = new ColaDeFacturas[CANT_COLAS];
		for (int i = 0; i < CANT_COLAS; i++) {
			this.colasDeFacturas[i] = new ColaDeFacturas();
		}
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo catalogar, que reciba por parametro la
	 * pila de facturas mezcladas y la procese (dejandola vacia) para lograr guardar
	 * las facturas encoladas segun el tipo con el cuidado de que queden ordenadas
	 * por numero de mes ascendente.
	 * 
	 * @param conjuntoDeFacturas
	 */
	public void catalogar(PilaDeFacturas conjuntoDeFacturas) {
		System.out.println("Catalogando...");
		Factura facturaActual;
		int colaNumero;

		while (!conjuntoDeFacturas.isEmpty()) {
			facturaActual = conjuntoDeFacturas.pop();
			colaNumero = facturaActual.getTipo().ordinal();
			System.out.println("\tSaco de la pila " + facturaActual + " y la pondre en la cola -> "
					+ TipoFactura.values()[colaNumero]);

			colocarFacturaEnCola(this.colasDeFacturas[colaNumero], facturaActual);
		}
		mostrarColas(); // Metodo agregado
	}

	/**
	 * Metodo que recibe una cola de facturas y una factura. La factura sera
	 * insertada en la cola en la posicion correspondiente en funcion del numero de
	 * mes de la misma.
	 * 
	 * Cada vez que se extrae una factura de la cola, antes de ser insertada
	 * nuevamente, se envalua contra la que ingreso como parametro, para ver cual de
	 * las dos se agrega primero.
	 * 
	 * @param colaFacts
	 * @param fact
	 */
	private void colocarFacturaEnCola(ColaDeFacturas colaFacts, Factura fact) {

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

		// Si ninguna factura en la cola es mayor o la cola estaba vacia...
		if (!entro) {
			colaFacts.add(fact);
		}
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo montoAAbonarPorTipo, que retorne el
	 * monto a abonar actualmente por cada tipo de servicio.
	 * 
	 * @return
	 */
	public double[] montoAAbonarPorTipo() {
		double[] montosPorTipo;
		montosPorTipo = new double[TipoFactura.values().length];
		for (int i = 0; i <= CANT_COLAS - 1; i++) {
			montosPorTipo[i] = montoFacturasPorTipo(i);
		}
		return montosPorTipo;
	}

	/**
	 * 
	 * @param i
	 * @return
	 */
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

	// Metodos complementarios

	/**
	 * 
	 */
	private void mostrarColas() {
		System.out.println();
		for (int i = 0; i < CANT_COLAS; i++) {
			System.out.println("Muestro las facturas de la cola " + TipoFactura.values()[i]);
			UtilCola.mostrar(this.colasDeFacturas[i]);
		}
	}

}
