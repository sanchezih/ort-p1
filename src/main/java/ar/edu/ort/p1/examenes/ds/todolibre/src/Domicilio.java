package ar.edu.ort.p1.examenes.ds.todolibre.src;

public class Domicilio {

	private String calle;
	private String numero;
	private String pisoDepto;
	private int comuna;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param calle
	 * @param numero
	 * @param pisoDepto
	 * @param comuna
	 */
	public Domicilio(String calle, String numero, String pisoDepto, int comuna) {
		this.calle = calle;
		this.numero = numero;
		this.pisoDepto = pisoDepto;
		this.comuna = comuna;
	}

	/*----------------------------------------------------------------------------*/

	public int getComuna() {
		return comuna;
	}

}
