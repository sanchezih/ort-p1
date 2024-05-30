package ar.edu.ort.p1.unidades.unidad05.practico05.ej06_facturas_edificio.src;

import ar.edu.ort.p1.util.UtilCola;
import ar.edu.ort.tp1.u5.tda.interfaces.Cola;
import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

public class Edificio {

	private final static int CANT_COLAS = 4;
	private Cola<Factura>[] colasDeFacturas;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
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
	public void catalogar(Pila<Factura> conjuntoDeFacturas) {
		System.out.println("Catalogando...");
		Factura facturaActual = null;
		int colaNumero = -1;

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
	 * @param colaDeFacturas
	 * @param factura
	 */
	private void colocarFacturaEnCola(Cola<Factura> colaDeFacturas, Factura factura) {

		Factura facturaCentinela = new Factura(null, 0, 0, null); // Valores invalidos;
		Factura facturaActual = null;
		boolean entro = false;

		colaDeFacturas.add(facturaCentinela);
		facturaActual = colaDeFacturas.remove();

		while (facturaActual != facturaCentinela) {
			if (facturaActual.getNroMes() > factura.getNroMes() && !entro) {
				colaDeFacturas.add(factura);
				entro = true;
			}
			colaDeFacturas.add(facturaActual);
			facturaActual = colaDeFacturas.remove();
		}

		// Si ninguna factura en la cola es mayor o la cola estaba vacia...
		if (!entro) {
			colaDeFacturas.add(factura);
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
		double[] montosPorTipo = new double[TipoFactura.values().length];

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
	private double montoFacturasPorTipo(int index) {

		double monto = 0;
		Cola<Factura> colaAProcesar = this.colasDeFacturas[index];
		Factura facturaCentinela = new Factura(null, 0, 0, null);
		Factura facturaActual = null;

		colaAProcesar.add(facturaCentinela);
		facturaActual = colaAProcesar.remove();

		while (facturaActual != facturaCentinela) {
			monto += facturaActual.getMonto();
			colaAProcesar.add(facturaActual);
			facturaActual = colaAProcesar.remove();
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
			UtilCola.mostrarColaGenerica(this.colasDeFacturas[i]);
		}
	}

}
