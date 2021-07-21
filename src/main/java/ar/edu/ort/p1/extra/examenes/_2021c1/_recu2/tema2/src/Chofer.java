package ar.edu.ort.p1.extra.examenes._2021c1._recu2.tema2.src;

public class Chofer implements Identificable {

	private int nroLegajo;
	private String nombre;
	private int edad;

	public Chofer(int nroLegajo, String nombre, int edad) {
		super();
		this.nroLegajo = nroLegajo;
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getNroLegajo() {
		return nroLegajo;
	}

	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
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
	public void mostrarID() {
		System.out.println(this.nroLegajo);
	}

	@Override
	public String toString() {
		return "[" + nombre + "]";
	}

}
