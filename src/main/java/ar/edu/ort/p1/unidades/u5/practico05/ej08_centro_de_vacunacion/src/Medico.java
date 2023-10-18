package ar.edu.ort.p1.unidades.u5.practico05.ej08_centro_de_vacunacion.src;

public class Medico extends Persona {

	private String matricula;

	/*----------------------------------------------------------------------------*/

	// Constructores

	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param edad
	 * @param esPacienteDeRiesgo
	 * @param matricula
	 */
	public Medico(String dni, String nombre, int edad, boolean esPacienteDeRiesgo, String matricula) {
		super(dni, nombre, edad, esPacienteDeRiesgo);
		this.matricula = matricula;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public int getPrioridad() {
		return PRIORIDAD_MAXIMA;
	}

	@Override
	public String toString() {
		return super.toString() + "Medico [matricula=" + matricula + "]";
	}

}
