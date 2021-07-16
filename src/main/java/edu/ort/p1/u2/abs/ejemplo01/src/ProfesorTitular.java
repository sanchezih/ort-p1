/*
 * ProfesorTitular lo hemos dejado con escaso contenido porque aqu� lo usamos
 * solo a modo de ejemplo de uso de clases abstractas y herencia. Su �nico
 * cometido es mostrar que existe otra subclase de Profesor.
 */

package edu.ort.p1.u2.abs.ejemplo01.src;

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
