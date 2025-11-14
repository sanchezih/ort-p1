package ar.edu.ort.p1.examenes._02_ds.generador_de_actas_para_finales.src;

public abstract class Alumno {

	public static final int NOTA_APR = 4;
	public static final int NOTA_FT = 7;

	private int dni;
	private String nombre;
	private int nroCurso;
	private int notaCursada;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param nroCurso
	 * @param notaCursada
	 */
	public Alumno(int dni, String nombre, int nroCurso, int notaCursada) {
		this.dni = dni;
		this.nombre = nombre;
		this.nroCurso = nroCurso;
		this.notaCursada = notaCursada;
	}

	/*----------------------------------------------------------------------------*/

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
