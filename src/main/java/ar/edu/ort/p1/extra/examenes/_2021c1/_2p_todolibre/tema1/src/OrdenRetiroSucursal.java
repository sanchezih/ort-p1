package ar.edu.ort.p1.extra.examenes._2021c1._2p_todolibre.tema1.src;

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
