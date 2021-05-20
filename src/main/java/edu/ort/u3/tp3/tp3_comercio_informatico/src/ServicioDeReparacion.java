package edu.ort.u3.tp3.tp3_comercio_informatico.src;

public class ServicioDeReparacion extends Servicio {
	private final double VALOR_HORA = 180;
	private final int PUNTO_CORTE_DIFICULTAD = 3;
	private double nivelDificultad;

	public ServicioDeReparacion(double cantHoras, double nivelDificultad) {
		super(cantHoras);
		this.nivelDificultad = nivelDificultad;
		setPrecio();
	}

	public double getNivelDificultad() {
		return nivelDificultad;
	}

	public void setNivelDificultad(double nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}

	@Override
	public void setPrecio() {
		double precioInicial = VALOR_HORA * getCatHoras();
		if (this.nivelDificultad > PUNTO_CORTE_DIFICULTAD) {
			precio = Matematica.sumarPorcentaje(precioInicial, 25);
		} else {
			precio = precioInicial;
		}
	}

	@Override
	public String toString() {
		return "ServicioDeReparacion [VALOR_HORA=" + VALOR_HORA + ", nivelDificultad=" + nivelDificultad + ", precio="
				+ precio + ", getCatHoras()=" + getCatHoras() + ", getPrecio()=" + getPrecio()
				+ ", getMontoFacturacion()=" + getMontoFacturacion() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}