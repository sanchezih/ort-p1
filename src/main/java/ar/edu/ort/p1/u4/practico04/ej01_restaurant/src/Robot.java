package ar.edu.ort.p1.u4.practico04.ej01_restaurant.src;

public class Robot {
	private String codigo;
	private int nivelBateria;

	public Robot(String codigo, int nivelBateria) {
		this.codigo = codigo;
		this.nivelBateria = nivelBateria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}

}
