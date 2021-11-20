package ar.edu.ort.p1.extra.examenes.examenes_conducir.src;

public class Moto extends Vehiculo {

	private boolean tieneEspejos;

	public Moto(String patente, String marca, int cilindrada, boolean tieneEspejos) {
		super(patente, marca, cilindrada);
		this.tieneEspejos = tieneEspejos;
	}

	public boolean isTieneEspejos() {
		return tieneEspejos;
	}

	public void setTieneEspejos(boolean tieneEspejos) {
		this.tieneEspejos = tieneEspejos;
	}

	@Override
	public String toString() {
		return "Moto [tieneEspejos=" + tieneEspejos + "]";
	}

}
