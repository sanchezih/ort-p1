package ar.edu.ort.p1.examenes._02_ds.fiscalizador_de_empleados.src;

public class Cargo {

	private String nombreInstitucion;
	private int cantHoras;
	private Nivel tipo;

	/*----------------------------------------------------------------------------*/

	public Cargo(String nombreInstitucion, int cantHoras, Nivel tipo) {
		this.nombreInstitucion = nombreInstitucion;
		this.cantHoras = cantHoras;
		this.tipo = tipo;
	}

	/*----------------------------------------------------------------------------*/

	public Nivel getTipo() {
		return tipo;
	}

}
