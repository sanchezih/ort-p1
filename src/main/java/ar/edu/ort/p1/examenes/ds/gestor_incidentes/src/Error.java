package ar.edu.ort.p1.examenes.ds.gestor_incidentes.src;

import java.util.ArrayList;

public abstract class Error extends Ticket {
	private String descripcion;
	private String nombrePersonaQueLoDetecto;
	private ArrayList<String> casosDePrueba;

	public Error(String nombreCliente, String unidadNegocio, String fechaCarga, String titulo,
			Empleado empleadoQueLoReporto, String descripcion, String nombrePersonaQueLoDetecto) {
		super(nombreCliente, unidadNegocio, fechaCarga, titulo, empleadoQueLoReporto);
		this.descripcion = descripcion;
		this.nombrePersonaQueLoDetecto = nombrePersonaQueLoDetecto;
		this.casosDePrueba = new ArrayList<String>();
	}

}
