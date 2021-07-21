package ar.edu.ort.p1.extra.muestraenums.muestra_metodos_enum_java;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 *         https://www.youtube.com/c/CharlyCimino Encontrá más código en mi
 *         repo de GitHub: https://github.com/CharlyCimino
 */
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
