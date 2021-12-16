package ar.edu.ort.p1.unidades.u1.ejemplos._enum._03_metodos.src;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Persona> listaPersonas;

	public Empresa() {
		this.listaPersonas = new ArrayList<>();
	}

	public void agregarPersona(Persona p) {
		this.listaPersonas.add(p);
	}

	public void mostrarPorNivel(NivelEstudio nivel) {
		for (Persona p : listaPersonas) {
			if (p.getNivelEstudio() == nivel) {
				System.out.println(p);
			}
		}
	}
}
