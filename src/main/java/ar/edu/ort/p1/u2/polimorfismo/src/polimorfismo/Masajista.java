package ar.edu.ort.p1.u2.polimorfismo.src.polimorfismo;

public class Masajista extends IntegranteDeSeleccion {

	private String posicion;
	private int aniosExperiencia;

	public Masajista() {
		super();
	}

	public Masajista(int id, String nombre, String apellido, int edad, String posicion, int aniosExperiencia) {
		super(id, nombre, apellido, edad);
		this.posicion = posicion;
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public void participarEnEntrenamiento() {
		System.out.println("Soy " + this.getNombre() + " " + this.getApellido()
				+ " y estoy dando asistencia en el entrenamiento (Clase Masajista - Override)");
	}

	public void darMasaje() {
		System.out.println("Soy " + this.getNombre() + " " + this.getApellido() + " y estoy dando un masaje");
	}

}
