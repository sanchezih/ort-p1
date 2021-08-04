package ar.edu.ort.p1.u2.ejemplos._01_herencia.herenciaAnimales.src.animales;

public class Animal {

	private String nombre, tipoAlimentacion;
	private int edad;

	public Animal(String nombre, String tipo_alimentacion, int edad) {
		this.nombre = nombre;
		this.tipoAlimentacion = tipo_alimentacion;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo_alimentacion() {
		return tipoAlimentacion;
	}

	public void setTipo_alimentacion(String tipo_alimentacion) {
		this.tipoAlimentacion = tipo_alimentacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}