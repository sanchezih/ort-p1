package ar.edu.ort.p1.unidades.unidad01.practico01.ej03_ort_informes_carreras.src;

import java.util.ArrayList;
import java.util.List;

public class ORT {

	private List<Carrera> carreras;

	/*----------------------------------------------------------------------------*/

	public ORT() {
		this.carreras = new ArrayList<Carrera>();
	}

	/*----------------------------------------------------------------------------*/

	public void agregarCarrera(Carrera carrera) {
		carreras.add(carrera);
	}

}
