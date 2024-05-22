package ar.edu.ort.p1.unidades.unidad05.practico05.ej03_impresora_impl_arraylist.src;

import java.util.ArrayList;
import java.util.List;

public class Impresora {

	private boolean estaEncendida;
	private int cantHojasDisp;
	private List<Documento> documentosParaImprimir;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param estaEncendida
	 * @param cantHojasDisp
	 */
	public Impresora(boolean estaEncendida, int cantHojasDisp) {
		this.estaEncendida = estaEncendida;
		this.cantHojasDisp = cantHojasDisp;
		this.documentosParaImprimir = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public boolean estaEncendida() {
		return estaEncendida;
	}

	public int getCantHojasDisp() {
		return cantHojasDisp;
	}

	/**
	 * 
	 * @param documento
	 */
	public void agregarDocumento(Documento documento) {
		System.out.println("Intentando agregar el doc " + documento + " a la impresora...");
		this.documentosParaImprimir.add(documento);
		System.out.println("OK");
	}

	/**
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
	 * Remueve 1 a 1 los elementos de la coleccion, llamando a remove(0) para
	 * simular FIFO ya que funcionalmente se espera eso de una impresora.
	 */
	private void efectuarImpresion() {

		int size = this.documentosParaImprimir.size();

		for (int i = 0; i < size; i++) {
			Documento documento = this.documentosParaImprimir.remove(0); // Remuevo siempre el 1er elemento
			System.out.println("\t->Se imprimio: " + documento);
			this.cantHojasDisp -= cantHojasNecesarias(documento);
		}
	}

	/**
	 * 
	 * @return
	 */
	private boolean hayHojasSuficientes() {
		int cantHojas = 0;
		for (Documento documento : this.documentosParaImprimir) {
			cantHojas += cantHojasNecesarias(documento);
		}
		return this.cantHojasDisp >= cantHojas;
	}

	/**
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
