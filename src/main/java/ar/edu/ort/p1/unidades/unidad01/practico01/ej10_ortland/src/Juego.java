package ar.edu.ort.p1.unidades.unidad01.practico01.ej10_ortland.src;

import java.util.ArrayList;
import java.util.List;

public class Juego {

	private String nombre;
	private List<Mesa> mesas;

	/*----------------------------------------------------------------------------*/

	public Juego(String nombre) {
		this.nombre = nombre;
		this.mesas = new ArrayList<Mesa>();
	}

	/*----------------------------------------------------------------------------*/

	public String getNombre() {
		return nombre;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public int getLugaresDisponibles() {
		int lugaresDisponibles = 0;
		for (Mesa mesa : this.mesas) {
			lugaresDisponibles += mesa.getLugaresDisponibles();
		}
		return lugaresDisponibles;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param nombreJugador
	 * @param edad
	 * @return
	 */
	public Resultado acomodarJugador(String nombreJugador, int edad) {
		Resultado resultado = Resultado.SIN_DISPONIBILIDAD;
		Mesa mesa = getMesaConMasParticipantes();

		if (mesa != null) {
			mesa.agregarParticipante(new Participante(nombreJugador, edad));
			resultado = Resultado.ASIGNACION_OK;
		}

		return resultado;
	}

	/**
	 * 
	 * @return
	 */
	private Mesa getMesaConMasParticipantes() {
		int maxParticipantes = -1;
		Mesa mesaConMasParticipantes = null;

		for (Mesa mesa : this.mesas) {
			int cant = mesa.getCantidadDeParticipantes();
			if (cant > maxParticipantes && mesa.getLugaresDisponibles() > 0) {
				maxParticipantes = cant;
				mesaConMasParticipantes = mesa;
			}
		}
		return mesaConMasParticipantes;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarMesa(Mesa mesa) {
		this.mesas.add(mesa);
	}
}
