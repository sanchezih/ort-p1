package ar.edu.ort.p1.unidades.unidad01.practico01.ej09_ortify.src;

public class Usuario {

	private String userName;
	private Estado estado;

	/*----------------------------------------------------------------------------*/

	public Usuario(String userName, Estado estado) {
		this.userName = userName;
		this.estado = estado;
	}

	/*----------------------------------------------------------------------------*/

	public String getUserName() {
		return userName;
	}

	@Override
	public String toString() {
		return "Usuario [userName=" + userName + ", estado=" + estado + "]";
	}

}
