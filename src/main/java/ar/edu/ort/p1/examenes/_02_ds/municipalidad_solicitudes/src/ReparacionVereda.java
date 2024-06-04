package ar.edu.ort.p1.examenes._02_ds.municipalidad_solicitudes.src;

public class ReparacionVereda extends Solicitud {

	private final static int MULTIPLICADOR = 10;

	/*----------------------------------------------------------------------------*/

	public ReparacionVereda(double costoBase, Fecha fecha) {
		super(costoBase, fecha);
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public boolean vencido() {
		return false;
	}

	@Override
	public double costo() {
		return ReparacionVereda.MULTIPLICADOR * getCostoBase();
	}

	@Override
	public String toString() {
		return "ReparacionVereda [" + super.toString() + "]";
	}
}
