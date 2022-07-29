package ar.edu.ort.p1.util.pojo;

public class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private int edad;

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;

	}

	public Persona(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
//	@Override
//	public String toString() {
//		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
//	}

}
