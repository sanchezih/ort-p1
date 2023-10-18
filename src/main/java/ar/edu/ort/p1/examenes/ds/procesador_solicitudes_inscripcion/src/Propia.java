package ar.edu.ort.p1.examenes.ds.procesador_solicitudes_inscripcion.src;

public class Propia extends Sede {

	private ListaOrdenadPorPromedio listaSolicitudes;

	public Propia(String nombre, String direccion) {
		super(nombre, direccion);
		this.listaSolicitudes = new ListaOrdenadPorPromedio();
	}

	@Override
	protected void agregarSolicitud(Solicitud solicitud) {
		this.listaSolicitudes.add(solicitud);
	}

}
