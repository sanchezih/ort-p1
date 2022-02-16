package ar.edu.ort.p1.examenes.ortcapital.src;

public abstract class Solicitud {

	private long nroSolicitud;
	private int cantidad;
	private double precioOfertado;
	private Titulo titulo;
	private Persona solicitante;

	public Solicitud(long nroSolicitud, int cantidad, double precioOfertado, Titulo titulo, Persona solicitante) {
		this.nroSolicitud = nroSolicitud;
		this.cantidad = cantidad;
		this.precioOfertado = precioOfertado;
		this.titulo = titulo;
		this.solicitante = solicitante;
	}

	public abstract boolean sePuedeConcretar();

	public Titulo getTitulo() {
		return titulo;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioOfertado() {
		return precioOfertado;
	}

	public void setPrecioOfertado(double precioOfertado) {
		this.precioOfertado = precioOfertado;
	}

	public TipoTitulo getTipoTitulo() {
		return titulo.getTipoTitulo();
	}

	public double getPrecioTitulo() {
		return titulo.getPrecio();
	}

	@Override
	public String toString() {
		return "Solicitud [nroSolicitud=" + nroSolicitud + ", cantidad=" + cantidad + ", precioOfertado="
				+ precioOfertado + ", titulo=" + titulo + ", solicitante=" + solicitante + "]";
	}

}
