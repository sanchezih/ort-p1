package ar.edu.ort.p1.u1.practico01.ej08_ortparking.src;

import java.util.ArrayList;

public class OrtParking {

	private ArrayList<Garage> garages;

	public OrtParking() {
		super();
		this.garages = new ArrayList<Garage>();
	}

	/*----------------------------------------------------------------------------*/

	/* Metodos complementarios */

	public void agregarGarage(Garage garage) {
		this.garages.add(garage);
	}

}
