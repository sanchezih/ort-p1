package ar.edu.ort.p1.unidades.u5.ejemplos.tda.lista_ordenada;

public class Empleado {
	private String nombre;
	private int edad;
	private Automovil automovil;

	public Empleado(String nombre, int edad, Automovil automovil) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.automovil = automovil;
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

	public Automovil getAutomovil() {
		return automovil;
	}

	public void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", \tedad=" + edad + ", \tautomovil=" + automovil + "]";
	}

}
