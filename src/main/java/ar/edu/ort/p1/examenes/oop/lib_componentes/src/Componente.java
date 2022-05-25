package ar.edu.ort.p1.examenes.oop.lib_componentes.src;

public abstract class Componente implements Dibujable {
	private String texto;
	private String color;
	private boolean hablitiado;
	private Tamanio tamanio;
	private Posicion posicion;

	public Componente() {
		super();
	}

	public Componente(String color, boolean hablitiado, Tamanio tamanio, Posicion posicion) {
		super();
		this.color = color;
		this.hablitiado = hablitiado;
		this.tamanio = tamanio;
		this.posicion = posicion;
	}

	public Componente(String texto, String color, boolean hablitiado, Tamanio tamanio, Posicion posicion) {
		super();
		this.texto = texto;
		this.color = color;
		this.hablitiado = hablitiado;
		this.tamanio = tamanio;
		this.posicion = posicion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getAlto() {
		return this.tamanio.getAlto();
	}

	public int getAncho() {
		return this.tamanio.getAncho();
	}

}
