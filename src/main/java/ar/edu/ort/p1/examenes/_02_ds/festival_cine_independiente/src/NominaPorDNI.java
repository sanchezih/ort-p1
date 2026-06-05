package ar.edu.ort.p1.examenes._02_ds.festival_cine_independiente.src;

public class NominaPorDNI implements Nomina {

	private ListaDeAcreditacionesPorDniAsc acreditaciones;

	/*----------------------------------------------------------------------------*/

	public NominaPorDNI(int limite) {
		this.acreditaciones = new ListaDeAcreditacionesPorDniAsc(limite);
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public boolean hayDisponibilidad() {
		return !this.acreditaciones.isFull();
	}

	@Override
	public Acreditacion obtenerAcreditacion(int dni) {
		return this.acreditaciones.search(dni);
	}

	@Override
	public int getCantidadDeAcreditaciones() {
		return this.acreditaciones.size();
	}

	@Override
	public void agregarAcreditacion(Acreditacion acreditacion) {
		this.acreditaciones.add(acreditacion);
	}

}
