package ar.edu.ort.p1.examenes.gestion_tareas.src;

import java.util.ArrayList;

public class ErrorInterno extends Error {

	private final static int TIEMPO = 40;
	private String nombreDelTestQueLoDetecto;

	public ErrorInterno(String ambiente, ArrayList<String> casosDePrueba, String nombreDelTestQueLoDetecto) {
		super(ambiente, casosDePrueba);
		this.nombreDelTestQueLoDetecto = nombreDelTestQueLoDetecto;
	}

	@Override
	public int obtenerTiempoDeResolucion() {
		return TIEMPO;
	}

}
