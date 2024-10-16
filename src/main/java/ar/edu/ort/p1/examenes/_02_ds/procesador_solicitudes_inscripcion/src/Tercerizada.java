package ar.edu.ort.p1.examenes._02_ds.procesador_solicitudes_inscripcion.src;

public class Tercerizada extends Sede {

	private ColaDeSolicitudes colaSolicitudes;
	private String nombreInstitucion;

	public Tercerizada(String nombre, String direccion) {
		super(nombre, direccion);
		this.colaSolicitudes = new ColaDeSolicitudes();
		this.nombreInstitucion = nombreInstitucion;
	}

	@Override
	protected void agregarSolicitud(Solicitud solicitud) {
		this.colaSolicitudes.add(solicitud);
	}

}
