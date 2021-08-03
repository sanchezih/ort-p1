package ar.edu.ort.p1.u1.practico01.ej03_ort_informes_carreras.src;

public class AlumnoSimplificado {

	private String nombre;
	private String mail;

	public AlumnoSimplificado(String nombre, String mail) {
		super();
		this.nombre = nombre;
		this.mail = mail;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "AlumnoSimplificado [nombre=" + nombre + ", mail=" + mail + "]";
	}

}
