package ar.edu.ort.p1.examenes.oop.lib_componentes.src;

public class Boton extends Componente {

	public Boton(String texto, String color, boolean hablitiado, Tamanio tamanio, Posicion posicion) {
		super(texto, color, hablitiado, tamanio, posicion);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Ejercicio B1: En el caso de un boton: "Dibujando Botón con el texto: XXX con
	 * un alto de: XXXmm y ancho de: XXXmm".
	 */
	@Override
	public void dibujar() {
		System.out.println("Dibujando Botón con el texto: " + getTexto() + " con un alto de: " + getAlto()
				+ "mm y ancho de: " + getAncho() + "mm");

	}

}
