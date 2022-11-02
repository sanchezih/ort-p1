
package ar.edu.ort.p1.unidades.u3.ejemplos._03_polimorfismo_basado_en_herencia.profesores.src;

/**
 * ProfesorTitular lo hemos dejado con escaso contenido porque aqui lo usamos
 * solo a modo de ejemplo de uso de clases abstractas y herencia. Su unico
 * cometido es mostrar que existe otra subclase de Profesor.
 */
public class ProfesorTitular extends Profesor {

	// Constructor
	public ProfesorTitular(String nombre, String apellido, int edad, String id) {
		super(nombre, apellido, edad, id);
	}

	// Metodo abstracto sobreescrito
	@Override
	public float importeSalario() {
		return 30f * 12f;
	}

}
