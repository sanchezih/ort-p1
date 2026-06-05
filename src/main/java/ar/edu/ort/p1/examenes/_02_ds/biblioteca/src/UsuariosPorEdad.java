package ar.edu.ort.p1.examenes._02_ds.biblioteca.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class UsuariosPorEdad extends ListaOrdenadaNodos<Integer, Usuario> {

	@Override
	public int compare(Usuario u1, Usuario u2) {
		return u2.getEdad() - u1.getEdad();
	}

	@Override
	public int compareByKey(Integer edad, Usuario u) {
		return u.getEdad() - edad;
	}

}
