package ar.edu.ort.p1.unidades.u1.practico01.ej05_inscripciones_padron.src;

import java.util.ArrayList;

public class Escuela {

	private String nombre;
	private ArrayList<Mesa> mesas;

	public Escuela(String nombre) {
		this.nombre = nombre;
		this.mesas = new ArrayList<Mesa>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo designarPresidenteDeMesa de la clase
	 * Escuela que recibe una mesa y una persona para designarla como su presidente
	 * de mesa.
	 * 
	 * Debe tenerse en cuenta que una persona no puede votar ni ser presidente en
	 * mas de una mesa. En caso de estar como votante y/o presidente en otra mesa
	 * debera quitarse de la misma. Si la mesa destino ya tenia presidente designado
	 * debera reemplazarlo.
	 * 
	 * @param mesa
	 * @param persona
	 */
	public void designarPresidenteDeMesa(Mesa mesa, Persona persona) {
		this.quitarPersonaDeMesa(persona);
		mesa.asignarPresidente(persona);

	}

	/**
	 * 
	 * @param persona
	 */
	private void quitarPersonaDeMesa(Persona persona) {

		int i = 0;
		boolean personaQuitada = false;
		Mesa mesa;

		while (i < this.mesas.size() && !personaQuitada) {
			mesa = this.mesas.get(i);
			personaQuitada = mesa.quitarPersona(persona);
			i++;
		}
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo obtenerInforme de la clase Escuela que
	 * no recibe parametros y devuelve (no muestra por consola) la siguiente
	 * informacion de todas las mesas y cada una de las personas que votan en ellas.
	 * 
	 * Numero de la Mesa: este dato quedara repetido en la lista por cada persona
	 * encontrada que vote en la misma mesa.
	 * 
	 * Numero de orden de la persona en la mesa.
	 * 
	 * DNI de la persona.
	 * 
	 * Apellido y Nombre de la persona.
	 * 
	 * @return
	 */
	public ArrayList<PadronMesa> obtenerInforme() {

		ArrayList<PadronMesa> padronMesas = new ArrayList<PadronMesa>();

		for (Mesa mesa : this.mesas) {
			mesa.obtenerPadronMesa(padronMesas);
		}
		return padronMesas;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos extra
	public void agregarMesa(Mesa mesa) {
		this.mesas.add(mesa);
	}

}
