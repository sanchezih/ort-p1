package ar.edu.ort.p1.unidades.u5.practico05.ej03_impresora.src;

public class Impresora {
	private boolean estaEncendida;
	private int cantHojasDisp;
	private ColaDeDocumentos colaDocs;

	/**
	 * Constructor
	 * 
	 * @param estaEncendida
	 * @param cantHojasDisp
	 */
	public Impresora(boolean estaEncendida, int cantHojasDisp) {
		this.estaEncendida = estaEncendida;
		this.cantHojasDisp = cantHojasDisp;
		this.colaDocs = new ColaDeDocumentos();
	}

	public boolean estaEncendida() {
		return estaEncendida;
	}

	public int getCantHojasDisp() {
		return cantHojasDisp;
	}

	/**
	 * Ejercicio B: La explotacion del metodo agregarDocumento, que permita agregar
	 * un documento a la impresora para que asta lo imprima cuando se le diga.
	 */
	public void agregarDocumento(Documento doc) {
		if (!this.colaDocs.isFull()) {
			this.colaDocs.add(doc);
		}
	}

	/**
	 * Ejercicio C: La explotacion del metodo imprimir. Debe efectuar la impresion
	 * de todos los documentos (emularlo con una salida por consola) siempre y
	 * cuando:
	 * 
	 * I. Este encendida.
	 * 
	 * II. Haya suficiente cantidad de hojas de papel para imprimir todos los
	 * documentos. Si previamente se detectara que no alcanzan las hojas, no debe
	 * imprimir ninguno.
	 * 
	 * Devuelve si se pudo imprimir o no.
	 * 
	 * @return
	 */
	public boolean imprimir() {
		boolean puedeImprimir;
		puedeImprimir = this.estaEncendida() && hayHojasSuficientes();

		if (puedeImprimir) {
			efectuarImpresion();
		}

		return puedeImprimir;
	}

	/**
	 * 
	 */
	private void efectuarImpresion() {
		Documento docActual;

		while (!this.colaDocs.isEmpty()) {
			docActual = this.colaDocs.remove();
			System.out.println("Impreso: " + docActual);
			this.cantHojasDisp -= cantHojasNecesarias(docActual);
		}
	}

	private boolean hayHojasSuficientes() {
		Documento docCent;
		Documento docActual;
		int cantHojas = 0;

		docCent = new Documento(null, -1, false);
		this.colaDocs.add(docCent);
		docActual = this.colaDocs.remove();

		while (docCent != docActual) {
			cantHojas += cantHojasNecesarias(docActual);
			this.colaDocs.add(docActual);
			docActual = this.colaDocs.remove();
		}

		return this.cantHojasDisp >= cantHojas;
	}

	/**
	 * Math.ceil(4) --> 4.0
	 * 
	 * Math.ceil(4.5) --> 5.0
	 * 
	 * @param doc
	 * @return
	 */
	private int cantHojasNecesarias(Documento doc) {
		double divisor;
		divisor = divisorSegunFaz(doc.isDobleFaz());
		return (int) Math.ceil(doc.getCantCarillas() / divisor);
	}

	private double divisorSegunFaz(boolean dobleFaz) {
		return dobleFaz ? 2.0 : 1.0;
	}
}
