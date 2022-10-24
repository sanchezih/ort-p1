package ar.edu.ort.p1.unidades.u5.practico05.ej08_centro_vacunacion.src;

public class Educador extends Persona {

	private NivelEducacion nivelEducacion;

	public Educador(String dni, String nombre, int edad, boolean pacRiesgo, NivelEducacion nivelEducacion) {
		super(dni, nombre, edad, pacRiesgo);
		this.nivelEducacion = nivelEducacion;
	}

	@Override
	public int getPrioridad() {
		int prioridad = PRIORIDAD_MEDIA;
		if ((super.getPrioridad() == PRIORIDAD_MAXIMA) || this.nivelEducacion == NivelEducacion.INICIAL) {
			prioridad = PRIORIDAD_MAXIMA;
		}
		return prioridad;
	}

	@Override
	public String toString() {
		return super.toString() + "Educador [nivelEducacion=" + nivelEducacion + "]";
	}

}
