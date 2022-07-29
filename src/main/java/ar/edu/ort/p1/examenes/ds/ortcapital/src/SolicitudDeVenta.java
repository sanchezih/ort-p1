package ar.edu.ort.p1.examenes.ds.ortcapital.src;

import ar.edu.ort.p1.util.pojo.Persona;

public class SolicitudDeVenta extends Solicitud {

	private final static double MONTO_MAX_TRANSACCION = 10000000;

	public SolicitudDeVenta(long nroSolicitud, int cantidad, double precioOfertado, Titulo titulo,
			Persona solicitante) {
		super(nroSolicitud, cantidad, precioOfertado, titulo, solicitante);
	}

	@Override
	public boolean sePuedeConcretar() {
		boolean cumpleCircularBCRA = true;
		if (getTipoTitulo() == TipoTitulo.BONO) {
			cumpleCircularBCRA = (getCantidad() * getPrecioOfertado()) <= MONTO_MAX_TRANSACCION;
		}
		return cumpleCircularBCRA && getPrecioOfertado() <= getPrecioTitulo();
	}

}
