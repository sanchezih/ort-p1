package ar.edu.ort.p1.unidades.unidad03.practico03.ej10_puerto_parana.src;

public class Amarra {

	private int numero;
	private Ubicacion ubicacion;
	private Embarcacion embarcacion;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param numero
	 * @param ubicacion
	 */
	public Amarra(int numero, Ubicacion ubicacion) {
		this.numero = numero;
		this.ubicacion = ubicacion;
		this.embarcacion = null;
	}

	/**
	 * 
	 * @param numero
	 * @param ubicacion
	 * @param embarcacion
	 */
	public Amarra(int numero, Ubicacion ubicacion, Embarcacion embarcacion) {
		this.numero = numero;
		this.ubicacion = ubicacion;
		this.embarcacion = embarcacion;
	}

	/*----------------------------------------------------------------------------*/

	public Embarcacion getEmbarcacion() {
		return this.embarcacion;
	}

	/*----------------------------------------------------------------------------*/

	public double getMontoAlquiler() {

		// Implementacion paso a paso

//		boolean estaDisponible = estaDisponible();
//		double res;
//
//		if (estaDisponible) {
//			res = 0;
//		} else {
//			res = embarcacion.getMontoAlquiler();
//		}
//		return res;

		// Implementacion con ternario

		return estaDisponible() ? 0 : embarcacion.getMontoAlquiler();
	}

	/**
	 * Metodo que devuelve true si la amarra se encuentra disponible o false en caso
	 * contrario. Implementar esta funcionalidad de esta manera nos evita tener que
	 * tener y mantener un atributo booleano que indique si la amarra se encuentra
	 * disponible o no.
	 * 
	 * @return
	 */
	public boolean estaDisponible() {
		return this.embarcacion == null;
	}

	@Override
	public String toString() {
		return "Amarra [numero=" + numero + ", ubicacion=" + ubicacion + ", embarcacion=" + embarcacion + "]";
	}

}
