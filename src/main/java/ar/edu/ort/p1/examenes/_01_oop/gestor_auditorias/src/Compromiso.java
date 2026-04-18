package ar.edu.ort.p1.examenes._01_oop.gestor_auditorias.src;

import com.github.sanchezih.util.Fecha;

public class Compromiso {

	private String descripcion;
	private Fecha fechaCompromiso;

	/*----------------------------------------------------------------------------*/

	public Compromiso(String descripcion, Fecha fechaCompromiso) {
		this.descripcion = descripcion;
		this.fechaCompromiso = fechaCompromiso;
	}

	/*----------------------------------------------------------------------------*/

	public Fecha getFechaCompromiso() {
		return fechaCompromiso;
	}

}
