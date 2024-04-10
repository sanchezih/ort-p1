package ar.edu.ort.p1.unidades.unidad03.ejemplos._03_polimorfismo_basado_en_herencia._02_seleccion_de_futbol.src;

public class Masajista extends IntegranteDeSeleccion {

	private String posicion;
	private int aniosExperiencia;

	/*----------------------------------------------------------------------------*/

	public Masajista() {
		super();
	}

	public Masajista(int id, String nombre, String apellido, int edad, String posicion, int aniosExperiencia) {
		super(id, nombre, apellido, edad);
		this.posicion = posicion;
		this.aniosExperiencia = aniosExperiencia;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public void participarEnEntrenamiento() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido()
				+ " y estoy dando asistencia en el entrenamiento (Clase Masajista - Override)");
	}

	public void darMasaje() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido() + " y estoy dando un masaje");
	}

}
