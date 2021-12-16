package ar.edu.ort.p1.examenes.examenes_conducir.src;

public class Persona {

	private String DNI;
	private String nombre;
	private String mail;

	public Persona(String dNI, String nombre, String mail) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.mail = mail;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
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
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", mail=" + mail + "]";
	}

}
