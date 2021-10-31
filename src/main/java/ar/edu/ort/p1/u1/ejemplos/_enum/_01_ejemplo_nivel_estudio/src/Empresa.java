package ar.edu.ort.p1.u1.ejemplos._enum._01_ejemplo_nivel_estudio.src;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Persona> listaDePersonas;

	public Empresa() {
		this.listaDePersonas = new ArrayList<>();
	}

	public void agregarPersona(Persona persona) {
		this.listaDePersonas.add(persona);
	}

	public void mostrarPorNivel(NivelEstudio nivel) {
		for (Persona persona : listaDePersonas) {
			if (persona.getNivelEstudio() == nivel) {
				System.out.println(persona);
			}
		}
	}
}
