package edu.ort.p1.extra.exa._2021c1._2p.tema2.leon.src;

public class ordenRetiroSucursal extends OrdenCompra {

	private String nombreSucursal;
	private boolean trabajaSabado;

	public ordenRetiroSucursal(String nombreSucursal, boolean trabajaSabado) {
		super();
		this.nombreSucursal = nombreSucursal;
		this.trabajaSabado = trabajaSabado;
	}

	public String getNombreSucursal() {
		return nombreSucursal;
	}

	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}

	public boolean isTrabajaSabado() {
		return trabajaSabado;
	}

	public void setTrabajaSabado(boolean trabajaSabado) {
		this.trabajaSabado = trabajaSabado;
	}

	@Override
	public int getPrioridad() {
		// TODO Auto-generated method stub
		return 0;
	}

}
