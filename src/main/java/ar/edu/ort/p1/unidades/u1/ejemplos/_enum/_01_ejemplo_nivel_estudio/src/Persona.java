package ar.edu.ort.p1.unidades.u1.ejemplos._enum._01_ejemplo_nivel_estudio.src;

public class Persona {

	private String nombre;
	private String apellido;
	private NivelEstudio nivelEstudio;

	public Persona(String nombre, String apellido, NivelEstudio nivelEstudio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nivelEstudio = nivelEstudio;
	}

	public NivelEstudio getNivelEstudio() {
		return nivelEstudio;
	}

	@Override
	public String toString() {
		return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nivelEstudio=" + nivelEstudio + '}';
	}

}
