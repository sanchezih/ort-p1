package ar.edu.ort.p1.unidades.u1.practico01.ej05_inscripciones_padron.src;

import java.util.ArrayList;

public class Mesa {

	private int numero;
	private ArrayList<Persona> personas;
	private Persona presidente;

	public Mesa(int numero) {
		this.numero = numero;
		this.personas = new ArrayList<Persona>();
		this.presidente = null;
	}

	@Override
	public String toString() {
		return "Mesa [numero=" + numero + ", personas=" + personas + ", presidente=" + presidente + "]";
	}
	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param persona
	 * @return
	 */
	public boolean quitarPersona(Persona persona) {
		int i = 0;
		Persona personaQuitada = null;
		Persona personaActual;

		while (i < this.personas.size() && personaQuitada == null) {
			personaActual = this.personas.get(i);
			if (personaActual == persona) {
				personaQuitada = this.personas.remove(i);
				this.quitarPresidente(persona);
			} else {
				i++;
			}
		}
		return (personaQuitada != null);
	}

	private void quitarPresidente(Persona persona) {
		if (this.presidente == persona) {
			this.presidente = null;
		}
	}

	public void asignarPresidente(Persona persona) {
		this.presidente = persona;
		this.personas.add(persona);
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param padronMesas
	 */
	public void obtenerPadronMesa(ArrayList<PadronMesa> padronMesas) {
		int orden = 0;
		for (Persona persona : this.personas) {
			orden++;
			padronMesas.add(new PadronMesa(this.numero, orden, persona.getDni(), persona.getNombreApellido()));
		}
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarPersona(Persona persona) {
		this.personas.add(persona);
	}

}
