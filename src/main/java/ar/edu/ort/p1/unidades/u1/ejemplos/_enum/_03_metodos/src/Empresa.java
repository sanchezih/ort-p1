package ar.edu.ort.p1.unidades.u1.ejemplos._enum._03_metodos.src;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Persona> personas;

	public Empresa() {
		this.personas = new ArrayList<>();
	}

	public void agregarPersona(Persona persona) {
		this.personas.add(persona);
	}

	public void mostrarPorNivel(NivelEstudio nivel) {
		for (Persona persona : personas) {
			if (persona.getNivelEstudio() == nivel) {
				System.out.println(persona);
			}
		}
	}
}
