package edu.ort.p1.u2.abs.ejemplo01.src;

public abstract class Profesor extends Persona {

	private String IdProfesor;

	// Constructores
	public Profesor() {
		super();
		IdProfesor = "Unknown";
	}

	public Profesor(String nombre, String apellido, int edad, String id) {
		super(nombre, apellido, edad);
		IdProfesor = id;
	}

	// Metodos
	public void setIdProfesor(String IdProfesor) {
		this.IdProfesor = IdProfesor;
	}

	public String getIdProfesor() {
		return IdProfesor;
	}

	public void mostrarDatos() {
		System.out.println("Datos Profesor. Profesor de nombre: " + getNombre() + " " + getApellido()
				+ " con Id de profesor: " + getIdProfesor());
	}

	public String toString() {
		return super.toString().concat("\nID: ").concat(IdProfesor);
	}

	// Metodo abstracto se debe implementar obligatoriamente en las subclases
	public abstract float importeSalario();

}