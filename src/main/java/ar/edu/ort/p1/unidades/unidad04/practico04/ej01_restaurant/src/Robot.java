package ar.edu.ort.p1.unidades.unidad04.practico04.ej01_restaurant.src;

public class Robot {

	private String codigo;
	private int nivelBateria;

	/*----------------------------------------------------------------------------*/

	public Robot(String codigo, int nivelBateria) {
		this.codigo = codigo;
		this.nivelBateria = nivelBateria;
	}

	/*----------------------------------------------------------------------------*/

	public String getCodigo() {
		return codigo;
	}

	public int getNivelBateria() {
		return nivelBateria;
	}

}
