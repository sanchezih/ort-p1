package edu.ort.herenciaSeleccionEsp.src.seleccion;

public class Entrenador extends IntegranteDeSeleccion {

	private String idFederacion;

	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	public void dirigirPartido() {
		System.out.println("Soy " + this.getNombre() + " " + this.getApellido() + " y estoy dirigiendo un partido...");
	}

	public void dirigirEntrenamiento() {
		System.out.println(
				"Soy " + this.getNombre() + " " + this.getApellido() + " y estoy dirigiendo un entrenamiento...");
	}

}
