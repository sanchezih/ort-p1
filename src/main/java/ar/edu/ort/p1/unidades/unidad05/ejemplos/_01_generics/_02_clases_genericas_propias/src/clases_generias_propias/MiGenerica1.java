package ar.edu.ort.p1.unidades.unidad05.ejemplos._01_generics._02_clases_genericas_propias.src.clases_generias_propias;

public class MiGenerica1<T> {

	private T primerAtributoDeTipoGenerico;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public MiGenerica1() {
		primerAtributoDeTipoGenerico = null;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public T getPrimerAtributo() {
		return primerAtributoDeTipoGenerico;
	}

	/**
	 * 
	 * @param primerAtributoDeTipoGenerico
	 */
	public void setPrimerAtributo(T primerAtributoDeTipoGenerico) {
		this.primerAtributoDeTipoGenerico = primerAtributoDeTipoGenerico;
	}

}
