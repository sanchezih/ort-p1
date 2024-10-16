package ar.edu.ort.p1.examenes._02_ds.biblioteca.src;

public abstract class Usuario {

	private static final int CANT_MAX_MULTAS = 2;

	private int edad;
	private String nombre;
	private String dni;
	private MultasPorGravedad multas;

	/*----------------------------------------------------------------------------*/

	public Usuario(int edad, String nombre, String dni) {
		this.edad = edad;
		this.nombre = nombre;
		this.dni = dni;
		this.multas = new MultasPorGravedad();
	}

	/*----------------------------------------------------------------------------*/

	public int getEdad() {
		return edad;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public boolean puedeReservarLibro() {
		return cumpleMultasGravesPendientes() && cumpleReglaEspecifica();
	}

	/**
	 * 
	 * @return
	 */
	private boolean cumpleMultasGravesPendientes() {
		int cantMultasPendientesGraves = 0;
		boolean tieneMultasPendientes = true;
		int i = 0;

		while (i < multas.size() && cantMultasPendientesGraves <= CANT_MAX_MULTAS
				&& multas.get(i).getGravedad() == Gravedad.GRAVE) {
			/*
			 * No hace falta verificar si la multa es grave, porque si no fuese grave no
			 * entra al while
			 */

			if (!multas.get(i).estaResuelta()) {
				cantMultasPendientesGraves++;
			}
			i++;
		}
		return cantMultasPendientesGraves <= CANT_MAX_MULTAS;
	}

	protected abstract boolean cumpleReglaEspecifica();

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param edadMinima
	 * @return
	 */
	public boolean mayorQue(int edadMinima) {
		return edad >= edadMinima;
	}

}
