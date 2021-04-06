package abs.ejemplo01.src;

import java.util.Calendar;

public class ProfesorInterino extends Profesor {

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

	// Metodos
	public Calendar getFechaComienzoInterinidad() {
		return fechaComienzoInterinidad;
	}

	public String toString() { // Sobreescritura del metodo
		return super.toString().concat("\nFecha comienzo interinidad: ")
				.concat(fechaComienzoInterinidad.getTime().toString());
	}

	public float importeNomina() {
		return 30f * 35.60f;
	} // Metodo abstracto sobreescrito en esta clase
}