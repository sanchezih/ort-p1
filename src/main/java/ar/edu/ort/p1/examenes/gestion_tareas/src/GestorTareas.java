package ar.edu.ort.p1.examenes.gestion_tareas.src;

import java.util.ArrayList;

public class GestorTareas {

	private ColaDeTareas tareasSinAsignar;
	private ArrayList<Usuario> usuarios;

	public GestorTareas() {
		this.tareasSinAsignar = new ColaDeTareas();
		this.usuarios = new ArrayList<Usuario>();
	}

	/**
	 * Ejercicio B: El metodo reporteTiempoPromedioTareasPorPrioridad(), de la clase
	 * que corresponda, que debe devolver (no mostrar por consola) el tiempo
	 * promedio de las tareas por cada prioridad.
	 * 
	 * @return
	 */
	public double[] reporteTiempoPromedioTareasPorPrioridad() {
		Promedio[] promedios = new Promedio[Prioridad.values().length];
		Promedio promedio;
		Tarea centinela = new Desarrollo(null, 0);
		Tarea t;

		this.tareasSinAsignar.add(centinela);
		t = this.tareasSinAsignar.remove();

		while (t != centinela) {
			promedio = promedios[t.calcularPrioridad().ordinal()];
			if (promedio == null) {
				promedio = new Promedio();
				promedios[t.calcularPrioridad().ordinal()] = promedio;
			}
			promedio.incrementarPromedio(t.obtenerTiempoDeResolucion());
			this.tareasSinAsignar.add(t);
			t = this.tareasSinAsignar.remove();
		}
		return obtenerPromediosTotales(promedios);
	}

	private double[] obtenerPromediosTotales(Promedio[] promediosTotales) {
		double[] totales = new double[Prioridad.values().length];
		Promedio promedio;
		for (int i = 0; i < Prioridad.values().length; i++) {
			promedio = promediosTotales[i];
			if (promedio != null) {
				totales[i] = promedio.obtenerPromedio();
			}
		}
		return totales;
	}

	public double[] reporteTiempoPromedioTareasPorPrioridadConSwitch() {

		Tarea centinela = new Desarrollo(null, 0);
		Tarea tarea;
		int contAlta = 0;
		int acumAlta = 0;
		int contMedia = 0;
		int acumMedia = 0;
		int contBaja = 0;
		int acumBaja = 0;

		this.tareasSinAsignar.add(centinela);
		tarea = this.tareasSinAsignar.remove();

		while (tarea != centinela) {
			tarea.calcularPrioridad();

			switch (tarea.calcularPrioridad()) {
			case ALTA:
				contAlta++;
				acumAlta += tarea.obtenerTiempoDeResolucion();
				break;
			case MEDIA:
				contMedia++;
				acumMedia += tarea.obtenerTiempoDeResolucion();
				break;
			case BAJA:
				contBaja++;
				acumBaja += tarea.obtenerTiempoDeResolucion();
				break;
			}
			this.tareasSinAsignar.add(tarea);
			tarea = this.tareasSinAsignar.remove();
		}

		double[] array = new double[3];
		array[0] = contAlta == 0 ? 0 : acumAlta / contAlta;
		array[1] = contMedia == 0 ? 0 : acumMedia / contMedia;
		array[2] = contBaja == 0 ? 0 : acumBaja / contBaja;
		return array;
	}

	/**
	 * Ejercicio C: El metodo asignarTareas() de la clase que corresponda, que debe
	 * asignar a los usuarios todas las tareas disponibles (la estructura inicial
	 * debe quedar vacia tras la asignacion). La asignacion debe hacerse tal como se
	 * indico anteriormente.
	 */
	public void asignarTareas() {
		int i = 0;
		if (this.usuarios.size() != 0) {
			while (!this.tareasSinAsignar.isEmpty()) {
				/*
				 * Si la cantidad de tareas es mayor a los usuarios que tengo disponibles tengo
				 * que volver a empezar una vez que recorro todo el array
				 */
				if (i == this.usuarios.size()) {
					i = 0;
				}
				this.usuarios.get(i).agregarTarea(tareasSinAsignar.remove());
				i++;
			}
		}
	}

	/*----------------------------------------------------------------------------*/

	/* Metodos extra */

	public void agregarTarea(Tarea tarea) {
		this.tareasSinAsignar.add(tarea);
	}

	public void agregarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}

}
