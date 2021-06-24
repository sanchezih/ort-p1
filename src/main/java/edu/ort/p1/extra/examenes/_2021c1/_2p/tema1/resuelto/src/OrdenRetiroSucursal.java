package edu.ort.p1.extra.exa._2021c1._2p.tema1.resuelto.src;

public class OrdenRetiroSucursal extends Orden {

	private SucursalCorreo sucursalCorreo;

	public OrdenRetiroSucursal(long numero, String fecha, double monto, Usuario vendedor, Usuario comprador) {
		super(numero, fecha, monto, vendedor, comprador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Domicilio getDomicilioEntrega() {
		return this.sucursalCorreo.getDomicilio();
	}

}
