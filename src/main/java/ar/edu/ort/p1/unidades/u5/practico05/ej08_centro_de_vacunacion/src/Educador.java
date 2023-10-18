package ar.edu.ort.p1.unidades.u5.practico05.ej08_centro_de_vacunacion.src;

public class Educador extends Persona {

	private NivelDeEducacion nivelDeEducacion;

	/*----------------------------------------------------------------------------*/

	// Constructores
	
	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param edad
	 * @param esPacienteDeRiesgo
	 * @param nivelDeEducacion
	 */
	public Educador(String dni, String nombre, int edad, boolean esPacienteDeRiesgo,
			NivelDeEducacion nivelDeEducacion) {
		super(dni, nombre, edad, esPacienteDeRiesgo);
		this.nivelDeEducacion = nivelDeEducacion;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public int getPrioridad() {
		int prioridad = PRIORIDAD_MEDIA;
		
		if ((super.getPrioridad() == PRIORIDAD_MAXIMA) || this.nivelDeEducacion == NivelDeEducacion.INICIAL) {
			prioridad = PRIORIDAD_MAXIMA;
		}
		return prioridad;
	}

	@Override
	public String toString() {
		return super.toString() + "Educador [nivelDeEducacion=" + nivelDeEducacion + "]";
	}

}
