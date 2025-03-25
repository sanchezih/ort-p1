package ar.edu.ort.p1.unidades.unidad01.practico01.ej03_ort_informes_carreras.src;

public class Materia {

	private String nombre;
	private String cuatrimestre;
	private Estado estado;

	/*----------------------------------------------------------------------------*/

	public Materia(String nombre, String cuatrimestre, Estado estado) {
		this.nombre = nombre;
		this.cuatrimestre = cuatrimestre;
		this.estado = estado;
	}

	/*----------------------------------------------------------------------------*/

	public Estado getEstado() {
		return estado;
	}

}
