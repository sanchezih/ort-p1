package ar.edu.ort.p1.u1.ejemplos.enums._03_metodos.src;

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
