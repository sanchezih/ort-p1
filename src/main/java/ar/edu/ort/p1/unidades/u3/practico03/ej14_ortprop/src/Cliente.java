package ar.edu.ort.p1.unidades.u3.practico03.ej14_ortprop.src;

public class Cliente implements Notificable {

	private String apellido;
	private String nombre;
	private String telefono;
	private String email;

	public Cliente(String apellido, String nombre, String telefono, String email) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}

	@Override
	public void recibirNotificacion(String mensaje) {
		System.out.println("He recibido un SMS en mi teléfono " + this.telefono + " con el mensaje: " + mensaje);
	}

}
