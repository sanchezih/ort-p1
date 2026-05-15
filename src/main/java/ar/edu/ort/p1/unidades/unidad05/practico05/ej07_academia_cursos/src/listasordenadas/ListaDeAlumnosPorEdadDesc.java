package ar.edu.ort.p1.unidades.unidad05.practico05.ej07_academia_cursos.src.listasordenadas;

import ar.edu.ort.p1.unidades.unidad05.practico05.ej07_academia_cursos.src.Alumno;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeAlumnosPorEdadDesc extends ListaOrdenadaNodos<Integer, Alumno> {

	@Override
	public int compare(Alumno alumno1, Alumno alumno2) {
		return alumno2.getEdad() - alumno1.getEdad();
	}

	@Override
	public int compareByKey(Integer edad, Alumno alumno) {
		return alumno.getEdad() - edad;
	}
}