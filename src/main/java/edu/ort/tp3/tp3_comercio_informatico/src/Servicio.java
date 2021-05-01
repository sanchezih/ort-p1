package edu.ort.tp3.tp3_comercio_informatico.src;

public abstract class Servicio implements Facturable {
	private double catHoras;
	protected double precio = 0;

	public Servicio(double catHoras) {
		super();
		this.catHoras = catHoras;
	}

	public double getCatHoras() {
		return catHoras;
	}

	public void setCatHoras(double catHoras) {
		this.catHoras = catHoras;
	}

	public double getPrecio() {
		return precio;
	}

	public abstract void setPrecio();

	public double getMontoFacturacion() {
		return Matematica.sumarPorcentaje(getPrecio(), (IVA / 2));
	}
}
