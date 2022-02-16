package ar.edu.ort.p1.examenes.ortcapital.src;

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
