package ar.edu.ort.p1.examenes._02_ds.festival_cine_independiente.src;

public interface Nomina {
	boolean hayDisponibilidad();

	Acreditacion obtenerAcreditacion(int dni);

	int getCantidadDeAcreditaciones();

	void agregarAcreditacion(Acreditacion acreditacion);
}
