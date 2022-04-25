package ar.edu.ort.p1.unidades.u5.ejemplos.tda.pila.pila_generica_con_lista_enlazada;


public class PilaGenericaListaEnlazada<T> {

	private Nodo<T> end;
	private int tamanio;

	public PilaGenericaListaEnlazada() {
		end = null;
		tamanio = 0;
	}

	public void push(T elemento) {
		Nodo<T> nuevoNodo = new Nodo<T>(elemento);
		if (end == null)
			end = nuevoNodo;
		else {
			nuevoNodo.setNext(end);
			end = nuevoNodo;
		}
		tamanio++;
	};

	public T pop() {
		T elemento = null;

		if (end != null) {
			elemento = end.getElemento();
			end = end.getNext();
			tamanio--;
		}
		return elemento;
	}

	public boolean isEmpty() {
		return (tamanio == 0);
	}

	public int size() {
		return tamanio;
	}

	public T end() {
		T res = null;
		if (end != null) {
			res = end.getElemento();
		}
		return res;
	}

	
}