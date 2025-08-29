package ar.edu.ort.p1.unidades.unidad03.practico03.ej15_ortprop.src;

import java.util.ArrayList;
import java.util.List;

public class Inmueble {

	private String domicilio;
	private String superficieEnM2;
	private int cantidadDeAmbientes;
	private double precio;
	private List<Notificable> interesados;

	/*----------------------------------------------------------------------------*/

	public Inmueble(String domicilio, String superficieEnM2, int cantidadDeAmbientes, double precio) {
		this.domicilio = domicilio;
		this.superficieEnM2 = superficieEnM2;
		this.cantidadDeAmbientes = cantidadDeAmbientes;
		this.precio = precio;
		this.interesados = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: El metodo setPrecio de la clase Inmueble.
	 * 
	 * @param nuevoPrecio
	 */
	public void setPrecio(double nuevoPrecio) {

		String mensaje = armarMensaje(this.precio, nuevoPrecio);
		this.precio = nuevoPrecio;

		for (Notificable notificable : this.interesados) {
			notificable.notificar(mensaje);
		}

	}

	/**
	 * 
	 * @param precioViejo
	 * @param precioNuevo
	 * @return
	 */
	private String armarMensaje(double precioViejo, double precioNuevo) {
		return "El inmueble " + toString() + " por el que ha demostrado interes cambio su precio de " + precioViejo
				+ " a " + precioNuevo;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "Calle " + domicilio;
	}

	public void agregarInteresado(Notificable notificable) {
		this.interesados.add(notificable);
	}

}
