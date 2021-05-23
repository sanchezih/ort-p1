package edu.ort.u4.tp4.ej05_camiones.src.empresa;

public class Camion {
	private int ID;
	private double costoXKm;

	public Camion(int iD, double costoXKm) {
		super();
		ID = iD;
		this.costoXKm = costoXKm;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getCostoXKm() {
		return costoXKm;
	}

	public void setCostoXKm(double costoXKm) {
		this.costoXKm = costoXKm;
	}

}
