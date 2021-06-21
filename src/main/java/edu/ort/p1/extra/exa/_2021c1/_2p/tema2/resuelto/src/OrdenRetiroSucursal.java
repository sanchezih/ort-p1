package edu.ort.p1.extra.exa._2021c1._2p.tema2.resuelto.src;

import java.util.ArrayList;

public class OrdenRetiroSucursal extends Orden {

	private String nombreSucursal;
	private boolean trabajaSabados;

	public OrdenRetiroSucursal(long numero, String fecha, double monto, ArrayList<ItemOrden> items,
			String nombreSucursal, boolean trabajaSabados) {
		super(numero, fecha, monto, items);
		this.nombreSucursal = nombreSucursal;
		this.trabajaSabados = trabajaSabados;
	}

	public String getNombreSucursal() {
		return nombreSucursal;
	}

	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}

	public boolean isTrabajaSabados() {
		return trabajaSabados;
	}

	public void setTrabajaSabados(boolean trabajaSabados) {
		this.trabajaSabados = trabajaSabados;
	}

	@Override
	public String toString() {
		return super.toString()+"OrdenRetiroSucursal [nombreSucursal=" + nombreSucursal + ", trabajaSabados=" + trabajaSabados + "]";
	}

}
