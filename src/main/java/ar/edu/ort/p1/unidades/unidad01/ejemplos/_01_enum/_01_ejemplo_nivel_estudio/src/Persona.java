package ar.edu.ort.p1.unidades.unidad01.ejemplos._01_enum._01_ejemplo_nivel_estudio.src;

public class Persona {

	private String nombre;
	private String apellido;
	private NivelDeEstudio nivelDeEstudio;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param nivelDeEstudio
	 */
	public Persona(String nombre, String apellido, NivelDeEstudio nivelDeEstudio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nivelDeEstudio = nivelDeEstudio;
	}

	/*----------------------------------------------------------------------------*/

	public NivelDeEstudio getNivelDeEstudio() {
		return nivelDeEstudio;
	}

	@Override
	public String toString() {
		return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nivelDeEstudio=" + nivelDeEstudio + '}';
	}

}
