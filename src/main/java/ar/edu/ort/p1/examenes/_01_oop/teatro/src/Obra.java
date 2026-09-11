package ar.edu.ort.p1.examenes._01_oop.teatro.src;

import java.util.ArrayList;
import java.util.List;

public abstract class Obra {

	private String nombre;
	private int duracion;
	private int cantLocalidades;
	private int cantEspectadores;
	private List<Espectador> espectadores;

	/*----------------------------------------------------------------------------*/

	public Obra(String nombre, int duracion, int cantLocalidades) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.cantLocalidades = cantLocalidades;
		this.cantEspectadores = 0;
		this.espectadores = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public int getDuracion() {
		return this.duracion;
	}

	public int getCantLocalidades() {
		return cantLocalidades;
	}

	public boolean tieneNombre(String nombre) {
		return this.nombre == nombre;
	}

	/**
	 * 
	 * @param espectador
	 * @return
	 */
	public boolean puedeIngresar(Espectador espectador) {

		boolean hayLocalidades = this.cantEspectadores + espectador.getCantLocalidadesRequeridas() <= this.getCantLocalidades();
		boolean tieneTiempoDisponible = espectador.tieneTiempoDisponible(this.getDuracion());

		return hayLocalidades && tieneTiempoDisponible;
	}

	/**
	 * 
	 * @param espectador
	 */
	public void ingresar(Espectador espectador) {
		this.espectadores.add(espectador);
		this.cantEspectadores += espectador.getCantLocalidadesRequeridas();
	}

	protected List<Espectador> getEspectadoresPremiables() {
		return this.espectadores;
	}

}
