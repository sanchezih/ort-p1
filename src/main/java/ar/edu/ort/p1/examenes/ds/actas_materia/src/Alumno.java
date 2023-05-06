package ar.edu.ort.p1.examenes.ds.actas_materia.src;

public abstract class Alumno {

	public final static int NOTA_APR = 4;
	public final static int NOTA_FT = 7;

	private int dni;
	private String nombre;
	private int nroCurso;
	private int notaCursada;

	/*----------------------------------------------------------------------------*/

	public Alumno(int dni, String nombre, int nroCurso, int notaCursada) {
		this.dni = dni;
		this.nombre = nombre;
		this.nroCurso = nroCurso;
		this.notaCursada = notaCursada;
	}

	/*----------------------------------------------------------------------------*/

	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNroCurso() {
		return nroCurso;
	}

	public int getNotaCursada() {
		return notaCursada;
	}

	public abstract CategoriaExamen getCategoriaExamen();

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", nroCurso=" + nroCurso + ", notaCursada=" + notaCursada
				+ "]";
	}

}
