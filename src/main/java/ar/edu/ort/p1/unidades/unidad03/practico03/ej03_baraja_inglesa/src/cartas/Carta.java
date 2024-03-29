package ar.edu.ort.p1.unidades.unidad03.practico03.ej03_baraja_inglesa.src.cartas;

public abstract class Carta {

	private boolean tapada;

	public Carta() {
		this.tapada = true;
	}

	public boolean isTapada() {
		return tapada;
	}

	public void darVuelta() {
		tapada = !tapada;
	}

	public void mostrar() {
		if (tapada) {
			System.out.println("**************");
		} else {
			System.out.println(getRepresentacion());
		}
	}

	public abstract String getRepresentacion();
}