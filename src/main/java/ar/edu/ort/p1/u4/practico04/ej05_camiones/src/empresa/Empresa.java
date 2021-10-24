package ar.edu.ort.p1.u4.practico04.ej05_camiones.src.empresa;

import java.util.ArrayList;

public class Empresa {

	private static int CANT_CAMIONES = 10;
	private static int CANT_CHOFERES = 20;
	private ArrayList<Viaje> viajes;
	private Chofer[] choferes = new Chofer[CANT_CHOFERES];
	private Camion[] camiones = new Camion[CANT_CAMIONES];

	public Empresa() {
		inicializarEmpresa();
		this.viajes = new ArrayList<Viaje>();
	}

	/*----------------------------------------------------------------------------*/

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

	private int idxChofer(String id) {
		int i = this.choferes.length - 1;
		while (i >= 0 && this.choferes[i].getID() != id) {
			i--;
		} // Se recorre para atras para que, si no se encuentra, se devuelva -1
		return i;
	}

	/*----------------------------------------------------------------------------*/

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

	/*----------------------------------------------------------------------------*/

	private Chofer buscarChofer(String id) {
		Chofer elChofer = null;
		int posChofer = idxChofer(id);
		if (posChofer != -1) {
			elChofer = this.choferes[posChofer];
		}
		return elChofer;
	}

	/*----------------------------------------------------------------------------*/
	/* Metodos extra */

	private void inicializarEmpresa() {

		// Agrego camiones
		this.camiones[0] = new Camion(1, 150.0);
		this.camiones[1] = new Camion(2, 150.0);
		this.camiones[2] = new Camion(3, 150.0);
		this.camiones[3] = new Camion(4, 150.0);
		this.camiones[4] = new Camion(5, 150.0);
		this.camiones[5] = new Camion(6, 150.0);
		this.camiones[6] = new Camion(7, 150.0);
		this.camiones[7] = new Camion(8, 150.0);
		this.camiones[8] = new Camion(9, 150.0);
		this.camiones[9] = new Camion(10, 150.0);

		// Agrego choferes
		this.choferes[0] = new Chofer("ch01", "Angel", 10.0);
		this.choferes[1] = new Chofer("ch02", "Nieves", 10.0);
		this.choferes[2] = new Chofer("ch03", "Maria", 10.0);
		this.choferes[3] = new Chofer("ch04", "Orlando", 10.0);
		this.choferes[4] = new Chofer("ch05", "Pedro", 10.0);
		this.choferes[5] = new Chofer("ch06", "Vera", 10.0);
		this.choferes[6] = new Chofer("ch07", "Faustino", 10.0);
		this.choferes[7] = new Chofer("ch08", "Mara", 10.0);
		this.choferes[8] = new Chofer("ch09", "Jose", 10.0);
		this.choferes[9] = new Chofer("ch10", "Brenda", 10.0);
		this.choferes[10] = new Chofer("ch11", "Eva", 10.0);
		this.choferes[11] = new Chofer("ch12", "Rodolfo", 10.0);
		this.choferes[12] = new Chofer("ch13", "Ines", 10.0);
		this.choferes[13] = new Chofer("ch14", "Noelia", 10.0);
		this.choferes[14] = new Chofer("ch15", "Blanca", 10.0);
		this.choferes[15] = new Chofer("ch16", "Juan", 10.0);
		this.choferes[16] = new Chofer("ch17", "Luis", 10.0);
		this.choferes[17] = new Chofer("ch18", "Isabel", 10.0);
		this.choferes[18] = new Chofer("ch19", "Nicolas", 10.0);
		this.choferes[19] = new Chofer("ch20", "Julian", 10.0);
	}

	public void agregarViaje(Viaje viaje) {
		this.viajes.add(viaje);
	}
}
