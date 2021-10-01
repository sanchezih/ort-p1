package ar.edu.ort.p1.extra.examenes._2021c2._1p_gestionauditorias.tema1.src;

import java.util.ArrayList;

import ar.edu.ort.p1.util.Fecha;

public abstract class Observacion {
	private final static int NIVEL_CRITICO = 1;
	private String titulo;
	private String descripcion;
	private Empleado auditor;
	private Fecha fechaAlta;
	private Auditable auditable;
	private ArrayList<Compromiso> compromisos;

	/*----------------------------------------------------------------------------*/

	public boolean esCritica() {
		return false;
	}

	public void mostrar() {
		System.out.println("Titulo: " + titulo + " Descripcion: " + descripcion);
	}

	protected Compromiso buscarCompromisoVencido(int cantidadDias) {
		int i = 0;
		Compromiso compromisoEncontrado = null;
		while (i < compromisos.size() && compromisoEncontrado == null) {
			if (compromisos.get(i).getFechaCompromiso().restar() < cantidadDias) {
				compromisoEncontrado = compromisos.get(i);
				i++;
			}
		}
		return compromisoEncontrado;
	}

	public abstract boolean estaVencida();
}
