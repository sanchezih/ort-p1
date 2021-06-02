package edu.ort.tp1.u5.tda;

public interface ListaOrdenada<K, T> extends Tda, Sizeable, Iterable<T> {
	static final String MSG_INVALID_KEY = "Clave invalida";
	static final String MSG_INDEX_OUT_OF_RANGE = "Indice fuera de rango: El maximo es %d";
	static final String MSG_NULL_NODE = "El nodo es null";
	static final String MSG_ELEM_IS_NULL = "El elemento no puede ser Null";

	void add(T newElement);

	int compare(T dato1, T dato2);

	int compareByKey(K clave, T elemento);

	public boolean exists(K key);

	T get(int pos);
	
	boolean remove(T elem);

	T removeAt(int pos);

	T removeByKey(K key);

	T search(K key);

}
