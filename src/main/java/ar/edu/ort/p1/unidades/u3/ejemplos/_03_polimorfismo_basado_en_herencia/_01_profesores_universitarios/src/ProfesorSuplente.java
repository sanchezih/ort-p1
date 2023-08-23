package ar.edu.ort.p1.unidades.u3.ejemplos._03_polimorfismo_basado_en_herencia._01_profesores_universitarios.src;

import java.util.Calendar;

public class ProfesorSuplente extends Profesor {

	private Calendar fechaComienzoSuplencia;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param fechaInicioSuplencia
	 */
	public ProfesorSuplente(Calendar fechaInicioSuplencia) {
		super();
		this.fechaComienzoSuplencia = fechaInicioSuplencia;
	}

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param id
	 * @param fechaInicioSuplencia
	 */
	public ProfesorSuplente(String nombre, String apellido, int edad, String id, Calendar fechaInicioSuplencia) {
		super(nombre, apellido, edad, id);
		this.fechaComienzoSuplencia = fechaInicioSuplencia;
	}

	/*----------------------------------------------------------------------------*/

	public Calendar getFechaComienzoSuplencia() {
		return this.fechaComienzoSuplencia;
	}

	/**
	 * El metodo sobreescrito toString() de la clase ProfesorSuplente llama al
	 * metodo toString() de la superclase y lo concatena con nuevas cadenas.
	 */
	@Override
	public String toString() {
		return super.toString().concat("\nComienzo suplencia: ").concat(this.fechaComienzoSuplencia.getTime().toString());
	}

	/**
	 * Metodo abstracto sobreescrito
	 */
	@Override
	public float importeSalario() {
		return 30f * 10f;
	}
}