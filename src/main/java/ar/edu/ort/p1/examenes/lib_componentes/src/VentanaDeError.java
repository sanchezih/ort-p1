package ar.edu.ort.p1.examenes.lib_componentes.src;

public class VentanaDeError {

	private Boton botonAceptar;
	private Etiqueta etiquetaError;

	/**
	 * Ejercicio D: Un constructor con parametros para la VentanaDeError que permita
	 * ingresar el texto de error.
	 * 
	 * @param botonAceptar
	 * @param etiquetaMensajeError
	 */
	public VentanaDeError(Boton botonAceptar, Etiqueta etiquetaMensajeError) {
		super();
		this.botonAceptar = botonAceptar;
		this.etiquetaError = etiquetaMensajeError;
	}

}
