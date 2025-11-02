package ar.edu.ort.p1.examenes._02_ds.procesador_solicitudes_inscripcion.src;

public class Solicitud {

	private Alumno alumno;
	private int numero;
	private String nombreSede;
	private boolean confirmada = false;
	private Turno turno;

	public Solicitud(Alumno alumno, int numero, String nombreSede, Turno turno) {
		this.alumno = alumno;
		this.numero = numero;
		this.nombreSede = nombreSede;
		this.turno = turno;

	}

	public String getNombreSede() {
		return nombreSede;
	}

	public void confirmar() {
		this.confirmada = true;
	}

	public Turno getTurno() {
		return turno;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	@Override
	public String toString() {
		return "Solicitud [alumno=" + alumno + ", numero=" + numero + ", nombreSede=" + nombreSede + ", confirmada="
				+ confirmada + ", turno=" + turno + "]";
	}

	public int getZonaDeAlumno() {
		return this.getAlumno().getZona();
	}

}
