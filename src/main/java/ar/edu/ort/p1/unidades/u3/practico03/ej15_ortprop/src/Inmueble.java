package ar.edu.ort.p1.unidades.u3.practico03.ej15_ortprop.src;

import java.util.ArrayList;

public class Inmueble {

	private String domicilio;
	private String superficieEnM2;
	private int cantidadDeAmb;
	private double precio;
	private ArrayList<Notificable> interesados;

	/*----------------------------------------------------------------------------*/

	public Inmueble(String domicilio, String superficieEnM2, int cantidadDeAmb, double precio) {
		super();
		this.domicilio = domicilio;
		this.superficieEnM2 = superficieEnM2;
		this.cantidadDeAmb = cantidadDeAmb;
		this.precio = precio;
		this.interesados = new ArrayList<Notificable>();
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
		String mensaje;
		mensaje = "El inmueble " + toString() + " por el que ha demostrado interes cambio su precio de ";
		mensaje += precioViejo + " a " + precioNuevo;
		return mensaje;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "[" + domicilio + "]";
	}

	public void agregarInteresado(Notificable notificable) {
		this.interesados.add(notificable);
	}

}
