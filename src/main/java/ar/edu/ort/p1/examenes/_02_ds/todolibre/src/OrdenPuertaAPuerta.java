package ar.edu.ort.p1.examenes._02_ds.todolibre.src;

public class OrdenPuertaAPuerta extends Orden {

	private boolean envioGratis;

	/*----------------------------------------------------------------------------*/

	public OrdenPuertaAPuerta(long numero, String fecha, double monto, Usuario vendedor, Usuario comprador,
			boolean envioGratis) {
		super(numero, fecha, monto, vendedor, comprador);
		this.envioGratis = envioGratis;
	}

	/*----------------------------------------------------------------------------*/

	public boolean hasEnvioGratis() {
		return envioGratis;
	}

	@Override
	public Domicilio getDomicilioEntrega() {
		return this.getComprador().getDomicilio();
	}

	@Override
	public String toString() {
		return super.toString() + " OrdenPuertaAPuerta [envioGratis=" + envioGratis + "]";
	}

}
