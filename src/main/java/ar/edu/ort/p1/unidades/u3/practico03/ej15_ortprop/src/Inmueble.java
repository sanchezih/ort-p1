package ar.edu.ort.p1.unidades.u3.practico03.ej15_ortprop.src;

import java.util.ArrayList;

public class Inmueble {

	private String domicilio;
	private String superficieEnM2;
	private int cantidadDeAmb;
	private double precio;
	private ArrayList<Notificable> interesados;

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
	 */
	public void setPrecio(double nuevoPrecio) {
		String mensaje;
		mensaje = armarMensaje(this.precio, nuevoPrecio);
		this.precio = nuevoPrecio;

		for (Notificable n : this.interesados) {
			n.notificar(mensaje);
		}

	}

	private String armarMensaje(double precioViejo, double precioNuevo) {
		String elMensaje;
		elMensaje = "El inmueble " + toString() + " por el que ha demostrado interes cambio su precio de ";
		elMensaje += precioViejo + " a " + precioNuevo;
		return elMensaje;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "[" + domicilio + "]";
	}

	public void agregarInteresado(Notificable n) {
		this.interesados.add(n);
	}

}
