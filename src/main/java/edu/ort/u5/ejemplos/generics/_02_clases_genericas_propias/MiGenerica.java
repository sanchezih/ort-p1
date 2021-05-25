package edu.ort.u5.ejemplos.generics._02_clases_genericas_propias;

public class MiGenerica<T> {
	private T primero;

	public MiGenerica() {
		primero = null;
	}

	public T getPrimero() {
		return primero;
	}

	public void setPrimero(T primero) {
		this.primero = primero;
	}

}
