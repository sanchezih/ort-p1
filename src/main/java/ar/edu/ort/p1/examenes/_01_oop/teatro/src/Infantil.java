package ar.edu.ort.p1.examenes._01_oop.teatro.src;

public class Infantil extends Musical {

	private static final int TIEMPO_VESTIMENTA = 10;

	private int cantPersonajes;

	/*----------------------------------------------------------------------------*/

	public Infantil(String nombre, int duracion, int cantLocalidades, boolean orquestaVivo, int cantPersonajes) {
		super(nombre, duracion, cantLocalidades, orquestaVivo);
		this.cantPersonajes = cantPersonajes;
	}

	/*----------------------------------------------------------------------------*/

	public int getDuracion() {
		return super.getDuracion() + TIEMPO_VESTIMENTA * this.cantPersonajes;
	}

}
