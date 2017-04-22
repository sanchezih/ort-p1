package colecciones.ejemplo2;

public class Empleado {

	String nombre;

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	// Sobrecarga del constructor
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "El nomreb es:" + this.nombre;
	}

}
