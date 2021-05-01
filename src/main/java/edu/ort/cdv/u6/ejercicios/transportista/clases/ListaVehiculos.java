package edu.ort.cdv.u6.ejercicios.transportista.clases;

import edu.ort.cdv.u6.tad.ListaOrdenada;

public class ListaVehiculos extends ListaOrdenada<String, Vehiculo> {

	@Override
	protected int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
		return vehiculo1.getPatente().compareTo(vehiculo2.getPatente());
	}

	@Override
	protected int compareByKey(String patente, Vehiculo vehiculo) {
		return patente.compareTo(vehiculo.getPatente());
	}

}
