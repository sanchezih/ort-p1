package ar.edu.ort.p1.examenes._02_ds.gestor_incidentes.src;

public abstract class Ticket implements Priorizable, Estimable {

	private final static int HS_ALTA = 16;
	private final static int HS_MEDIA = 24;
	private String nombreCliente;
	private String unidadNegocio;
	private String fechaCarga;
	private String titulo;
	private Empleado empleadoQueLoReporto;

	public Ticket(String nombreCliente, String unidadNegocio, String fechaCarga, String titulo,
			Empleado empleadoQueLoReporto) {
		super();
		this.nombreCliente = nombreCliente;
		this.unidadNegocio = unidadNegocio;
		this.fechaCarga = fechaCarga;
		this.titulo = titulo;
		this.empleadoQueLoReporto = empleadoQueLoReporto;
	}

}
