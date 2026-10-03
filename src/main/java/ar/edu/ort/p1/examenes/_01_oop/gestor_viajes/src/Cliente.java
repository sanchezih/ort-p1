package ar.edu.ort.p1.examenes._01_oop.gestor_viajes.src;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private int numero;
	private List<Viaje> viajesRealizados;

	public Cliente(int numero) {
		this.numero = numero;
		this.viajesRealizados = new ArrayList<>();
	}

	/**
	 * Ejercicio 2: Metodo de la clase Cliente que devuelve el costo promedio de
	 * todos sus viajes.
	 * 
	 * @return
	 */
	public double promedioCostoDeViajes() {
		double promedio = 0.0;
		double costoTotal = 0.0;
		int cantViajesRealizados = this.viajesRealizados.size();

		if (cantViajesRealizados > 0) {
			for (Viaje viaje : this.viajesRealizados) {
				costoTotal += viaje.getCosto();
			}
			promedio = costoTotal / cantViajesRealizados;
		}
		return promedio;
	}

	/**
	 * Ejercicio 3: Metodo de la clase Cliente que indica cuantos viajes realizo el
	 * cliente con Autos Premium.
	 * 
	 * @return
	 */
	public int cantidadViajesPremium() {
		int cantidad = 0;
		for (Viaje viaje : this.viajesRealizados) {
			if (viaje.esViajePremium()) {
				cantidad++;
			}
		}
		return cantidad;
	}

	/**
	 * Ejercicio 4: Metodo de la clase Cliente que indica la cantidad de viajes que
	 * realizo con autos que poseian aire acondicionado.
	 * 
	 * @return
	 */
	public int cantidadViajesAutoConAA() {
		int cantidad = 0;
		for (Viaje viaje : this.viajesRealizados) {
			if (viaje.esEnVehiculoConAC()) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public boolean hizoViajeEcologico() {

		boolean hizoViajeEcologico = false;
		Viaje viaje;
		int i = 0;

		while (i < this.viajesRealizados.size() && !hizoViajeEcologico) {
			viaje = this.viajesRealizados.get(i);
			if (viaje.esEnVehiculoEcologico()) {
				hizoViajeEcologico = true;
			} else {
				i++;
			}
		}
		return hizoViajeEcologico;
	}

	public void addViaje(Viaje viaje) {
		this.viajesRealizados.add(viaje);
	}

}
