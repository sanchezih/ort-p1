package ar.edu.ort.p1.examenes._02_ds.municipalidad_solicitudes.src;

public class Poda extends Solicitud {

	private static final int MULTIPLICADOR = 7;
	private static final int DIAS_VTO = 180;

	/*----------------------------------------------------------------------------*/

	public Poda(double costoBase, Fecha fecha) {
		super(costoBase, fecha);
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public boolean vencido() {
		System.out.println("Solicitud con fecha de contacto: " + super.getFecha() + " (Dias transcurridos: "
				+ super.getFecha().cantidadDiasHastaHoy() + ")");

		return super.getFecha().cantidadDiasHastaHoy() > Poda.DIAS_VTO;
	}

	@Override
	public double costo() {
		return Poda.MULTIPLICADOR * getCostoBase();
	}

	@Override
	public String toString() {
		return "Poda [" + super.toString() + "]";
	}

}
