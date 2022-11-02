package ar.edu.ort.p1.unidades.u3.practico03.ej10_puerto_parana.src;

public class Amarra {

	private int numero;
	private Ubicacion ubicacion;
	private Embarcacion embarcacion;

	public Amarra(int numero, Ubicacion ubicacion) {
		this.numero = numero;
		this.ubicacion = ubicacion;
		this.embarcacion = null;
	}

	public Amarra(int numero, Ubicacion ubicacion, Embarcacion embarcacion) {
		this.numero = numero;
		this.ubicacion = ubicacion;
		this.embarcacion = embarcacion;
	}

	public Embarcacion getEmbarcacion() {
		return embarcacion;
	}

	/*----------------------------------------------------------------------------*/

	public double getMontoAlquiler() {
		return estaDisponible() ? 0 : embarcacion.getMontoAlquiler();
	}

	/**
	 * Este metodo devolvera true si la amarra se encuentra disponible o false en
	 * caso contrario. Implementar esta funcionalidad de esta manera nos evita tener
	 * que tener y mantener un atributo booleano que indique si la amarra se
	 * encuentra disponible o no.
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
