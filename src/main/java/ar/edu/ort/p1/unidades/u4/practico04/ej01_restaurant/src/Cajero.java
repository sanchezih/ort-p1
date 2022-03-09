package ar.edu.ort.p1.unidades.u4.practico04.ej01_restaurant.src;

public class Cajero {

	private int id;
	private String apellido;
	private int antiguedad;

	public Cajero(int id, String apellido, int antiguedad) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Cajero [id=" + id + ", apellido=" + apellido + ", antiguedad=" + antiguedad + "]";
	}

}
