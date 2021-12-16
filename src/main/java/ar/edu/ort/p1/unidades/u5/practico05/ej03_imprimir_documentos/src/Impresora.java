package ar.edu.ort.p1.unidades.u5.practico05.ej03_imprimir_documentos.src;

import ar.edu.ort.tp1.u5.tda.Cola;
import ar.edu.ort.tp1.u5.tda.nodos.ColaNodos;

public class Impresora {
	private boolean estaEncendida;
	private int cantHojasDisp;
	private Cola<Documento> colaDocs = new ColaNodos<>();

	public Impresora(boolean estaEncendida, int cantHojasDisp) {
		this.estaEncendida = estaEncendida;
		this.cantHojasDisp = cantHojasDisp;
	}

	public boolean isEstaEncendida() {
		return estaEncendida;
	}

	public void setEstaEncendida(boolean estaEncendida) {
		this.estaEncendida = estaEncendida;
	}

	public int getCantHojasDisp() {
		return cantHojasDisp;
	}

	public void setCantHojasDisp(int cantHojasDisp) {
		this.cantHojasDisp = cantHojasDisp;
	}

	public void agregarDocumento(Documento doc) {

		this.colaDocs.add(doc);
	}

	public boolean imprimir(boolean dobleFaz) {
		boolean pudoImprimir;
		double divisor;
		divisor = divisorSegunFaz(dobleFaz);
		pudoImprimir = this.estaEncendida && hayHojasSuficientes(divisor);
		if (pudoImprimir) {
			efectuarImpresion(divisor);
		}
		return pudoImprimir;
	}

	private void efectuarImpresion(double divisor) {
		/*-
		 * En la impresion doble faz, si el numero de carillas es impar,
		 * se consume una hoja completa
		 * Math.ceil(4) --> 4.0
		 * Math.ceil(4.5) --> 5.0
		 */
		Documento doc;
		while (!this.colaDocs.isEmpty()) {
			doc = this.colaDocs.remove();
			System.out.println("Impreso: " + doc);
			this.cantHojasDisp -= (int) Math.ceil(doc.getCantCarillas() / divisor);
		}
	}

	private double divisorSegunFaz(boolean dobleFaz) {
		double divisor;
		if (dobleFaz) {
			divisor = 2.0;
		} else {
			divisor = 1.0;
		}
		return divisor;
	}

	private boolean hayHojasSuficientes(double divisor) {
		Documento docCentinela = new Documento("", -1);
		Documento doc;
		int cantCarillas = 0;
		this.colaDocs.add(docCentinela);
		doc = this.colaDocs.remove();
		while (doc != docCentinela) {
			cantCarillas += doc.getCantCarillas();
			this.colaDocs.add(doc);
			doc = this.colaDocs.remove();
		}
		return cantCarillas / divisor <= this.cantHojasDisp;
	}

	/*-
	 * Here is a block comment with some very special formatting that I want
	 * indent(1) to ignore.
	 *
	 * 	one
	 * 		two
	 * 			three
	 */

}
