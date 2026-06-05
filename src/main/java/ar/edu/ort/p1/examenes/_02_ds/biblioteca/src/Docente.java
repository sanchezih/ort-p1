package ar.edu.ort.p1.examenes._02_ds.biblioteca.src;

public class Docente extends Usuario {

	private static final int AUSENCIAS_MAX = 1;

	private String titulo;
	private int cantAusencias;

	/*----------------------------------------------------------------------------*/

	public Docente(int edad, String nombre, String dni, String titulo, int cantAusencias) {
		super(edad, nombre, dni);
		this.titulo = titulo;
		this.cantAusencias = cantAusencias;
	}

	/*----------------------------------------------------------------------------*/

	public boolean cumpleReglaEspecifica() {
		return cantAusencias <= AUSENCIAS_MAX;
	}

}
