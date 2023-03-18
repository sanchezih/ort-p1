package ar.edu.ort.p1.unidades.u1.practico01.ej08_ortparking.src;

public class Llave {

	private String patente;

	public Llave(String patente) {
		this.patente = patente;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	@Override
	public String toString() {
		return "Llave [patente=" + patente + "]";
	}

}
