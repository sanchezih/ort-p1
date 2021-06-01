package edu.ort.u5.tp5.ej01_dvds;

public class DVD {
	private String marca;
	private boolean rayado;

	public DVD(String marca, boolean rayado) {
		super();
		this.marca = marca;
		this.rayado = rayado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setRayado(boolean rayado) {
		this.rayado = rayado;
	}

	public boolean isRayado() {
		return rayado;

	}

}
