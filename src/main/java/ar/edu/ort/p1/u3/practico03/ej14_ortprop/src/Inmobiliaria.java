package ar.edu.ort.p1.u3.practico03.ej14_ortprop.src;

import java.util.ArrayList;

public class Inmobiliaria implements Notificable {

	private String nombre;
	private String email;
	private String porcentajeComision;
	private ArrayList<Inmueble> inmuebles;

	public Inmobiliaria(String nombre, String email, String porcentajeComision) {
		this.nombre = nombre;
		this.email = email;
		this.porcentajeComision = porcentajeComision;
		this.inmuebles = new ArrayList<Inmueble>();
	}

	@Override
	public void recibirNotificacion(String mensaje) {
		System.out.println("Hemos recibido un mail en nuestra casilla " + this.email + " con el mensaje: " + mensaje);
	}

}
