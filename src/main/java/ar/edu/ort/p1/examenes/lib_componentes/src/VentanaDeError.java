package ar.edu.ort.p1.examenes.lib_componentes.src;

public class VentanaDeError extends Ventana {

	private Etiqueta etiquetaError;
	private Boton botonAceptar;

	/**
	 * Con este enfoque no haria falta sobrescribir el 'dibujar'
	 * 
	 * @param textoDelError
	 */
	public VentanaDeError(String textoDelError, String color, boolean hablitiado, Tamanio tamanio, Posicion posicion,
			boolean hayCursorActivo, Estado estado) {

		super(color, hablitiado, tamanio, posicion, hayCursorActivo, estado);

		this.etiquetaError = new Etiqueta(null, null, true, null, null, null);
		this.botonAceptar = new Boton(null, null, true, new Tamanio(640, 480), new Posicion(100, 100));
		etiquetaError.setTexto(textoDelError);
		botonAceptar.setTexto("Aceptar");
		agregar(etiquetaError);
		agregar(botonAceptar);

	}

	/**
	 * Con este enfoque si haria falta sobrescribir el 'dibujar'
	 * 
	 * @param textoDelError
	 */
//	public VentanaDeError(String textoDelError) {
//		this.etiquetaError = new Etiqueta();
//		this.botonAceptar = new Boton();
//		etiquetaError.setTexto(textoDelError);
//		botonAceptar.setTexto("Aceptar");
//
//	}

}
