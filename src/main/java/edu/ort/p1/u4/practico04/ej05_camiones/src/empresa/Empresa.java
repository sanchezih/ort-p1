package edu.ort.p1.u4.practico04.ej05_camiones.src.empresa;

import java.util.ArrayList;

public class Empresa {

	private static int CANT_CAMIONES = 10;
	private static int CANT_CHOFERES = 20;
	private ArrayList<Viaje> viajes;
	private Chofer[] choferes = new Chofer[CANT_CHOFERES];
	private Camion[] camiones = new Camion[CANT_CAMIONES];

	public Empresa(ArrayList<Viaje> viajes, Chofer[] choferes, Camion[] camiones) {
		super();
		this.viajes = viajes;
		this.choferes = choferes;
		this.camiones = camiones;
	}

	public double[] obtenerCostosDeViajes() {
		Camion elCamion;
		Chofer elChofer;
		int cantViajes = this.viajes.size();
		double costoDelViaje;
		double[] costos;

		costos = new double[cantViajes];
		for (int v = 0; v < cantViajes; v++) {
			Viaje viaje = this.viajes.get(v);
			elCamion = this.camiones[viaje.getIdCamion()]; // Camion por posicionamiento directo
			costoDelViaje = elCamion.getCostoXKm() * viaje.getKms();
			int iChofer = idxChofer(viaje.getIdChofer()); // Chofer por posicionamiento indirecto
			elChofer = this.choferes[iChofer];
			costoDelViaje += elChofer.getPagoXViaje();
			costos[v] = costoDelViaje;
		}
		return costos;
	}

	public int[][] obtenerViajesXChoferCamion() {
		int[][] cantidades;
		cantidades = new int[this.choferes.length][this.camiones.length];
		for (Viaje viaje : this.viajes) {
			int iChofer = idxChofer(viaje.getIdChofer());
			int iCamion = viaje.getIdCamion();
			cantidades[iChofer][iCamion]++;// cantidades[iChofer][iCamion] = cantidades[iChofer][iCamion] + 1
		}
		return cantidades;
	}

	private int idxChofer(String id) {
		int i = this.choferes.length - 1;
		while (i >= 0 && this.choferes[i].getID() != id) {
			i--;
		} // Se recorre para atr�s para que, si no se encuentra, se devuelva -1
		return i;
	}

	private Chofer buscarChofer(String id) {
		Chofer elChofer = null;
		int posChofer = idxChofer(id);
		if (posChofer != -1) {
			elChofer = this.choferes[posChofer];
		}
		return elChofer;
	}

}
