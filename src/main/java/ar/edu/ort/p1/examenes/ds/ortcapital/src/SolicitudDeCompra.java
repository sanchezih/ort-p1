package ar.edu.ort.p1.examenes.ds.ortcapital.src;

import ar.edu.ort.p1.util.pojo.Persona;

public class SolicitudDeCompra extends Solicitud {

	private final static double INDICE = 1.10;

	public SolicitudDeCompra(long nroSolicitud, int cantidad, double precioOfertado, Titulo titulo,
			Persona solicitante) {
		super(nroSolicitud, cantidad, precioOfertado, titulo, solicitante);
	}

	@Override
	public boolean sePuedeConcretar() {
		return getPrecioOfertado() > getPrecioTitulo() * INDICE;
	}

}
