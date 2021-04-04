package abs.ejemplo01.src;

import java.util.Calendar;

public class ProfesorInterino extends Profesor {

	// Campo de la clase ejemplo aprenderaprogramar.com

	private Calendar fechaComienzoInterinidad;

// Constructores

	public ProfesorInterino(Calendar fechaInicioInterinidad) {

		super();
		fechaComienzoInterinidad = fechaInicioInterinidad;
	}

	public ProfesorInterino(String nombre, String apellidos, int edad, String id, Calendar fechaInicioInterinidad) {

		super(nombre, apellidos, edad, id);

		fechaComienzoInterinidad = fechaInicioInterinidad;
	}

	public Calendar getFechaComienzoInterinidad() {
		return fechaComienzoInterinidad;
	} // Método

	public String toString() { // Sobreescritura del método

		return super.toString().concat(" Fecha comienzo interinidad: ")
				.concat(fechaComienzoInterinidad.getTime().toString());
	}

	public float importeNomina() {
		return 30f * 35.60f;
	} // Método abstracto sobreescrito en esta clase

} // Cierre de la clase