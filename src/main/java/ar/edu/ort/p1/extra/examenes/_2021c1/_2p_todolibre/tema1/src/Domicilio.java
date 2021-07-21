package ar.edu.ort.p1.extra.examenes._2021c1._2p_todolibre.tema1.src;

public class Domicilio {

	private String calle;
	private String numero;
	private String pisoDepto;
	private int comuna;

	public Domicilio(String calle, String numero, String pisoDepto, int comuna) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.pisoDepto = pisoDepto;
		this.comuna = comuna;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPisoDepto() {
		return pisoDepto;
	}

	public void setPisoDepto(String pisoDepto) {
		this.pisoDepto = pisoDepto;
	}

	public int getComuna() {
		return comuna;
	}

	public void setComuna(int comuna) {
		this.comuna = comuna;
	}

}
