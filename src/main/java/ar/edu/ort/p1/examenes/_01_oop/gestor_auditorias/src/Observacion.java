package ar.edu.ort.p1.examenes._01_oop.gestor_auditorias.src;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import ar.edu.ort.p1.util.Fecha;

public abstract class Observacion {

	private final static int NIVEL_CRITICO = 1;

	private String titulo;
	private String descripcion;
	private Empleado auditor;
	private Fecha fechaAlta;
	private Auditable auditable;
	private List<Compromiso> compromisos;

	/*----------------------------------------------------------------------------*/

	public Observacion(String titulo, String descripcion, Empleado auditor, Fecha fechaAlta, Auditable auditable) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.auditor = auditor;
		this.fechaAlta = fechaAlta;
		this.auditable = auditable;
		this.compromisos = new ArrayList<Compromiso>();
	}

	/*----------------------------------------------------------------------------*/

	public boolean esCritica() {
		return auditable.getNivelCriticidad() >= NIVEL_CRITICO;
	}

	public void mostrar() {
		System.out.println("\tTitulo: " + titulo + "\n\tDescripcion: " + descripcion);
		auditor.mostrar();
		System.out.println();
	}

	/**
	 * 
	 * @param cantidadDias
	 * @return
	 */
	protected Compromiso buscarCompromisoVencido(int cantidadDias) {
		int i = 0;
		Compromiso compromisoEncontrado = null;

		while (i < compromisos.size() && compromisoEncontrado == null) {
			if (compromisos.get(i).getFechaCompromiso().getCantidadDiasHastaHoy() > cantidadDias) {
				compromisoEncontrado = compromisos.get(i);
			}
			i++;
		}
		return compromisoEncontrado;
	}

	/**
	 * 
	 * @return
	 */
	public abstract boolean estaVencida();

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Observacion [titulo=" + titulo + ", descripcion=" + descripcion + ", auditor=" + auditor
				+ ", fechaAlta=" + fechaAlta + ", auditable=" + auditable + ", compromisos=" + compromisos + "]";
	}

	public void agregarCompromiso(Compromiso compromiso) {
		this.compromisos.add(compromiso);
	}

	public String mostrarGson() {
		Gson gson = new Gson();
		return "Observacion: " + gson.toJson(this, Observacion.class);
	}

}
