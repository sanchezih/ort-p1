package ar.edu.ort.p1.unidades.unidad01.practico01.ej08_ortparking.src;

public class Llave {

	private String patente;

	/*----------------------------------------------------------------------------*/

	public Llave(String patente) {
		this.patente = patente;
	}

	/*----------------------------------------------------------------------------*/

	public String getPatente() {
		return patente;
	}

	@Override
	public String toString() {
		return "Llave [patente=" + patente + "]";
	}

}
