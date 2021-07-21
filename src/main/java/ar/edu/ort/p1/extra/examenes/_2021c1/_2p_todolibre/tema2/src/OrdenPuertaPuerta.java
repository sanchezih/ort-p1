package ar.edu.ort.p1.extra.examenes._2021c1._2p_todolibre.tema2.src;

import java.util.ArrayList;

public class OrdenPuertaPuerta extends Orden {

	private boolean envioGratis;

	public OrdenPuertaPuerta(long numero, String fecha, double monto, ArrayList<ItemOrden> items, boolean envioGratis) {
		super(numero, fecha, monto, items);
		this.envioGratis = envioGratis;
	}

	public boolean hasEnvioGratis() {
		return envioGratis;

	}

	public void setEnvioGratis(boolean envioGratis) {
		this.envioGratis = envioGratis;
	}

	@Override
	public String toString() {
		return super.toString()+"OrdenPuertaPuerta [envioGratis=" + envioGratis + "]";
	}

}
