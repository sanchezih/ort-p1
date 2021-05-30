package edu.ort.u5.tad;

public interface Pila<TipoElemento> {

	String ERR_TAM_PILA_ILEGAL = "Tamanio de pila ilegal";
	String ERR_PILA_LLENA = "Pila llena";
	String ERR_PILA_VACIA = "Pila vacia";

	int SIN_LIMITE = -1;
	int LIMITE_MINIMO_POSIBLE = 2;

	void push(TipoElemento element);

	TipoElemento pop();

	TipoElemento peek();

	boolean isEmpty();

	boolean isFull();

}