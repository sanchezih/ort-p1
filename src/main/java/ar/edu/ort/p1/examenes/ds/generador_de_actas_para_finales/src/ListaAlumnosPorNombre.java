package ar.edu.ort.p1.examenes.ds.generador_de_actas_para_finales.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaAlumnosPorNombre extends ListaOrdenadaNodos<String, Alumno> {

	@Override
	public int compare(Alumno alumno1, Alumno alumno2) {
		return alumno1.getNombre().compareTo(alumno2.getNombre());
	}

	@Override
	public int compareByKey(String nombre, Alumno alumno) {
		return nombre.compareTo(alumno.getNombre());
	}

}
