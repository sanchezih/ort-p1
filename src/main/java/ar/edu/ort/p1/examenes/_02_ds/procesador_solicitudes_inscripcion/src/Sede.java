package ar.edu.ort.p1.examenes._02_ds.procesador_solicitudes_inscripcion.src;

import java.util.Arrays;

public abstract class Sede implements Procesable {

	private String nombre;
	private String direccion;
	private int[] vacantes;

	public Sede(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.vacantes = new int[Turno.values().length];

		for (int i = 0; i < Turno.values().length; i++) {
			this.vacantes[i] = 10;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public int getVacantes(Turno turno) {
		return this.vacantes[turno.ordinal()];
	}

	@Override
	public void procesarSolicitud(Solicitud solicitud) {
		solicitud.confirmar();
		agregarSolicitud(solicitud);
		this.vacantes[solicitud.getTurno().ordinal()]--;
	}

	public boolean hayVacante(Turno t) {
		return this.vacantes[t.ordinal()] != 0;
	}

	protected abstract void agregarSolicitud(Solicitud solicitud);

	@Override
	public String toString() {
		return "Sede [nombre=" + nombre + ", vacantes=" + Arrays.toString(vacantes) + "]";
	}
	
	
}
