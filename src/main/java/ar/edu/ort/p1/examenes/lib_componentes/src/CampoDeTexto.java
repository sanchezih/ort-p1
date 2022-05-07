package ar.edu.ort.p1.examenes.lib_componentes.src;

public class CampoDeTexto extends Componente {

	private boolean multitexto;
	private boolean cursorActivo;

	public CampoDeTexto(String texto, String color, boolean hablitiado, Tamanio tamanio, Posicion posicion,
			boolean multitexto, boolean cursorActivo) {
		super(texto, color, hablitiado, tamanio, posicion);
		this.multitexto = multitexto;
		this.cursorActivo = cursorActivo;
	}

	public boolean isCursorActivo() {
		return cursorActivo;
	}

	public void activarCursor() {
		this.cursorActivo = true;
	}

	/**
	 * Ejercicio B2: En el caso de un campo de texto: "Dibujando Campo de Texto XXX
	 * que tiene el cursor ZZZ (donde XXX puede ser "multitexto" o "simple" y ZZZ
	 * "activado" o "desactivado")
	 */
	@Override
	public void dibujar() {

		String tipoCampo;
		String tipoCursor;

		if (this.multitexto) {
			tipoCampo = "multitexto";
		} else {
			tipoCampo = "simple";
		}

		if (this.cursorActivo) {
			tipoCursor = "activado";
		} else {
			tipoCursor = "desactivado";
		}

		System.out.println("Dibujando Campo de Texto " + tipoCampo + " que tiene el cursor " + tipoCursor);

	}

}
