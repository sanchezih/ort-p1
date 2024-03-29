
package ar.edu.ort.p1.unidades.unidad03.ejemplos._03_polimorfismo_basado_en_herencia._01_profesores_universitarios.src;

/**
 * ProfesorTitular lo hemos dejado con escaso contenido porque aqui lo usamos
 * solo a modo de ejemplo de uso de clases abstractas y herencia. Su unico
 * cometido es mostrar que existe otra subclase de Profesor.
 */
public class ProfesorTitular extends Profesor {

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param id
	 */
	public ProfesorTitular(String nombre, String apellido, int edad, String id) {
		super(nombre, apellido, edad, id);
	}

	/**
	 * Metodo abstracto sobreescrito
	 */
	@Override
	public float importeSalario() {
		return 30f * 12f;
	}

}
