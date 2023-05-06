package ar.edu.ort.p1.examenes.ds.ortcapital.src;

public class AgenteDeBolsa extends Persona {

	private final static int CANT_MAX_SOLICITUDES = 3;
	private String matriculaCNV;
	private ColaDeSolicitudes colaDeSolicitudes;

	public AgenteDeBolsa(String nombre, String apellido, String dni, String matriculaCNV) {
		super(nombre, apellido, dni);
		this.matriculaCNV = matriculaCNV;
		this.colaDeSolicitudes = new ColaDeSolicitudes(CANT_MAX_SOLICITUDES);
	}

	public String getMatriculaCNV() {
		return matriculaCNV;
	}

	public void setMatriculaCNV(String matriculaCNV) {
		this.matriculaCNV = matriculaCNV;
	}

	/**
	 * Metodo que evalua si un agente puede tomar una solicitud o no
	 * 
	 * @return
	 */
	public boolean puedeTomarSolicitud() {

		boolean puedeTomarSolicitud = false;

		Solicitud solicitudCentinela = null;
		Solicitud solicitud = null;

		colaDeSolicitudes.add(solicitudCentinela);

		if (!colaDeSolicitudes.isFull()) {
			puedeTomarSolicitud = true;
		}

		solicitud = colaDeSolicitudes.remove();
		while (solicitud != solicitudCentinela) {
			colaDeSolicitudes.add(solicitud);
			solicitud = colaDeSolicitudes.remove();
		}
		return puedeTomarSolicitud;
	}

	public void tomarSolicitud(Solicitud solicitud) {
		colaDeSolicitudes.add(solicitud);
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public int[] cantSolicitudesPorTipoTitulo() {
		int[] vector = new int[TipoTitulo.values().length];
		Solicitud solicitudCentinela = null;

		colaDeSolicitudes.add(solicitudCentinela);
		Solicitud solicitud = colaDeSolicitudes.remove();

		while (solicitud != solicitudCentinela) {
			vector[solicitud.getTipoTitulo().ordinal()]++;
			colaDeSolicitudes.add(solicitud);
			solicitud = colaDeSolicitudes.remove();
		}
		return vector;
	}

	/*----------------------------------------------------------------------------*/

	public void llenarListaDeSolicitudesDeCompra(ListaOrdenadaDeSolicitudesPorPrecioOfertado lista) {
		Solicitud solicitudCentinela = null;
		colaDeSolicitudes.add(solicitudCentinela);
		Solicitud solicitud = colaDeSolicitudes.remove();

		while (solicitud != solicitudCentinela) {
			if (solicitud instanceof SolicitudDeCompra) {
				lista.add(solicitud);
			}
			colaDeSolicitudes.add(solicitud);
			solicitud = colaDeSolicitudes.remove();
		}
	}

}
