/*
 * ProfesorTitular lo hemos dejado con escaso contenido porque aquí lo usamos
 * solo a modo de ejemplo de uso de clases abstractas y herencia. Su único
 * cometido es mostrar que existe otra subclase de Profesor.
 */

package abs.ejemplo01.src;

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
