package ar.edu.ort.p1.unidades.u3.practico03.ej11_comercio_informatico.src;

public class ServicioArmado extends Servicio {

	private static final double VALOR_HORA = 250;

	public ServicioArmado(int cantHoras) {
		super(cantHoras);
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public double getValorHora() {
		return VALOR_HORA;
	}

}
