package abs.ejemplo01.src;

import java.util.Calendar;

public class ProfesorSuplente extends Profesor {

	private Calendar fechaComienzoSuplencia;

	// Constructores
	public ProfesorSuplente(Calendar fechaInicioSuplencia) {

		super();
		fechaComienzoSuplencia = fechaInicioSuplencia;
	}

	public ProfesorSuplente(String nombre, String apellido, int edad, String id, Calendar fechaInicioSuplencia) {
		super(nombre, apellido, edad, id);
		fechaComienzoSuplencia = fechaInicioSuplencia;
	}

	// Metodos
	public Calendar getFechaComienzoSuplencia() {
		return fechaComienzoSuplencia;
	}

	public String toString() { // Sobreescritura del metodo
		return super.toString().concat("\nComienzo suplencia: ")
				.concat(fechaComienzoSuplencia.getTime().toString());
	}

	// Metodo abstracto sobreescrito
	@Override
	public float importeSalario() {
		return 30f * 10f;
	}
}