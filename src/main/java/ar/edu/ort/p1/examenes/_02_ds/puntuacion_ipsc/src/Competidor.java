package ar.edu.ort.p1.examenes._02_ds.puntuacion_ipsc.src;

public class Competidor {

	private int nroInscripcion;
	private String club;
	private String nombre;
	private String apellido;
	private int puntosObtenidos;

	public Competidor(int nroInscripcion, String club, String nombre, String apellido) {
		this.nroInscripcion = nroInscripcion;
		this.club = club;
		this.nombre = nombre;
		this.apellido = apellido;
		this.puntosObtenidos = 0;
	}

	public int getNroInscripcion() {
		return nroInscripcion;
	}

	public void setNroInscripcion(int nroInscripcion) {
		this.nroInscripcion = nroInscripcion;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getPuntosObtenidos() {
		return puntosObtenidos;
	}

	public void setPuntosObtenidos(int puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}

}
