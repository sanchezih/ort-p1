package ar.edu.ort.p1.unidades.u3.practico03.ej15_ortprop.src;

public class Cliente implements Notificable {

	private String apellido;
	private String nombre;
	private String telefono;
	private String email;

	public Cliente(String apellido, String nombre, String telefono, String email) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}

	@Override
	public void notificar(String mensaje) {
		System.out.println("He recibido un SMS en mi telefono " + this.telefono + " con el mensaje: " + mensaje);

	}

}
