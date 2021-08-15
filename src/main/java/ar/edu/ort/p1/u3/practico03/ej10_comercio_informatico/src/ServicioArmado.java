package ar.edu.ort.p1.u3.practico03.ej10_comercio_informatico.src;

public class ServicioArmado extends Servicio {

	private static double VALOR_POR_HORA = 250;

	public ServicioArmado(int cantidadDeHoras) {
		super(cantidadDeHoras);
	}

	@Override
	public double getValorHora() {
		return VALOR_POR_HORA;
	}

}
