package edu.ort.u3.ejemplos.herenciaAnimales.src.animales;

public class Perro extends Animal {

	private String raza;

	public Perro(String nombre, String tipo_alimentacion, int edad, String raza) {
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