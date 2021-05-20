package edu.ort.u3.tp3.tp3_comercio_informatico.src;

public class ServicioDeArmado extends Servicio {
	private static double VALOR_HORA = 250;

	public ServicioDeArmado(double catHoras) {
		super(catHoras);
		setPrecio();
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio() {
		this.precio = VALOR_HORA * getCatHoras();
	}

	@Override
	public String toString() {
		return "ServicioDeArmado [precio=" + precio + ", getPrecio()=" + getPrecio();
	}

}
