package ar.edu.ort.p1.unidades.u5.practico05.ej08_centro_vacunacion.src;

public class Medico extends Persona {

	private String matricula;

	/*----------------------------------------------------------------------------*/

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
		this.setMatricula(matricula);
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public int getPrioridad() {
		return PRIORIDAD_MAXIMA;
	}

	private void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return super.toString() + "Medico [matricula=" + matricula + "]";
	}

}
