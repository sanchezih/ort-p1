package ar.edu.ort.p1.unidades.unidad05.tp05.ej03_impresora_nopuro.src;

public class Impresora {

	private boolean estaEncendida;
	private int cantHojasDisp;
	private ColaDeDocumentos colaDocs;

	/*----------------------------------------------------------------------------*/

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

	public void agregarDocumento(Documento documento) {

		System.out.println("Intentando agregar el doc " + documento + " a la impresora...");

		if (!this.colaDocs.isFull()) {
			this.colaDocs.add(documento);
			System.out.println("OK");
		} else {
			System.out.println("No se pudo agregar el documento.");
		}
	}

	public boolean imprimir() {
		System.out.println("Comienza el proceso de impresion...");

		boolean puedeImprimir = this.estaEncendida() && hayHojasSuficientes();

		if (puedeImprimir) {
			efectuarImpresion();
		}
		return puedeImprimir;
	}

	private void efectuarImpresion() {

		Documento documento = null;

		while (!this.colaDocs.isEmpty()) {
			documento = this.colaDocs.remove();
			System.out.println("\t->Se imprimio: " + documento);
			this.cantHojasDisp -= cantHojasNecesarias(documento);
		}
	}

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

	private int cantHojasNecesarias(Documento documento) {
		double divisor = divisorSegunFaz(documento.isDobleFaz());
		return (int) Math.ceil(documento.getCantCarillas() / divisor);
	}

	private double divisorSegunFaz(boolean dobleFaz) {
		return dobleFaz ? 2.0 : 1.0;
	}
}
