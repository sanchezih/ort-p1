package ar.edu.ort.p1.u2.ejemplos._01_herencia.herenciaAnimales.src.animales;

public class Gato extends Animal {

	private String raza;

	public Gato(String nombre, String tipo_alimentacion, int edad, String raza) {
		super(nombre, tipo_alimentacion, edad);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void mostrar() {
		System.out.println("Nombre: " + getNombre() + " | " + "Tipo de alimentacion: " + getTipo_alimentacion() + " | "
				+ "Edad: " + getEdad() + " | " + "Raza: " + getRaza());
	}
}