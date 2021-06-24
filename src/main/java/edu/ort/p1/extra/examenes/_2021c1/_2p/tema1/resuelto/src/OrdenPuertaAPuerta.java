package edu.ort.p1.extra.exa._2021c1._2p.tema1.resuelto.src;

public class OrdenPuertaAPuerta extends Orden {
	private boolean envioGratis;

	public OrdenPuertaAPuerta(long numero, String fecha, double monto, Usuario vendedor, Usuario comprador,
			boolean envioGratis) {
		super(numero, fecha, monto, vendedor, comprador);
		this.envioGratis = envioGratis;
	}

	public boolean hasEnvioGratis() {
		return envioGratis;
	}

	public void setEnvioGratis(boolean envioGratis) {
		this.envioGratis = envioGratis;
	}

	@Override
	public Domicilio getDomicilioEntrega() {
		return getComprador().getDomicilio();
	}

	@Override
	public String toString() {
		return super.toString() + " OrdenPuertaAPuerta [envioGratis=" + envioGratis + "]";
	}

}
