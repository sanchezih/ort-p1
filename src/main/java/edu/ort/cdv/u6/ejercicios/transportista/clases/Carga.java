package edu.ort.cdv.u6.ejercicios.transportista.clases;

public class Carga {
	private String descripcion;
	private double peso;

	public Carga(String descripcion, double peso) {
		this.setDescripcion(descripcion);
		this.setPeso(peso);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPeso() {
		return peso;
	}

	public void setDescripcion(String descripcion) {
		if (descripcion == null || descripcion.isEmpty()) {
			throw new IllegalArgumentException("La descripcion no puede estar vacia.");
		}
		this.descripcion = descripcion;
	}

	public void setPeso(double peso) {
		if (peso <= 0) {
			throw new IllegalArgumentException("La carga debe tener peso.");
		}
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Carga [descripcion=" + descripcion + ", peso=" + peso + "]";
	}

}
