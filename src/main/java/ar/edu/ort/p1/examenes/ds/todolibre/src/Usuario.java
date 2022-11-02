package ar.edu.ort.p1.examenes.ds.todolibre.src;

public class Usuario {

	private int numero;
	private String nombre;
	private String dni;
	private Domicilio domicilio;

	public Usuario(int numero, String nombre, String dni, Domicilio domicilio) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.dni = dni;
		this.domicilio = domicilio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

}
