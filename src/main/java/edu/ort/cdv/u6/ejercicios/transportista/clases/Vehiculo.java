package edu.ort.cdv.u6.ejercicios.transportista.clases;

public class Vehiculo {
	private String patente;
	private TipoVehiculo tipoVehiculo;
	private double capacidadDeCarga;
	private Chofer choferACargo;
	private Carga cargaAsignada;
	
	public Vehiculo(String patente, TipoVehiculo tipoVehiculo, double capacidadDeCarga) {
		this.setPatente(patente);
		this.setTipoVehiculo(tipoVehiculo);
		this.setCapacidadDeCarga(capacidadDeCarga);
		this.setChoferACargo(null);
		this.setCargaAsignada(null);
	}

	public double getCapacidadDeCarga() {
		return capacidadDeCarga;
	}

	public Carga getCargaAsignada() {
		return cargaAsignada;
	}

	public Chofer getChoferACargo() {
		return choferACargo;
	}

	public String getNombreChofer() {
		return (choferACargo == null) ? "Ninguno" : choferACargo.getNombre();
	}

	public String getPatente() {
		return patente;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	private void setCapacidadDeCarga(double capacidadDeCarga) {
		if (capacidadDeCarga <= 0) {
			throw new IllegalArgumentException("La capacidad de carga debe ser mayor a cero.");
		}
		this.capacidadDeCarga = capacidadDeCarga;
	}

	void setCargaAsignada(Carga cargaAsignada) {
		this.cargaAsignada = cargaAsignada;
	}

	void setChoferACargo(Chofer choferACargo) {
		this.choferACargo = choferACargo;
	}

	private void setPatente(String patente) {
		if (patente == null || patente.isEmpty()) {
			throw new IllegalArgumentException("La patente no puede estar vacia.");
		}
		this.patente = patente;
	}

	private void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", tipoVehiculo=" + tipoVehiculo + ", capacidadDeCarga="
				+ capacidadDeCarga + ", choferACargo=" + choferACargo + ", cargaAsignada=" + cargaAsignada + "]";
	}

}
