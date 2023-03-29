package ar.edu.ort.p1.unidades.u3.ejemplos._03_polimorfismo_basado_en_herencia._01_profesores_universitarios.src;

public abstract class Profesor extends Persona {

	private String idProfesor;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public Profesor() {
		super();
		this.idProfesor = "Unknown";
	}

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param id
	 */
	public Profesor(String nombre, String apellido, int edad, String id) {
		super(nombre, apellido, edad);
		this.idProfesor = id;
	}

	/*----------------------------------------------------------------------------*/

	public String getIdProfesor() {
		return this.idProfesor;
	}

	public void mostrarDatos() {
		System.out.println("Datos Profesor. Profesor de nombre: " + getNombre() + " " + getApellido()
				+ " con id de profesor: " + getIdProfesor());
	}

	@Override
	public String toString() {
		return super.toString().concat("\nid: ").concat(this.idProfesor);
	}

	/**
	 * Metodo abstracto que se debe implementar obligatoriamente en las subclases
	 */
	public abstract float importeSalario();

}