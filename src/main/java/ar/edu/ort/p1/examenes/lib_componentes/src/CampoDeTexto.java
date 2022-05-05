package ar.edu.ort.p1.examenes.lib_componentes.src;

public class CampoDeTexto extends Componente {

	private boolean multitexto;
	private boolean cursorActivo;

	/**
	 * El método dibujar() que debe mostrar por consola los siguientes datos: En el
	 * caso de un campo de texto: “Dibujando Campo de Texto XXX que tiene el cursor
	 * ZZZ (donde XXX puede ser “multitexto” o “simple” y ZZZ “activado” o
	 * “desactivado”)
	 */
	@Override
	public void dibujar() {
		String tipo = multitexto ? " multitexto " : " simple ";
		String estadoCursor = cursorActivo ? "activado" : "desactivado";

		// Invocar directamente a las propiedades privadas
		System.out.println("Dibujando Campo de Texto" + tipo + "que tiene el cursor " + estadoCursor);
	}

	public boolean estaCursorActivado() {
		return cursorActivo;
	}

	public void activarCursor() {
		cursorActivo = true;
	}

}
