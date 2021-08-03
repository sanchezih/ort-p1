package ar.edu.ort.p1.u1.practico01.ej03_ort_informes_carreras.src;

import java.util.ArrayList;

public class ORT {

	private ArrayList<Carrera> carreras;

	public ORT() {
		this.carreras = new ArrayList<Carrera>();
	}

	public void agregarCarrera(Carrera carrera) {
		carreras.add(carrera);
	}

}
