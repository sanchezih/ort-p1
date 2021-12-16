package ar.edu.ort.p1.unidades.u3.practico03.ej14_ortprop.src;

import java.util.ArrayList;

public class Inmueble {
	private String domicilio;
	private String superficieEnM2;
	private int cantidadDeHamb;
	private double precio;
	private ArrayList<Notificable> interesados;

	public Inmueble(String domicilio, String superficieEnM2, int cantidadDeHamb, double precio) {
		this.domicilio = domicilio;
		this.superficieEnM2 = superficieEnM2;
		this.cantidadDeHamb = cantidadDeHamb;
		this.precio = precio;
		this.interesados = new ArrayList<Notificable>();
	}

	/**
	 * Ejercicio B: El metodo setPrecio de la clase Inmueble.
	 * 
	 * @param nuevoPrecio
	 */
	public void setPrecio(double nuevoPrecio) {
		double precioViejo;
		String mensaje;

		precioViejo = this.precio;
		this.precio = nuevoPrecio;
		mensaje = armarMensaje(precioViejo, this.precio);
		for (Notificable n : this.interesados) {
			n.recibirNotificacion(mensaje);
		}
	}

	private String armarMensaje(double precioViejo, double precioNuevo) {
		String elMensaje;
		elMensaje = "El inmueble " + toString() + " por el que ha demostrado interés cambió su precio de ";
		elMensaje += precioViejo + " a " + precioNuevo;
		return elMensaje;
	}

	public void mostrarDatos() {

	}

}
