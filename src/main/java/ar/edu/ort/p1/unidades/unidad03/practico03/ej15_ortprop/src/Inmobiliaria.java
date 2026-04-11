package ar.edu.ort.p1.unidades.unidad03.practico03.ej15_ortprop.src;

import java.util.ArrayList;
import java.util.List;

public class Inmobiliaria implements Notificable {

	private String nombre;
	private String email;
	private String porcentajeDeComision;
	private List<Inmueble> inmuebles;

	/*----------------------------------------------------------------------------*/

	public Inmobiliaria(String nombre, String email, String porcentajeDeComision) {
		this.nombre = nombre;
		this.email = email;
		this.porcentajeDeComision = porcentajeDeComision;
		this.inmuebles = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public void notificar(String mensaje) {
		System.out.println("Hemos recibido un mail en nuestra casilla " + this.email + " con el mensaje: " + mensaje);
	}

	/*----------------------------------------------------------------------------*/

	public void agregarInmueble(Inmueble inmueble) {
		this.inmuebles.add(inmueble);
	}

}
