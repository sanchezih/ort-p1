package ar.edu.ort.p1.unidades.unidad04.practico04.ej01_restaurant.src;

public class Cajero {

	private int id;
	private String apellido;
	private int antiguedad;

	/*----------------------------------------------------------------------------*/

	public Cajero(int id, String apellido, int antiguedad) {
		this.id = id;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
	}

	/*----------------------------------------------------------------------------*/

	public String getApellido() {
		return apellido;
	}

	@Override
	public String toString() {
		return "Cajero [id=" + id + ", apellido=" + apellido + ", antiguedad=" + antiguedad + "]";
	}

}
