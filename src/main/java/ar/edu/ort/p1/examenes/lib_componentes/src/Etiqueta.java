package ar.edu.ort.p1.examenes.lib_componentes.src;

public class Etiqueta extends Componente {

	private String fuente;

	public Etiqueta(String texto, String color, boolean hablitiado, Tamanio tamanio, Posicion posicion, String fuente) {
		super(texto, color, hablitiado, tamanio, posicion);
		this.fuente = fuente;
	}

	public String getFuente() {
		return fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	/**
	 * Ejercicio B3: En el caso de una etiqueta: "Dibujando Etiqueta con el texto
	 * XXX con fuente XXX"
	 */
	@Override
	public void dibujar() {
		System.out.println("Dibujando Etiqueta con el texto " + getTexto() + " con fuente " + getFuente());
	}

}
