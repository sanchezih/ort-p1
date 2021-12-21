package ar.edu.ort.p1.unidades.u1.ejemplos._enum._01_ejemplo_nivel_estudio.src;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Persona> personas;

	public Empresa() {
		this.personas = new ArrayList<>();
	}

	public void agregarPersona(Persona persona) {
		this.personas.add(persona);
	}

	public void mostrarPorNivel(NivelEstudio nivelEstudio) {
		for (Persona persona : personas) {
			if (persona.getNivelEstudio() == nivelEstudio) {
				System.out.println(persona);
			}
		}
	}
}
