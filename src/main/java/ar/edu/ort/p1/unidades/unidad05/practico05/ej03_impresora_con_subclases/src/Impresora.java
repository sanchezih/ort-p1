package ar.edu.ort.p1.unidades.unidad05.practico05.ej03_impresora_con_subclases.src;

public class Impresora {

	private boolean estaEncendida;
	private int cantHojasDisp;
	private ColaDeDocumentos colaDocs;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param estaEncendida
	 * @param cantHojasDisp
	 */
	public Impresora(boolean estaEncendida, int cantHojasDisp) {
		this.estaEncendida = estaEncendida;
		this.cantHojasDisp = cantHojasDisp;
		this.colaDocs = new ColaDeDocumentos();
	}

	/*----------------------------------------------------------------------------*/

	public boolean estaEncendida() {
		return estaEncendida;
	}

	public int getCantHojasDisp() {
		return cantHojasDisp;
	}

	/**
	 * Ejercicio B: La explotacion del metodo agregarDocumento, que permita agregar
	 * un documento a la impresora para que esta lo imprima cuando se le diga.
	 */
	public void agregarDocumento(Documento documento) {

		System.out.println("Intentando agregar el doc " + documento + " a la impresora...");

		if (!this.colaDocs.isFull()) {
			this.colaDocs.add(documento);
			System.out.println("OK");
		} else {
			System.out.println("No se pudo agregar el documento.");
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
		System.out.println("Comienza el proceso de impresion...");

		boolean puedeImprimir = this.estaEncendida() && hayHojasSuficientes();

		if (puedeImprimir) {
			efectuarImpresion();
		}
		return puedeImprimir;
	}

	/**
	 * 
	 */
	private void efectuarImpresion() {
		Documento documento = null;

		while (!this.colaDocs.isEmpty()) {
			documento = this.colaDocs.remove();
			System.out.println("\t->Se imprimio: " + documento);
			this.cantHojasDisp -= cantHojasNecesarias(documento);
		}
	}

	/**
	 * Evalua si la cantidad de hojas disponibles es >= a la sumatoria de hojas
	 * necesarias para imprimir todos los documentos que estan en la cola de
	 * impresion.
	 * 
	 * @return
	 */
	private boolean hayHojasSuficientes() {
		Documento documento = null;
		int cantHojas = 0;
		Documento documentoCentinela = new Documento(null, -1, false);

		this.colaDocs.add(documentoCentinela);
		documento = this.colaDocs.remove();

		while (documentoCentinela != documento) {
			cantHojas += cantHojasNecesarias(documento);
			this.colaDocs.add(documento);
			documento = this.colaDocs.remove();
		}
		return this.cantHojasDisp >= cantHojas;
	}

	/**
	 * Math.ceil(4) --> 4.0
	 * 
	 * Math.ceil(4.5) --> 5.0
	 * 
	 * @param documento
	 * @return
	 */
	private int cantHojasNecesarias(Documento documento) {
		double divisor = divisorSegunFaz(documento.isDobleFaz());
		return (int) Math.ceil(documento.getCantCarillas() / divisor);
	}

	/**
	 * 
	 * @param dobleFaz
	 * @return
	 */
	private double divisorSegunFaz(boolean dobleFaz) {
		return dobleFaz ? 2.0 : 1.0;
	}
}
