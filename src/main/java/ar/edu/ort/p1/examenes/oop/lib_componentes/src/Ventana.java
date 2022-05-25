package ar.edu.ort.p1.examenes.oop.lib_componentes.src;

import java.util.ArrayList;

public class Ventana extends Componente {

	private boolean hayCursorActivo;
	private Estado estado;
	private ArrayList<Componente> componentes;

	public Ventana(String color, boolean hablitiado, Tamanio tamanio, Posicion posicion, boolean hayCursorActivo,
			Estado estado) {
		super(color, hablitiado, tamanio, posicion);
		this.hayCursorActivo = hayCursorActivo;
		this.estado = estado;
		this.componentes = new ArrayList<Componente>();
	}

	public Ventana(String texto, String color, boolean hablitiado, Tamanio tamanio, Posicion posicion,
			boolean hayCursorActivo, Estado estado) {
		super(texto, color, hablitiado, tamanio, posicion);
		this.hayCursorActivo = hayCursorActivo;
		this.estado = estado;
		this.componentes = new ArrayList<Componente>();
	}

	/**
	 * Ejercicio B4: En el caso de cualquier ventana: "Dibujando Ventana con los
	 * siguientes componentes: " y a continuacion se deberan dibujar cada componente
	 * que tenga dentro. (en el caso de que ninguno de los componentes de Campo de
	 * Texto que se agregaron a la ventana tenga un cursor activado, activar el
	 * primer Campo de Texto que fue agregado)
	 */
	@Override
	public void dibujar() {
		System.out.println("Dibujando Ventana con los siguientes componentes: ");

		/*
		 * Refactorizacion posible: Preguntar antes del ciclo si no hay ningun cursor
		 * activo. En caso true, buscar el primer CampoDeTexto y activar su cursor.
		 */
		for (Componente comp : this.componentes) {
			activarAlgunCursor(comp);
			comp.dibujar();
		}
	}

	private void activarAlgunCursor(Componente comp) {
		if (!this.hayCursorActivo && comp instanceof CampoDeTexto) {
			((CampoDeTexto) comp).activarCursor(); // downcasting
			this.hayCursorActivo = true;
		}
	}

	/**
	 * Ejercicio C: El metodo agregar de la clase Ventana que debe permitir agregar
	 * sobre la misma cualquier componente excepto si es una Ventana.
	 * 
	 * En caso de que el componente se pueda agregar devolver true caso contrario si
	 * es una Ventana devolver false.
	 * 
	 * @param comp
	 * @return
	 */
	public boolean agregar(Componente comp) {
		boolean sePudoAgregar;
		sePudoAgregar = !(comp instanceof Ventana);
		if (sePudoAgregar) {
			this.componentes.add(comp);
			chequearCursorActivo(comp);
		}
		return sePudoAgregar;
	}

	private void chequearCursorActivo(Componente comp) {
		if (comp instanceof CampoDeTexto) {
			this.hayCursorActivo = ((CampoDeTexto) comp).isCursorActivo();
		}
	}

}
