package ar.edu.ort.p1.unidades.u3.practico03.ej09_puerto_parana.src;

public class Amarra {

	private int numero;
	private String ubicacion;
	private Embarcacion embarcacion;

	public Embarcacion getEmbarcacion() {
		return embarcacion;
	}

	public boolean estaDisponible() {
		return this.embarcacion == null;
	}

	public double getMontoAlquiler() {
		return estaDisponible() ? 0 : embarcacion.getMontoAlquiler();
	}

}
