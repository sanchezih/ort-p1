package ar.edu.ort.p1.unidades.u3.ejemplos._01_clases_y_metodos_abstractos.src;

public abstract class Profesor extends Persona {

	private String idProfesor;

	// Constructores
	public Profesor() {
		super();
		idProfesor = "Unknown";
	}

	public Profesor(String nombre, String apellido, int edad, String id) {
		super(nombre, apellido, edad);
		idProfesor = id;
	}

	// Metodos
	public void setIdProfesor(String IdProfesor) {
		this.idProfesor = IdProfesor;
	}

	public String getIdProfesor() {
		return idProfesor;
	}

	public void mostrarDatos() {
		System.out.println("Datos Profesor. Profesor de nombre: " + getNombre() + " " + getApellido()
				+ " con id de profesor: " + getIdProfesor());
	}

	@Override
	public String toString() {
		return super.toString().concat("\nid: ").concat(idProfesor);
	}

	/**
	 * Metodo abstracto se debe implementar obligatoriamente en las subclases
	 */
	public abstract float importeSalario();

}