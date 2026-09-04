package ar.edu.ort.p1.examenes._01_oop.gestor_pedidos.src;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Item {

	private float descuento;
	private int pesoAcumulado;
	private float precioAcumulado;
	private List<Item> items;

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: Los metodos constructores de todos los tipos de Items que
	 * encuentres
	 * 
	 * @param nombre
	 * @param descuento
	 * @param pesoAcumulado
	 * @param precioAcumulado
	 * @param items
	 */
	public Combo(String nombre, float descuento) {
		super(nombre);
		this.descuento = descuento;
		this.pesoAcumulado = 0;
		this.precioAcumulado = 0;
		this.items = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo obtenerPrecio() de todas las clases que consideres,
	 * que debe calcular el precio del item según lo especificado
	 */
	@Override
	public float obtenerPrecio() {
		return this.precioAcumulado * (1 - descuento / 100);
	}

	/**
	 * Ejercicio D: El metodo obtenerPeso() de todas las clases que consideres, que
	 * debe calcular el peso del item segun lo especificado
	 */
	@Override
	public int obtenerPeso() {
		return this.pesoAcumulado;
	}

	/**
	 * Ejercicio G: El metodo agregarItem() de la clase que consideres, que permita
	 * agregar elementos al Combo (asumir que el item a agregar jamas sera nulo)
	 * 
	 * @param item
	 */
	public void agregarItem(Item item) {
		this.items.add(item);
		this.pesoAcumulado = this.pesoAcumulado + item.obtenerPeso();
		this.precioAcumulado = this.precioAcumulado + item.obtenerPrecio();
	}

}
