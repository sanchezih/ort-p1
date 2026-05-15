package ar.edu.ort.p1.unidades.unidad05.practico05.ej08_centro_de_vacunacion.src;

public class Persona implements Vacunable {

	private static final int EDAD_MINIMA = 30;
	private static final int EDAD_MAXIMA = 60;

	private String dni;
	private String nombre;
	private int edad;
	private boolean esPacienteDeRiesgo;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param edad
	 * @param esPacienteDeRiesgo
	 */
	public Persona(String dni, String nombre, int edad, boolean esPacienteDeRiesgo) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.esPacienteDeRiesgo = esPacienteDeRiesgo;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public int getPrioridad() {
		int prioridad = PRIORIDAD_MEDIA;

		if (this.esPacienteDeRiesgo || this.edad > EDAD_MAXIMA) {
			prioridad = PRIORIDAD_MAXIMA;
		} else if (this.edad <= EDAD_MINIMA) {
			prioridad = PRIORIDAD_MINIMA;
		}
		return prioridad;
	}

	@Override
	public String toString() {
		return "Prioridad: " + getPrioridad() + " Persona [DNI=" + dni + ", Nombre=" + nombre + ",\tedad=" + edad
				+ ", esPacienteDeRiesgo=" + esPacienteDeRiesgo + "]\t";
	}

}
