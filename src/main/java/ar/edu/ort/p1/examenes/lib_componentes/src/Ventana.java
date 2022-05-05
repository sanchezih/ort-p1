package ar.edu.ort.p1.examenes.lib_componentes.src;

import java.util.ArrayList;

public class Ventana extends Componente {

	private Estado estado;
	private ArrayList<Componente> componentes;
	private boolean hayCursorActivo;

	/**
	 * El método dibujar() que debe mostrar por consola los siguientes datos: En el
	 * caso de cualquier ventana: “Dibujando Ventana con los siguientes componentes:
	 * ” y a continuación se deberán dibujar cada componente que tenga dentro. (en
	 * el caso de que ninguno de los componentes de Campo de Texto que se agregaron
	 * a la ventana tenga un cursor activado, activar el primer Campo de Texto que
	 * fue agregado)
	 * 
	 */
	@Override
	public void dibujar() {
		System.out.println("Dibujando Ventana con los siguientes componentes: ");

		for (Componente componente : componentes) {
			componente.dibujar();
			activarAlgunCursor(componente);
		}
	}

	private void activarAlgunCursor(Componente componente) {
		if (!hayCursorActivo && componente instanceof CampoDeTexto) {
			((CampoDeTexto) componente).activarCursor();
			hayCursorActivo = true;
		}
	}

	private void chequearCursorActivo(Componente componente) {
		if (componente instanceof CampoDeTexto) {
			hayCursorActivo = ((CampoDeTexto) componente).estaCursorActivado();
		}
	}

	/**
	 * Ejercicio C: El metodo agregar de la clase Ventana que debe permitir agregar
	 * sobre la misma cualquier componente excepto si es una Ventana. En caso de que
	 * el componente se pueda agregar devolver true caso contrario si es una Ventana
	 * devolver false.
	 */
	public boolean agregar(Componente componente) {
		boolean sePudoAgregar = false;
		if (!(componente instanceof Ventana)) { // IHS
			chequearCursorActivo(componente);
			componentes.add(componente);
			sePudoAgregar = true;

		}
		return sePudoAgregar;
	}
}
