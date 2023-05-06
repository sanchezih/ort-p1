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

	public Domicilio getDomicilio() {
		return domicilio;
	}

}
