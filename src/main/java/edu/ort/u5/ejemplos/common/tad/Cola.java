package edu.ort.u5.ejemplos.common.tad;

public interface Cola<TipoElemento> {

	String ERR_TAM_ILEGAL = "Tamanio definido ilegal";
	String ERR_COLA_LLENA = "Cola llena";
	String ERR_COLA_VACIA = "Cola vacia";

	int SIN_LIMITE = -1;
	int LIMITE_MINIMO_POSIBLE = 2;

	void add(TipoElemento element);

	TipoElemento remove();

	TipoElemento get();

	boolean isEmpty();

	boolean isFull();

}